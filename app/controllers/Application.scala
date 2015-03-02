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
import org.postgresql.util.PSQLException

object Application extends Controller {

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

  def home(page:String,email:String,logedIn:Boolean) = Action { implicit rs =>
    Ok(html.home(page,email,logedIn))
  }

  def login = Action { implicit rs =>
    Ok(html.login("Login", loginform))
  }

  def registerme = DBAction { implicit rs =>
    regform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.register("Register", formWithErrors)),
      user => {
        val findDetails = WebUsers.getData(user.email)
        if (Option(findDetails) != None) {
          Redirect(routes.Application.register).flashing("failedCreate" -> s"WebUser ${user.email} already exist")
        } else {
          WebUsers.create(user)
          Redirect(routes.Application.login).flashing("successCreate" -> s"WebUser ${user.name} created, please Login")
        }
      })
  }

  def update(email: String) = DBAction { implicit rs =>
    regform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.updateprofile("Edit User", email, formWithErrors)),
      user => {
        val userConn = WebUsers.getData(email)
        val createdOriginal = userConn.created
        userConn.id match {
          case Some(id: Int) => {
            val updatedUser = user.copy(id = Some(id), created = createdOriginal)
            WebUsers.updateUser(updatedUser, id)
            Redirect(routes.Application.myprofile("Profile", updatedUser.name)).
              flashing("successUpdate" -> s"WebUser ${updatedUser.name} has been updated")
          }
        }
      })
  }

  def updateprofile(page: String, email: String) = DBAction { implicit rs =>
    rs.session.get("email") match {
      case Some(email) =>
        val existingData = WebUsers.getData(email)
        Ok(html.updateprofile("Edit", email, regform.fill(existingData)))
    }
  }

  def register = Action { implicit rs =>
    Ok(html.register("Register", regform))
  }

  def authenticate = DBAction { implicit rs =>

    loginform.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login("Login", formWithErrors)),
      user =>
        if (WebUsers.connect(user)) {
          val userConn = WebUsers.getData(user._1)
          Redirect(routes.Application.myprofile("Profile", userConn.email)).withSession("email" -> userConn.email).
            flashing("successIn" -> s"Welcome ${userConn.name}")
        } else {
          Redirect(routes.Application.login).flashing("failed" -> "Email and/or Password is not valid")
        })
  }

  def myprofile(page: String, email: String) = Action { implicit rs =>

    if (rs.session.isEmpty) {
      Redirect(routes.Application.login).flashing("failed" -> "Cannot Fetch Your Profile, Please Login First")
    } else {
      rs.session.get("email") match {
        case Some(email: String) =>
          Ok(html.myprofile(page, email))
      }
    }
  }

  def logout = Action { implicit rs =>
    Redirect(routes.Application.login).withNewSession.flashing(
      "successOut" -> "You are now logged out.")
  }

}