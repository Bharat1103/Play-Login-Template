
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,Boolean,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String,page:String,email:String,logedIn:Boolean)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        """),_display_(/*7.10*/title(page)),format.raw/*7.21*/("""
        """),_display_(/*8.10*/stylesheets(page)),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""</head>
    <body>
    	<div class="container-fluid full-content">
    		<div class="row custom-width">
    		
    		"""),_display_(/*14.8*/newnavme("Go!",page,email,logedIn)),format.raw/*14.42*/("""
    		"""),format.raw/*15.7*/("""</div>
    		<div class="header">
				<p style="text-align:center"><b>"""),_display_(/*17.38*/message),format.raw/*17.45*/("""</b></p> 
    		</div>
    		    		
    		"""),_display_(/*20.8*/content),format.raw/*20.15*/("""
    		
    		"""),format.raw/*22.7*/("""</div>
    		<div style="margin-top: 4%"  class="footer">
				<b>Powered by
				Bootstrap 3
				and	Play Framework @
				<span style="padding-bottom: 2%" class="glyphicon glyphicon-tree-deciduous" text-align="left">Knoldus Software LLP</span></b>
			</div>
		
			"""),_display_(/*30.5*/scripts(page)),format.raw/*30.18*/("""
   	"""),format.raw/*31.5*/("""</body>
</html>
"""))}
  }

  def render(message:String,page:String,email:String,logedIn:Boolean,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(message,page,email,logedIn)(content)

  def f:((String,String,String,Boolean) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (message,page,email,logedIn) => (content) => apply(message,page,email,logedIn)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/main.scala.html
                  HASH: e3c87515f3b233514cdc93e6422d04d5ead330bd
                  MATRIX: 531->1|692->74|720->76|790->120|821->131|857->141|894->158|925->163|1069->281|1124->315|1158->322|1256->393|1284->400|1353->443|1381->450|1422->464|1712->729|1746->742|1778->747
                  LINES: 19->1|22->1|24->3|28->7|28->7|29->8|29->8|30->9|35->14|35->14|36->15|38->17|38->17|41->20|41->20|43->22|51->30|51->30|52->31
                  -- GENERATED --
              */
          