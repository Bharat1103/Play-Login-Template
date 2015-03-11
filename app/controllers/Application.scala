package controllers

import play.api._
import play.api.mvc._
import play.api.db.slick._
import play.api.Play.current
import views._
import models._
import play.api.data._
import play.api.data.Forms._
import org.joda.time.LocalDateTime
import java.util.Date
import java.io.File
import javax.imageio.ImageIO
import java.io.FileInputStream
import play.api.libs.Files.TemporaryFile

object Application extends Controller with Application {

  val myWebUsers: WebUsersTrait = WebUsers

}

trait Application extends Controller {
  this: Controller =>

  val myWebUsers: WebUsersTrait

  val regform = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> email,
      "password" -> nonEmptyText,
      "phone" -> longNumber,
      "address" -> nonEmptyText,
      "company" -> nonEmptyText,
      "created" -> ignored(LocalDateTime.now()),
      "updated" -> ignored(LocalDateTime.now()),
      "usertype" -> ignored(2),
      "id" -> ignored(Some(0): Option[Int]))(User.apply)(User.unapply))

  val loginform = Form(
    tuple(
      "email" -> email,
      "password" -> nonEmptyText))

  /**
   * renders the Home page
   *
   * @param page : represents the title of the page.
   * @param email : authentic email of the user entered while login or "Guest" as default.
   * @param logedIn : boolean value representing if user is loged in the system.
   */
  def home(page: String, email: String, logedIn: Boolean) = Action { implicit rs =>
    Ok(html.home("Home", email, logedIn))
  }

  /**
   * renders Login page
   */
  def login = Action { implicit rs =>
    Ok(html.login("Login", loginform))
  }

  /**
   * renders Register form and redirects to login page on successful registration.
   * Creates a user record in the database if the chosen email does not already exist in the system.
   */
  def registerme = DBAction { implicit rs =>
    regform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.register("Register", formWithErrors)),
      user => {
        val findDetails = myWebUsers.getData(user.email).getOrElse("Not Found")
        if (findDetails != "Not Found") {

          val flash = play.api.mvc.Flash(Map("failedCreate" -> s"WebUser ${user.email} already exist"))
          Ok(html.register("Register", regform)(flash))
        } else {
          myWebUsers.create(user)
          //For Testing without mocking
          if (user.email == "Test@knoldus.com")
            myWebUsers.delete("Test@knoldus.com")
          Redirect(routes.Application.login).flashing("successCreate" -> s"WebUser ${user.name} created, please Login")
        }
      })
  }

  /**
   * @param email : registered email of the user / takes the value of the email with which
   *                user has loged into the system, value originates from the session variable.
   *
   * renders the Profile page of the user after successful update / redirects to the login page
   * if the session of the user has expired or does not exist to begin with.
   *
   * Make updates in the profile details of the user depending on the Update Form filled by the user.
   *
   * Invoked as the POST action of the Update Form
   */
  def update(email: String) = DBAction { implicit rs =>
    regform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.updateprofile("Edit User", email, formWithErrors)),
      user => {
        val webuser = myWebUsers.getData(email)

        webuser match {
          case Some(record: User) => {
            val createdOriginal = record.created
            val updatedUser = user.copy(id = record.id, created = createdOriginal, email = email)
            myWebUsers.updateUser(updatedUser, record.id.get)
            val flash = play.api.mvc.Flash(Map("successUpdate" -> s"WebUser ${updatedUser.name} has been updated"))
            Ok(html.myprofile("Profile", email)(flash))
          }
          case None => Redirect(routes.Application.login).flashing("failed" -> "Cannot Fetch Your Profile, Please Login First")
        }
      })
  }

  /**
   * @param page : contains the title of the page / default "Edit".
   * @param email : email address retrieved from the session variable / default "Guest"
   *
   * renders and fills the required details of the user in the Update Form, if the registered
   * email address of the user is in the session.
   *
   * Redirects to the login page otherwise.
   */
  def updateprofile(page: String, email: String) = DBAction { implicit rs =>
    rs.session.get("email") match {
      case Some(email) => {
        val existingData = myWebUsers.getData(email).get
        Ok(html.updateprofile("Edit", email, regform.fill(existingData)))
      }
      case None => Redirect(routes.Application.login).flashing("failed" -> "Cannot Fetch Your Profile, Please Login First")

    }
  }

  /**
   * renders the Register Form
   */
  def register = Action { implicit rs =>
    Ok(html.register("Register", regform))
  }

  /**
   * authenticate the email and password entered, creates session and stores the authenticated email in
   * session variable, also renders the profile page of the user upon successful login.
   *
   * redirects to login page if the authentication fails.
   *
   * Invoked as the POST action of the Login Form
   */
  def authenticate = DBAction { implicit rs =>

    loginform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login("Login", formWithErrors)),
      user =>
        if (myWebUsers.connect(user)) {
          val userConn = myWebUsers.getData(user._1).get
          val flash = play.api.mvc.Flash(Map("successIn" -> s"Welcome ${userConn.name}"))
          Ok(html.myprofile("Profile", userConn.email)(flash)).withSession("email" -> userConn.email)
        } else {
          Redirect(routes.Application.login).flashing("failed" -> "Email and/or Password is not valid")
        })
  }

  /**
   * @param page : contains the title of the page / "Profile" default
   * @param email : registered email of the user retrieved from the session variable / "Guest" default
   *
   * renders the profile page of the user if his registered email exist in the session,
   * redirects to the login page otherwise.
   */
  def myprofile(page: String, email: String) = Action { implicit rs =>
    if (rs.session.isEmpty) {
      Redirect(routes.Application.login).flashing("failed" -> "Cannot Fetch Your Profile, Please Login First")
    } else {
      rs.session.get("email") match {
        case Some(email: String) =>
          Ok(html.myprofile(page, email))
        case None => Redirect(routes.Application.login).flashing("failed" -> "Cannot Fetch Your Profile, Please Login First")
      }
    }
  }

  /**
   * clears any session in place and renders the login page
   */
  def logout = Action { implicit rs =>
    val flash = play.api.mvc.Flash(Map("successOut" -> "You are now logged out."))
    Ok(html.login("Login", loginform)(flash)).withNewSession
  }

  /**
   * @param email : email retrieved from session variable.
   *
   * uploads an image in simple image format and stores it on the server side with registered
   * email of the user as file name.
   *
   * renders the profile page of the user after uploading.
   * Invoked as the POST action of the Upload Form.
   */
  def uploadFile(email: String) = Action(parse.multipartFormData) { implicit request =>
   //Logger.warn(">>>>>>>>>> request - " + request.body.file("fileUpload"))
    request.body.file("fileUpload").map { picture =>
      
        picture.ref.moveTo(new File("public/images/tmp.png"), true)
        val uploadedFile = new File("public/images/tmp.png")
        val targetStream = new FileInputStream(uploadedFile)
    try {
        val img = ImageIO.read(targetStream)
        // It's an image (only BMP, GIF, JPG and PNG are recognized).
        val mypic = new File("public/images/" + email + ".jpeg")
        ImageIO.write(img, "jpeg", mypic)
        val flash=play.api.mvc.Flash(Map("successUpdate" -> s"WebUser pic has been updated"))
        Ok(html.myprofile("Profile", email)(flash))
      } 
     catch {
        case e: Exception =>
          Redirect(routes.Application.myprofile("Profile", email)).flashing("failedUpdate" -> s"WebUser pic has not been updated")
      }
     finally{
        targetStream.close
        uploadedFile.delete
      }
    }.getOrElse(Redirect(routes.Application.myprofile("Profile", email)).flashing("failedUpdate" -> s"WebUser empty upload"))    
  }
}
