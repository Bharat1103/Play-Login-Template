// @SOURCE:/home/knoldus/play-login/conf/routes
// @HASH:651f52ceca6aa60cca17af2185aecaadaddab141
// @DATE:Tue Mar 10 16:55:13 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:24
class ReverseAssets {


// @LINE:24
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:21
def uploadFile(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "upload" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

// @LINE:9
def registerme(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "register/newuser")
}
                        

// @LINE:14
def myprofile(page:String, email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "myprofile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("page", page)), Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

// @LINE:19
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:8
def register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

// @LINE:17
def update(email:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "update" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

// @LINE:16
def updateprofile(page:String, email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "updateprofile" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("page", page)), Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

// @LINE:12
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                        

// @LINE:6
def home(page:String = "Home", email:String = "Guest", logedIn:Boolean = false): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + queryString(List(if(page == "Home") None else Some(implicitly[QueryStringBindable[String]].unbind("page", page)), if(email == "Guest") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(logedIn == false) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("logedIn", logedIn)))))
}
                        

// @LINE:11
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:24
class ReverseAssets {


// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:21
def uploadFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.uploadFile",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:9
def registerme : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerme",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register/newuser"})
      }
   """
)
                        

// @LINE:14
def myprofile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.myprofile",
   """
      function(page,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myprofile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("page", page), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:8
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:17
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(email) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:16
def updateprofile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateprofile",
   """
      function(page,email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("page", page), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function(page,email,logedIn) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("page", page)), (email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (logedIn == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("logedIn", logedIn))])})
      }
   """
)
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:24
class ReverseAssets {


// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """GET			/navme						controllers.Application.navme(message:String,page:String)
 Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:21
def uploadFile(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.uploadFile(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "uploadFile", Seq(classOf[String]), "POST", """""", _prefix + """upload""")
)
                      

// @LINE:9
def registerme(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerme(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerme", Seq(), "POST", """""", _prefix + """register/newuser""")
)
                      

// @LINE:14
def myprofile(page:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.myprofile(page, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myprofile", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """myprofile""")
)
                      

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:8
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:17
def update(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "update", Seq(classOf[String]), "POST", """""", _prefix + """update""")
)
                      

// @LINE:16
def updateprofile(page:String, email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateprofile(page, email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateprofile", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """updateprofile""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:6
def home(page:String, email:String, logedIn:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(page, email, logedIn), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(classOf[String], classOf[String], classOf[Boolean]), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    