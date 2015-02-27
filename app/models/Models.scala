package models


import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted.Tag
import org.joda.time.LocalDateTime
import java.text.SimpleDateFormat



case class User(name: String, email: String, password:String,phone: Long, address:String, company:String,
    created:LocalDateTime,updated: LocalDateTime, usertype:Int=2, id: Option[Int])
    


class WebUsers(tag:Tag) extends Table[User](tag, "mywebuser") {
  
  implicit val DateMapper = MappedColumnType.base[org.joda.time.LocalDateTime, java.sql.Date](
    { utilDate => new java.sql.Date((utilDate.toDate()).getTime()) },
    { sqlDate => new org.joda.time.LocalDateTime(sqlDate.getTime()) })
    
  def name: Column[String] = column[String]("name", O.NotNull)
  def email: Column[String] = column[String]("email", O.NotNull)
  def password: Column[String] = column[String]("password", O.NotNull)
  def phone: Column[Long] = column[Long]("phone",O.NotNull)
  def address: Column[String] = column[String]("address", O.NotNull)
  def company: Column[String] = column[String]("company", O.NotNull)
  def created: Column[LocalDateTime] = column[LocalDateTime]("created", O.NotNull)
  def updated: Column[LocalDateTime] = column[LocalDateTime]("updated", O.NotNull)
  def usertype: Column[Int] = column[Int]("usertype", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (name, email,password, phone, address, company, created, updated, usertype, id) <> (User.tupled, User.unapply)
  def uniqueEmail = index("IDX_EMAIL", email, unique = true)
}

object WebUsers{
  
    val users = TableQuery(new WebUsers(_))
    
    def create(user: User)(implicit s: Session): Int = {
    //employees.ddl.create
    users.insert(user)
    }
    
    def updateUser(updatedUser: User,id:Int)(implicit s:Session ): Int={
    
     users.filter(_.id === id).update(updatedUser)
 
    }
     
    def connect(user:(String,String))(implicit s:Session):Boolean={
      val reqEmail=user._1
      val reqPassword=user._2
      
        if(users.filter(webUser=>webUser.email===reqEmail && webUser.password===reqPassword).list.isEmpty)
           false
          
        else
           true
    }
    
      def getData(email:String)(implicit s:Session):User={
        val webUser=users.filter(_.email===email).first
        webUser
      }
}