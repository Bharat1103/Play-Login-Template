
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object newnavme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,page:String,email:String,logedIn:Boolean):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.59*/("""

	"""),format.raw/*3.2*/("""<nav role="navigation" class="navbar navbar-inverse reset-margin">
    <!-- Brand and toggle get grouped for better mobile display -->
    	<div class="navbar-header">
        	<button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
            	<span class="sr-only">Toggle navigation</span>
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
            	<span class="icon-bar"></span>
        	</button>
        	
        	<a href=""""),_display_(/*13.20*/routes/*13.26*/.Application.home(page,email,logedIn)),format.raw/*13.63*/("""" class="navbar-brand">
        	<span class="glyphicon glyphicon-home"> WebUser</span></a>
        
    	</div>
    <!-- Collection of nav links and other content for toggling -->
    	<div id="navbarCollapse" class="collapse navbar-collapse">
        	<ul class="nav navbar-nav">
            	<li class="""),_display_(/*20.25*/("active".when(page == "Explore"))),format.raw/*20.59*/("""><a href="#">
            	<span class="glyphicon glyphicon-question-sign"> Explore</span></a></li>
            	<li class="""),_display_(/*22.25*/("active".when(page == "Features"))),format.raw/*22.60*/("""><a href="#">
            	<span class="glyphicon glyphicon-tasks"> Features</span></a></li>
            	<li class="""),_display_(/*24.25*/("active".when(page == "Blog"))),format.raw/*24.56*/("""><a href="#">
            	<span class="glyphicon glyphicon-comment"> Blog</span></a></li>
        	</ul>
        
        	<div class="col-sm-3 col-md-3">
        		<form class="navbar-form " role="search">
        			<div class="input-group">
            			<input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
            			
            			<div class="input-group-btn">
                			<button class="btn btn-default" type="submit"><span class="glyphicon glyphicon-search"></span></button>
            			</div>
        			</div>
        		</form>
        	</div>
        
        	<ul class="nav navbar-nav navbar-right">
        		"""),_display_(/*41.12*/if(logedIn)/*41.23*/{_display_(Seq[Any](format.raw/*41.24*/("""
        		"""),format.raw/*42.11*/("""<li class="nav-email">welcome! """),_display_(/*42.43*/email),format.raw/*42.48*/("""</li>
        		<li class="dropdown">
        		  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-cog"></span></a>
          			<ul class="dropdown-menu" role="menu">
            			<li class="""),_display_(/*46.27*/("active".when(page == "Profile"))),format.raw/*46.61*/("""><a href=""""),_display_(/*46.72*/routes/*46.78*/.Application.myprofile(page,email)),format.raw/*46.112*/("""">
						<span class="glyphicon glyphicon-user"> Profile</span></a></li>
        		
            			<li class="divider"></li>
            			<li class="""),_display_(/*50.27*/("active".when(page == "Login"))),format.raw/*50.59*/("""><a href=""""),_display_(/*50.70*/routes/*50.76*/.Application.logout()),format.raw/*50.97*/("""">
						<span class="glyphicon glyphicon-log-out"> Logout</span></a></li>
						<li class="""),_display_(/*52.18*/("active".when(page == "Edit"))),format.raw/*52.49*/("""><a href=""""),_display_(/*52.60*/routes/*52.66*/.Application.updateprofile(page,email)),format.raw/*52.104*/("""">
						<span class="glyphicon glyphicon-edit"> Update</span></a></li>
          			</ul>
        		</li>		
   				""")))}/*56.9*/else/*56.13*/{_display_(Seq[Any](format.raw/*56.14*/("""
   				"""),format.raw/*57.8*/("""<li class="nav-email">welcome! """),_display_(/*57.40*/email),format.raw/*57.45*/("""</li>
        		<li class="""),_display_(/*58.22*/("active".when(page == "Login"))),format.raw/*58.54*/("""><a href=""""),_display_(/*58.65*/routes/*58.71*/.Application.login()),format.raw/*58.91*/("""">
        		<span class="glyphicon glyphicon-log-in"> Login</span></a></li>
        		<li class="""),_display_(/*60.22*/("active".when(page == "Register"))),format.raw/*60.57*/("""><a href=""""),_display_(/*60.68*/routes/*60.74*/.Application.register()),format.raw/*60.97*/("""">
        		<span class="glyphicon glyphicon-user"> Register</span></a></li>""")))}),format.raw/*61.76*/("""
            """),format.raw/*62.13*/("""</ul>
    	</div>
	</nav>
"""))}
  }

  def render(message:String,page:String,email:String,logedIn:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(message,page,email,logedIn)

  def f:((String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (message,page,email,logedIn) => apply(message,page,email,logedIn)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/newnavme.scala.html
                  HASH: d3c305d4021ac1d0765a3ccd8c0a6182b9d0ce06
                  MATRIX: 530->1|675->58|704->61|1246->576|1261->582|1319->619|1652->925|1707->959|1858->1083|1914->1118|2058->1235|2110->1266|2819->1948|2839->1959|2878->1960|2917->1971|2976->2003|3002->2008|3302->2281|3357->2315|3395->2326|3410->2332|3466->2366|3644->2517|3697->2549|3735->2560|3750->2566|3792->2587|3911->2679|3963->2710|4001->2721|4016->2727|4076->2765|4211->2882|4224->2886|4263->2887|4298->2895|4357->2927|4383->2932|4437->2959|4490->2991|4528->3002|4543->3008|4584->3028|4709->3126|4765->3161|4803->3172|4818->3178|4862->3201|4971->3279|5012->3292
                  LINES: 19->1|22->1|24->3|34->13|34->13|34->13|41->20|41->20|43->22|43->22|45->24|45->24|62->41|62->41|62->41|63->42|63->42|63->42|67->46|67->46|67->46|67->46|67->46|71->50|71->50|71->50|71->50|71->50|73->52|73->52|73->52|73->52|73->52|77->56|77->56|77->56|78->57|78->57|78->57|79->58|79->58|79->58|79->58|79->58|81->60|81->60|81->60|81->60|81->60|82->61|83->62
                  -- GENERATED --
              */
          