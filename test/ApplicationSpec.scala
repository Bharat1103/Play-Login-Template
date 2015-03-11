import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.test._
import play.api.test.Helpers._
import org.specs2.mock.Mockito
import play.api.db.slick.DBAction
import models.WebUsersTrait
import models.User
import views.html._
import controllers.Application
import play.api.mvc.Controller
import org.joda.time.LocalDateTime
import play.api.libs.Files.TemporaryFile
import play.api.mvc.MultipartFormData.MissingFilePart
import play.api.mvc.MultipartFormData.BadPart
import play.api.mvc.MultipartFormData.FilePart
import play.api.mvc.MultipartFormData
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.DurationInt
import java.io.File

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */

@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends PlaySpecification with Mockito {

  def getMockedObj: Application = {
    val mockdVal = mock[WebUsersTrait]

    object Test extends Controller with Application {

      val myWebUsers: WebUsersTrait = mockdVal

    }
    Test
  }

  "Application" should {

    "send 404 on requesting for some non-existing page" in new WithApplication {
      route(FakeRequest(GET, "/boum")) must beNone
    }

    "render the home page" in new WithApplication {
      val home = route(FakeRequest(GET, "/")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain("Welcome to Play")
    }

    "render the register page" in new WithApplication {
      val register = route(FakeRequest(GET, "/register")).get

      status(register) must equalTo(OK)
      contentType(register) must beSome.which(_ == "text/html")
      contentAsString(register) must contain("Register")
    }

    "render the register page with Bad Request" in new WithApplication {
      val register = route(FakeRequest(POST, "/register/newuser").
        withFormUrlEncodedBody("name" -> "", "email" -> "", "password" -> "", "phone" -> "", "address" -> "", "company" -> "")).get

      status(register) must equalTo(400)
      contentType(register) must beSome.which(_ == "text/html")
      contentAsString(register) must contain("Register")
    }

    "registering with existing email" in new WithApplication {
      val Test = getMockedObj
      val register = route(FakeRequest(POST, "/register/newuser").
        withFormUrlEncodedBody("name" -> "Bharat", "email" -> "Bharat@knoldus.com",
          "password" -> "hellohi11", "phone" -> "1234567890", "address" -> "knoldus", "company" -> "knoldus")).get

      DBAction { implicit rs =>

        Test.myWebUsers.getData("Bharat@knoldus.com")(rs.dbSession) returns Some(User("Bharat", "Bharat@knoldus.com", "hellohi11", 9716719367L, "knoldus", "knoldus", LocalDateTime.now(), LocalDateTime.now(), 2, Some(0)))

      }
      status(register) must equalTo(200)
      contentType(register) must beSome.which(_ == "text/html")
      contentAsString(register) must contain("Register")
    }

    "registering with new valid email" in new WithApplication {
      val Test = getMockedObj
      val register = route(FakeRequest(POST, "/register/newuser").
        withFormUrlEncodedBody("name" -> "Bharat", "email" -> "Test@knoldus.com",
          "password" -> "hellohi11", "phone" -> "1234567890", "address" -> "knoldus", "company" -> "knoldus")).get

      DBAction { implicit rs =>

        Test.myWebUsers.getData("Test@knoldus.com")(rs.dbSession) returns None
        Test.myWebUsers.create(User("Bharat", "Test@knoldus.com",
          "hellohi11", 1234567890L, "knoldus", "knoldus", LocalDateTime.now(), LocalDateTime.now(), 2, Some(0)))(rs.dbSession) returns 1
        Test.myWebUsers.delete("Test@knoldus.com")(rs.dbSession) returns 1
      }
      status(register) must equalTo(303)
      contentType(register) must beNone
    }

    "render the login page" in new WithApplication {
      val login = route(FakeRequest(GET, "/login")).get

      status(login) must equalTo(OK)
      contentType(login) must beSome.which(_ == "text/html")
      contentAsString(login) must contain("Enter Details")
    }

    "render the login page with Bad Request" in new WithApplication {
      val myprofile = route(FakeRequest(POST, "/authenticate").withFormUrlEncodedBody("email" -> "", "password" -> "")).get

      status(myprofile) must equalTo(400)
      contentType(myprofile) must beSome.which(_ == "text/html")
      contentAsString(myprofile) must contain("Enter Details")
    }

    "render the login page upon unsuccessful login" in new WithApplication {
      val Test = getMockedObj
      val myprofile = route(FakeRequest(POST, "/authenticate").withFormUrlEncodedBody("email" -> "Bharat@knoldus.com", "password" -> "hellohi10")).get
      DBAction { implicit rs =>

        Test.myWebUsers.connect(("Bharat@knoldus.com", "hellohi10"))(rs.dbSession) returns false
      }
      status(myprofile) must equalTo(303)
      contentType(myprofile) must beNone
    }

    "successful login with valid credentials" in new WithApplication {
      val Test = getMockedObj
      val myprofile = route(FakeRequest(POST, "/authenticate").withFormUrlEncodedBody("email" -> "Bharat@knoldus.com", "password" -> "hellohi11")).get
      DBAction { implicit rs =>

        Test.myWebUsers.connect(("Bharat@knoldus.com", "hellohi11"))(rs.dbSession) returns true
        Test.myWebUsers.getData("Bharat@knoldus.com")(rs.dbSession) returns Some(User("Bharat", "Bharat@knoldus.com", "hellohi11", 9716719367L, "knoldus", "knoldus", LocalDateTime.now(), LocalDateTime.now(), 2, Some(0)))

      }
      status(myprofile) must equalTo(200)
      contentAsString(myprofile) must contain("Welcome")
    }

    "accessing the profile page with empty session" in new WithApplication {
      val profile = route(FakeRequest(GET, "/myprofile?page=Profile&email=Bharat%40knoldus.com")).get

      status(profile) must equalTo(303)
      contentType(profile) must beNone
    }

    "accessing the profile page without valid session variable" in new WithApplication {
      val profile = route(FakeRequest(GET, "/myprofile?page=Profile&email=Bharat%40knoldus.com").withSession("name" -> "")).get

      status(profile) must equalTo(303)
      contentType(profile) must beNone
    }

    "render the profile page with valid session" in new WithApplication {
      val profile = route(FakeRequest(GET, "/myprofile?page=Profile&email=Bharat%40knoldus.com").
        withSession("email" -> "Bharat@knoldus.com")).get

      status(profile) must equalTo(OK)
      contentType(profile) must beSome.which(_ == "text/html")
      contentAsString(profile) must contain("Welcome")
    }

    "render the login page after successful logout" in new WithApplication {
      val profile = route(FakeRequest(GET, "/logout").
        withSession("email" -> "Bharat@knoldus.com")).get

      status(profile) must equalTo(OK)
      contentType(profile) must beSome.which(_ == "text/html")
      contentAsString(profile) must contain("Enter Details")
    }

    "accessing the updateprofile page with empty session" in new WithApplication {
      val register = route(FakeRequest(GET, "/updateprofile?page=Edit&email=Bharat%40knoldus.com")).get

      status(register) must equalTo(303)
      contentType(register) must beNone
    }

    "render the updateprofile page with valid session" in new WithApplication {
      val updateprofile = route(FakeRequest(GET, "/updateprofile?page=Edit&email=Bharat%40knoldus.com").
        withSession("email" -> "Bharat@knoldus.com")).get

      status(updateprofile) must equalTo(OK)
      contentType(updateprofile) must beSome.which(_ == "text/html")
      contentAsString(updateprofile) must contain("Update Details")
    }

    "updating details with existing valid email" in new WithApplication {
      val Test = getMockedObj
      val update = route(FakeRequest(POST, "/update?email=srb%40gmail.com").
        withFormUrlEncodedBody("name" -> "Bharat", "password" -> "hellohi11",
          "phone" -> "1234567890", "address" -> "knoldus", "company" -> "knoldus")).get

      DBAction { implicit rs =>

        val result = Test.myWebUsers.getData("srb@gmail.com")(rs.dbSession) returns Some(User("Saurabh", "srb@gmail.com",
          "hellohi11", 1234567890L, "knoldus", "knoldus", LocalDateTime.now(), LocalDateTime.now(), 2, Some(0)))
        Test.myWebUsers.updateUser(result, 37)(rs.dbSession) returns 1
      }
      status(update) must equalTo(200)
      contentType(update) must beSome.which(_ == "text/html")
      contentAsString(update) must contain("Welcome")
    }

    "updating details with non-existing email" in new WithApplication {
      val Test = getMockedObj
      val update = route(FakeRequest(POST, "/update?email=abc%40gmail.com").
        withFormUrlEncodedBody("name" -> "Bharat", "password" -> "hellohi11",
          "phone" -> "1234567890", "address" -> "knoldus", "company" -> "knoldus")).get

      DBAction { implicit rs =>
        Test.myWebUsers.getData("abc@gmail.com")(rs.dbSession) returns None

      }
      status(update) must equalTo(303)
      contentType(update) must beNone
    }

    "updating details with valid email but Bad Form Request" in new WithApplication {
      val update = route(FakeRequest(POST, "/update?email=srb%40gmail.com").
        withFormUrlEncodedBody("name" -> "Bharat", "password" -> "",
          "phone" -> "1234567890", "address" -> "knoldus", "company" -> "knoldus")).get

      status(update) must equalTo(400)
      contentType(update) must beSome.which(_ == "text/html")
    }

    "uploading file without image type" in {
      implicit val request = mock[play.api.mvc.Request[MultipartFormData[TemporaryFile]]]
      val tempFile = TemporaryFile("/tmp/multipartBody", "asTemporaryFile")
      val fileName = "customLogo.png"
      val part = FilePart("fileUpload", fileName, Some("image/jpeg"), tempFile)
      val files = Seq[FilePart[TemporaryFile]](part)
      val multipartBody = MultipartFormData(Map[String, Seq[String]](), files, Seq[BadPart](), Seq[MissingFilePart]())
      request.body returns multipartBody

      val futureresult = Future(controllers.Application.uploadFile("Bharat@knoldus.com")(request))
      val finalresult = Await.result(futureresult, 1 second)
      status(finalresult) must equalTo(303)
    }

   /* "uploading file with image type" in{
      implicit val request= mock[play.api.mvc.Request[MultipartFormData[TemporaryFile]]]
      val tempFile = TemporaryFile(new File("public/images/test.png"))
      val fileName = "customLogo.png"
      val part = FilePart("fileUpload", fileName, Some("image/jpeg"), tempFile)
      val files = Seq[FilePart[TemporaryFile]](part)
      val multipartBody = MultipartFormData(Map[String, Seq[String]](), files, Seq[BadPart](), Seq[MissingFilePart]())
      request.body returns multipartBody
      
      val futureresult = Future(controllers.Application.uploadFile("Bharat@knoldus.com")(request))
      val finalresult=Await.result(futureresult,1 second)
      status(finalresult) must equalTo(200)
    }*/
    
    "uploading file with empty body" in{
      implicit val request= mock[play.api.mvc.Request[MultipartFormData[TemporaryFile]]]
      val tempFile = TemporaryFile(new File("public/images/test.png"))
      val fileName = "customLogo.png"
      val part = FilePart("fileUpload", fileName, Some("image/jpeg"), tempFile)
      val files = Seq[FilePart[TemporaryFile]](part)
      val multipartBody = MultipartFormData(Map[String, Seq[String]](), Seq[FilePart[TemporaryFile]](), Seq[BadPart](), Seq[MissingFilePart]())
      request.body returns multipartBody
      
      val futureresult = Future(controllers.Application.uploadFile("Bharat@knoldus.com")(request))
      val finalresult=Await.result(futureresult,1 second)
      status(finalresult) must equalTo(303)
    }
  }
}
