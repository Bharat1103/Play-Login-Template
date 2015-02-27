
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

/* stylesheets Template File */
object stylesheets extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* stylesheets Template File */
  def apply/*2.2*/(page:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.15*/("""
		
	"""),format.raw/*4.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.47*/routes/*4.53*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*4.98*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.at("bootstrap/css/main.css")),format.raw/*5.92*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.at("images/favicon.png")),format.raw/*6.93*/("""">"""))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 14:26:26 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/stylesheets.scala.html
                  HASH: f14fd1e7333ec27ef3f70291b5fc434506cd704b
                  MATRIX: 565->33|666->46|697->51|768->96|782->102|847->147|925->199|939->205|995->241|1078->298|1092->304|1144->336
                  LINES: 19->2|22->2|24->4|24->4|24->4|24->4|25->5|25->5|25->5|26->6|26->6|26->6
                  -- GENERATED --
              */
          