// @SOURCE:/home/knoldus/play-login/conf/routes
// @HASH:651f52ceca6aa60cca17af2185aecaadaddab141
// @DATE:Tue Mar 10 16:55:13 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_home0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_home0_invoker = createInvoker(
controllers.Application.home(fakeValue[String], fakeValue[String], fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "home", Seq(classOf[String], classOf[String], classOf[Boolean]),"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Application_register1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Application_register1_invoker = createInvoker(
controllers.Application.register,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
        

// @LINE:9
private[this] lazy val controllers_Application_registerme2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register/newuser"))))
private[this] lazy val controllers_Application_registerme2_invoker = createInvoker(
controllers.Application.registerme,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerme", Nil,"POST", """""", Routes.prefix + """register/newuser"""))
        

// @LINE:11
private[this] lazy val controllers_Application_login3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login3_invoker = createInvoker(
controllers.Application.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:12
private[this] lazy val controllers_Application_authenticate4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
private[this] lazy val controllers_Application_authenticate4_invoker = createInvoker(
controllers.Application.authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate"""))
        

// @LINE:14
private[this] lazy val controllers_Application_myprofile5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("myprofile"))))
private[this] lazy val controllers_Application_myprofile5_invoker = createInvoker(
controllers.Application.myprofile(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myprofile", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """myprofile"""))
        

// @LINE:16
private[this] lazy val controllers_Application_updateprofile6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateprofile"))))
private[this] lazy val controllers_Application_updateprofile6_invoker = createInvoker(
controllers.Application.updateprofile(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateprofile", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """updateprofile"""))
        

// @LINE:17
private[this] lazy val controllers_Application_update7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update"))))
private[this] lazy val controllers_Application_update7_invoker = createInvoker(
controllers.Application.update(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "update", Seq(classOf[String]),"POST", """""", Routes.prefix + """update"""))
        

// @LINE:19
private[this] lazy val controllers_Application_logout8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout8_invoker = createInvoker(
controllers.Application.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:21
private[this] lazy val controllers_Application_uploadFile9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
private[this] lazy val controllers_Application_uploadFile9_invoker = createInvoker(
controllers.Application.uploadFile(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "uploadFile", Seq(classOf[String]),"POST", """""", Routes.prefix + """upload"""))
        

// @LINE:24
private[this] lazy val controllers_Assets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """GET			/navme						controllers.Application.navme(message:String,page:String)
 Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.home(page:String ?= "Home", email:String ?= "Guest", logedIn:Boolean ?= false)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register/newuser""","""controllers.Application.registerme"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """myprofile""","""controllers.Application.myprofile(page:String, email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateprofile""","""controllers.Application.updateprofile(page:String, email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update""","""controllers.Application.update(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.Application.uploadFile(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_home0_route(params) => {
   call(params.fromQuery[String]("page", Some("Home")), params.fromQuery[String]("email", Some("Guest")), params.fromQuery[Boolean]("logedIn", Some(false))) { (page, email, logedIn) =>
        controllers_Application_home0_invoker.call(controllers.Application.home(page, email, logedIn))
   }
}
        

// @LINE:8
case controllers_Application_register1_route(params) => {
   call { 
        controllers_Application_register1_invoker.call(controllers.Application.register)
   }
}
        

// @LINE:9
case controllers_Application_registerme2_route(params) => {
   call { 
        controllers_Application_registerme2_invoker.call(controllers.Application.registerme)
   }
}
        

// @LINE:11
case controllers_Application_login3_route(params) => {
   call { 
        controllers_Application_login3_invoker.call(controllers.Application.login)
   }
}
        

// @LINE:12
case controllers_Application_authenticate4_route(params) => {
   call { 
        controllers_Application_authenticate4_invoker.call(controllers.Application.authenticate)
   }
}
        

// @LINE:14
case controllers_Application_myprofile5_route(params) => {
   call(params.fromQuery[String]("page", None), params.fromQuery[String]("email", None)) { (page, email) =>
        controllers_Application_myprofile5_invoker.call(controllers.Application.myprofile(page, email))
   }
}
        

// @LINE:16
case controllers_Application_updateprofile6_route(params) => {
   call(params.fromQuery[String]("page", None), params.fromQuery[String]("email", None)) { (page, email) =>
        controllers_Application_updateprofile6_invoker.call(controllers.Application.updateprofile(page, email))
   }
}
        

// @LINE:17
case controllers_Application_update7_route(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_update7_invoker.call(controllers.Application.update(email))
   }
}
        

// @LINE:19
case controllers_Application_logout8_route(params) => {
   call { 
        controllers_Application_logout8_invoker.call(controllers.Application.logout)
   }
}
        

// @LINE:21
case controllers_Application_uploadFile9_route(params) => {
   call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_uploadFile9_invoker.call(controllers.Application.uploadFile(email))
   }
}
        

// @LINE:24
case controllers_Assets_at10_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     