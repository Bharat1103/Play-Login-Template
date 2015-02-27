
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
        	
        	<a href=""""),_display_(/*13.20*/routes/*13.26*/.Application.home()),format.raw/*13.45*/("""" class="navbar-brand">
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
				<li class="""),_display_(/*43.16*/("active".when(page == "Login"))),format.raw/*43.48*/("""><a href=""""),_display_(/*43.59*/routes/*43.65*/.Application.logout()),format.raw/*43.86*/("""">
				<span classs="glyphicon glyphicon-log-out"> Logout</span></a></li>
				<li class="""),_display_(/*45.16*/("active".when(page == "Edit"))),format.raw/*45.47*/("""><a href=""""),_display_(/*45.58*/routes/*45.64*/.Application.updateprofile("Profile",email)),format.raw/*45.107*/("""">
				<span class="glyphicon glyphicon-edit"> Update</span></a></li>
        		""")))}/*47.12*/else/*47.16*/{_display_(Seq[Any](format.raw/*47.17*/("""
        		"""),format.raw/*48.11*/("""<li class="""),_display_(/*48.22*/("active".when(page == "Login"))),format.raw/*48.54*/("""><a href=""""),_display_(/*48.65*/routes/*48.71*/.Application.login()),format.raw/*48.91*/("""">
        		<span class="glyphicon glyphicon-log-in"> Login</span></a></li>
        		<li class="""),_display_(/*50.22*/("active".when(page == "Register"))),format.raw/*50.57*/("""><a href=""""),_display_(/*50.68*/routes/*50.74*/.Application.register()),format.raw/*50.97*/("""">
        		<span class="glyphicon glyphicon-user"> Register</span></a></li>""")))}),format.raw/*51.76*/("""
            """),format.raw/*52.13*/("""</ul>
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
                  DATE: Fri Feb 27 17:53:01 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/newnavme.scala.html
                  HASH: 0ea87bcc6a3b2ec8734f2759fa61059722f8575d
                  MATRIX: 530->1|675->58|704->61|1246->576|1261->582|1301->601|1634->907|1689->941|1840->1065|1896->1100|2040->1217|2092->1248|2801->1930|2821->1941|2860->1942|2899->1953|2958->1985|2984->1990|3035->2014|3088->2046|3126->2057|3141->2063|3183->2084|3299->2173|3351->2204|3389->2215|3404->2221|3469->2264|3569->2345|3582->2349|3621->2350|3660->2361|3698->2372|3751->2404|3789->2415|3804->2421|3845->2441|3970->2539|4026->2574|4064->2585|4079->2591|4123->2614|4232->2692|4273->2705
                  LINES: 19->1|22->1|24->3|34->13|34->13|34->13|41->20|41->20|43->22|43->22|45->24|45->24|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|64->43|64->43|64->43|66->45|66->45|66->45|66->45|66->45|68->47|68->47|68->47|69->48|69->48|69->48|69->48|69->48|69->48|71->50|71->50|71->50|71->50|71->50|72->51|73->52
                  -- GENERATED --
              */
          