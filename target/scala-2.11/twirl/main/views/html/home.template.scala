
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page:String,email:String,logedIn: Boolean):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),_display_(/*3.2*/main("Welcome to Play",page,email,logedIn)/*3.44*/{_display_(Seq[Any](format.raw/*3.45*/("""
	
	"""),format.raw/*5.2*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
					</ol>

			<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox" width=100%>
						<div class="item active">
							<img src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("images/playframework.png")),format.raw/*17.63*/("""" alt="Play Framework" height=200px width= 100%>
						</div>

						<div class="item">
							<img src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("images/bootstrap.jpg")),format.raw/*21.59*/("""" alt="Bootstrap" height= 200px width=100%>
						</div>

						<div class="item">
							<img src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.at("images/typesafe.jpg")),format.raw/*25.58*/("""" alt="Typesafe" height=200px width=100%>
						</div>
						<div class="item">
							<img src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.at("images/Knoldus.png")),format.raw/*28.57*/("""" alt="Knoldus" height=200px width=100%>
						</div>
					</div>

			<!-- Left and right controls -->
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> 
					<a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
	</div>
				
""")))}),format.raw/*45.2*/("""
"""))}
  }

  def render(page:String,email:String,logedIn:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(page,email,logedIn)

  def f:((String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (page,email,logedIn) => apply(page,email,logedIn)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/home.scala.html
                  HASH: dd5de7f1f339ded2c70861fa1d549bdebd1a4d0b
                  MATRIX: 519->1|650->44|678->47|728->89|766->90|796->94|1358->629|1373->635|1432->673|1565->779|1580->785|1635->819|1763->920|1778->926|1832->959|1957->1057|1972->1063|2025->1095|2629->1669
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|38->17|38->17|38->17|42->21|42->21|42->21|46->25|46->25|46->25|49->28|49->28|49->28|66->45
                  -- GENERATED --
              */
          