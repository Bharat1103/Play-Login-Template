
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
object CustomFieldInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<div class=""""),_display_(/*3.14*/if(elements.hasErrors)/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""error""")))}),format.raw/*3.44*/("""">
    <div class="input form-group">
    	<label> """),_display_(/*5.15*/elements/*5.23*/.label),format.raw/*5.29*/(""" """),format.raw/*5.30*/("""</label>
    	 """),_display_(/*6.8*/elements/*6.16*/.input),format.raw/*6.22*/("""
       	"""),format.raw/*7.9*/("""<span class="btn-margin-left" style="display:block"> """),_display_(/*7.63*/elements/*7.71*/.errors.mkString(", ")),format.raw/*7.93*/(""" """),format.raw/*7.94*/("""</span> 
    </div>
</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/CustomFieldInput.scala.html
                  HASH: 323fa0b16096f1e82b9ebfcf6b6a5a8d6816c699
                  MATRIX: 530->1|650->33|678->35|717->48|747->70|786->72|822->78|900->130|916->138|942->144|970->145|1011->161|1027->169|1053->175|1088->184|1168->238|1184->246|1226->268|1254->269
                  LINES: 19->1|22->1|24->3|24->3|24->3|24->3|24->3|26->5|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|28->7|28->7
                  -- GENERATED --
              */
          