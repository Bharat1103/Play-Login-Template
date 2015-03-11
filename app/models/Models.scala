package models

import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted.Tag
import org.joda.time.LocalDateTime
import java.text.SimpleDateFormat

//Details of the user that we want to store in database

case class User(name: String, email: String, password: String, phone: Long, address: String, company: String,
                created: LocalDateTime, updated: LocalDateTime, usertype: Int = 2, id: Option[Int])

// Mapping of the case class User with the "mywebuser" table in the database
                
class WebUser(tag: Tag) extends Table[User](tag, "mywebuser") {

  implicit val DateMapper = MappedColumnType.base[org.joda.time.LocalDateTime, java.sql.Date](
    { utilDate => new java.sql.Date((utilDate.toDate()).getTime()) },
    { sqlDate => new org.joda.time.LocalDateTime(sqlDate.getTime()) })

  def name: Column[String] = column[String]("name", O.NotNull)
  def email: Column[String] = column[String]("email", O.NotNull)
  def password: Column[String] = column[String]("password", O.NotNull)
  def phone: Column[Long] = column[Long]("phone", O.NotNull)
  def address: Column[String] = column[String]("address", O.NotNull)
  def company: Column[String] = column[String]("company", O.NotNull)
  def created: Column[LocalDateTime] = column[LocalDateTime]("created", O.NotNull)
  def updated: Column[LocalDateTime] = column[LocalDateTime]("updated", O.NotNull)
  def usertype: Column[Int] = column[Int]("usertype", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (name, email, password, phone, address, company, created, updated, usertype, id) <> (User.tupled, User.unapply)
  def uniqueEmail = index("IDX_EMAIL", email, unique = true)
}

trait WebUsersTrait {

  val users = TableQuery(new WebUser(_))

  /**
   * @param user : Details from the register form.
   * @param s : implicit session from the controller's DBAction context.
   * @return : returns integer showing number of records created (always 1 in this case).
   */
  def create(user: User)(implicit s: Session): Int = {
    //employees.ddl.create
    users.insert(user)
  }
  
  /**
 * @param email : registered email entered as "Test@knoldus.com".
 * @param s : implicit session from the controller's DBAction context.
 * @return : returns integer showing number of records deleted (always 1 in this case).
 */
def delete(email:String)(implicit s: Session): Int = {
    users.filter(_.email === email).delete
  }

  /**
   * @param updatedUser : object of case class User created using Update form containg 
   *                      the changes required by the registered user.
   * @param id : Auto incremented id generated when user register in the system.
   * @param s : implicit session from the controller's DBAction context.
   * @return : returns the integer showing number of records updated (always 1 in this case).
   */
  def updateUser(updatedUser: User, id: Int)(implicit s: Session): Int = {

    users.filter(_.id === id).update(updatedUser)

  }

  /**
   * @param user : tuple containg the email and password with which any user is trying to login into the system.
   * @param s : implicit session from the controller's DBAction context.
   * @return : returns a boolean value showing whether the user login is authentic.
   */
  def connect(user: (String, String))(implicit s: Session): Boolean = {
    val reqEmail = user._1
    val reqPassword = user._2

    if (users.filter(webUser => webUser.email === reqEmail && webUser.password === reqPassword).list.isEmpty)
      false

    else
      true
  }

  /**
   * @param email : registered email of the user.
   * @param s : implicit session cfrom the controller's DBAction context.
   * @return : returns object of the case class User containing user Details, if the email exist in system.
   */
  def getData(email: String)(implicit s: Session): Option[User] = {
    val webUser = users.filter(_.email === email).firstOption
    webUser
  }
}
object WebUsers extends WebUsersTrait 