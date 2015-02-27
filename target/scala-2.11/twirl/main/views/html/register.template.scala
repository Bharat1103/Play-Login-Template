
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

/* login Template File */
object register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[User],play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template File */
  def apply/*2.2*/(page:String,regform: Form[User])(implicit flash:play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(CustomFieldInput.f) }};
Seq[Any](format.raw/*2.70*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.70*/(""" 

"""),_display_(/*8.2*/main("Register me ",page,"Guest",false)/*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""   
    """),format.raw/*9.5*/("""<div class="row">
		<div class="col-sm-5 col-md-5">
			"""),_display_(/*11.5*/flash/*11.10*/.get("failedCreate").map/*11.34*/ { message =>_display_(Seq[Any](format.raw/*11.47*/("""
				"""),format.raw/*12.5*/("""<div class="alert alert-dismissable alert-danger panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Operation Failed!</strong> """),_display_(/*14.42*/message),format.raw/*14.49*/("""
				"""),format.raw/*15.5*/("""</div>
			""")))}),format.raw/*16.5*/("""
			"""),format.raw/*17.4*/("""<div class="panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Registration Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*23.8*/helper/*23.14*/.form(routes.Application.registerme(),'id->"accountForm")/*23.71*/ {_display_(Seq[Any](format.raw/*23.73*/("""
        	
        	 			"""),format.raw/*25.14*/("""<fieldset>
        	    			"""),_display_(/*26.18*/inputText(regform("name"), '_label -> "Name",'class -> "form-control formInline")),format.raw/*26.99*/("""
           				 	"""),_display_(/*27.19*/inputText(regform("email"), '_label -> "Email", 'class -> "form-control formInline")),format.raw/*27.103*/("""
				 		 	"""),_display_(/*28.11*/inputText(regform("password"), '_label -> "Password", 'type -> "password" ,'class -> "form-control formInline")),format.raw/*28.122*/("""
           				 	"""),_display_(/*29.19*/inputText(regform("phone"), '_label -> "Phone", 'class -> "form-control formInline")),format.raw/*29.103*/("""
						 	"""),_display_(/*30.10*/inputText(regform("address"), '_label -> "Address", 'class -> "form-control formInline")),format.raw/*30.98*/("""
						 	"""),_display_(/*31.10*/inputText(regform("company"), '_label -> "Company", 'class -> "form-control formInline")),format.raw/*31.98*/("""
						"""),format.raw/*32.7*/("""</fieldset>
            		
            			<div class="panel-custom-margin" >
            				<input type="submit" value="Create WebUser" class="btn btn-success btn-margin-left"> or 
            				<a href=""""),_display_(/*36.27*/routes/*36.33*/.Application.home()),format.raw/*36.52*/("""" class="btn btn-default">Cancel</a> 
        				</div>
        
    				""")))}),format.raw/*39.10*/("""	
    
    			"""),format.raw/*41.8*/("""</div>
			</div>
		</div>
		
		<div class="col-sm-5 col-md-5 test-margin" style="display:inline; height:20%; float:right">
			<div class="panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Twitter Widget</h3>
				</div>
				<div class="panel-body">
		
						<a class="twitter-timeline" href="https://twitter.com/Knolspeak" data-widget-id="571036056997199872">Tweets by @Knolspeak</a>
						<script>!function(d,s,id)"""),format.raw/*53.32*/("""{"""),format.raw/*53.33*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
						if(!d.getElementById(id))"""),format.raw/*54.32*/("""{"""),format.raw/*54.33*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
						fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*55.43*/("""}"""),format.raw/*55.44*/("""}"""),format.raw/*55.45*/("""(document,"script","twitter-wjs");</script>
				</div>
			</div>
		</div>
	</div>	
""")))}))}
  }

  def render(page:String,regform:Form[User],flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,regform)(flash)

  def f:((String,Form[User]) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,regform) => (flash) => apply(page,regform)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 18:56:11 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/register.scala.html
                  HASH: db5d31b6cab64516ffc156ee3e9b728bfb443aa7
                  MATRIX: 580->27|743->116|775->140|849->95|877->114|905->184|934->188|981->227|1019->228|1053->236|1135->292|1149->297|1182->321|1233->334|1265->339|1478->525|1506->532|1538->537|1579->548|1610->552|1849->765|1864->771|1930->828|1970->830|2022->854|2077->882|2179->963|2225->982|2331->1066|2369->1077|2502->1188|2548->1207|2654->1291|2691->1301|2800->1389|2837->1399|2946->1487|2980->1494|3215->1702|3230->1708|3270->1727|3376->1802|3417->1816|3936->2308|3965->2309|4108->2424|4137->2425|4285->2545|4314->2546|4343->2547
                  LINES: 19->2|21->6|21->6|22->2|24->5|25->6|27->8|27->8|27->8|28->9|30->11|30->11|30->11|30->11|31->12|33->14|33->14|34->15|35->16|36->17|42->23|42->23|42->23|42->23|44->25|45->26|45->26|46->27|46->27|47->28|47->28|48->29|48->29|49->30|49->30|50->31|50->31|51->32|55->36|55->36|55->36|58->39|60->41|72->53|72->53|73->54|73->54|74->55|74->55|74->55
                  -- GENERATED --
              */
          