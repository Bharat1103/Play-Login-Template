
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Welcome to Play",page,"Guest",false)/*3.44*/{_display_(Seq[Any](format.raw/*3.45*/("""
	
	"""),format.raw/*5.2*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>

			<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox" width=100%>
						<div class="item active">
							<img src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("images/playframework.png")),format.raw/*16.63*/("""" alt="Play Framework" height=200px width= 100%>
						</div>

						<div class="item">
							<img src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.at("images/bootstrap.jpg")),format.raw/*20.59*/("""" alt="Bootstrap" height= 200px width=100%>
						</div>

						<div class="item">
							<img src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.at("images/typesafe.jpg")),format.raw/*24.58*/("""" alt="Typesafe" height=200px width=100%>
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
				
""")))}),format.raw/*41.2*/("""
"""))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 18:29:11 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/home.scala.html
                  HASH: 849ddac743521e44d233c98be2d50e7115dd8950
                  MATRIX: 504->1|605->14|633->17|683->59|721->60|751->64|1253->539|1268->545|1327->583|1460->689|1475->695|1530->729|1658->830|1673->836|1727->869|2332->1444
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|37->16|37->16|37->16|41->20|41->20|41->20|45->24|45->24|45->24|62->41
                  -- GENERATED --
              */
          