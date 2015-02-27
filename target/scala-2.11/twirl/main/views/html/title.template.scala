
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

/* title Template File */
object title extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* title Template File */
  def apply/*2.2*/(page: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<title> Play- """),_display_(/*4.16*/page),format.raw/*4.20*/("""</title>
"""))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 26 14:26:25 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/title.scala.html
                  HASH: 186f77fde4c8bcb36e9221e9091e7fc681cb0114
                  MATRIX: 547->27|649->41|677->43|718->58|742->62
                  LINES: 19->2|22->2|24->4|24->4|24->4
                  -- GENERATED --
              */
          