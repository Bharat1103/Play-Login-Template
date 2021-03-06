
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

"""),_display_(/*8.2*/main("Register",page,"Guest",false)/*8.37*/{_display_(Seq[Any](format.raw/*8.38*/("""   
   
    """),format.raw/*10.5*/("""<div class="row">
		<div class="col-sm-5 col-md-5">
			"""),_display_(/*12.5*/flash/*12.10*/.get("failedCreate").map/*12.34*/ { message =>_display_(Seq[Any](format.raw/*12.47*/("""
				"""),format.raw/*13.5*/("""<div class="alert alert-dismissable alert-danger panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<span class="glyphicon glyphicon-alert"><strong> Operation Failed!</span></strong> """),_display_(/*15.90*/message),format.raw/*15.97*/("""
				"""),format.raw/*16.5*/("""</div>
			""")))}),format.raw/*17.5*/("""
			"""),format.raw/*18.4*/("""<div class="well panel panel-default panel-custom-margin colormeGrey" >
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Registration Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*24.8*/helper/*24.14*/.form(routes.Application.registerme(),'id->"accountForm")/*24.71*/ {_display_(Seq[Any](format.raw/*24.73*/("""
        	
        	 			"""),format.raw/*26.14*/("""<fieldset>
        	    			 """),_display_(/*27.19*/inputText(regform("name"), '_label -> "Name",'class -> "form-control formInline",'placeholder->"Name")),format.raw/*27.121*/("""
           					 """),_display_(/*28.19*/inputText(regform("email"), '_label -> "Email", 'class -> "form-control formInline",'placeholder->"Email")),format.raw/*28.125*/("""
					 		 """),_display_(/*29.11*/inputText(regform("password"), '_label -> "Password", 'type -> "password",'class -> "form-control formInline",'placeholder->"Password")),format.raw/*29.146*/("""
					 		 """),_display_(/*30.11*/inputText(regform("password_confirm"), '_label -> "Confirm", 'type -> "password",'class -> "form-control formInline",'placeholder->"Confirm Password")),format.raw/*30.161*/("""
           					 """),_display_(/*31.19*/inputText(regform("phone"), '_label -> "Phone", 'class -> "form-control formInline",'placeholder->"Phone")),format.raw/*31.125*/("""
							 """),_display_(/*32.10*/inputText(regform("address"), '_label -> "Address", 'class -> "form-control formInline",'placeholder->"Address")),format.raw/*32.122*/("""
						   	 """),_display_(/*33.13*/inputText(regform("company"), '_label -> "Company", 'class -> "form-control formInline",'placeholder->"Company")),format.raw/*33.125*/("""
						"""),format.raw/*34.7*/("""</fieldset>
            		
            			<div class="panel-custom-margin" >
            				<input type="submit" value="Create WebUser" class="btn btn-success btn-margin-left"> or 
            				<a href=""""),_display_(/*38.27*/routes/*38.33*/.Application.home("Home")),format.raw/*38.58*/("""" class="btn btn-default">Cancel</a> 
        				</div>
        
    				""")))}),format.raw/*41.10*/("""	
    
    			"""),format.raw/*43.8*/("""</div>
			</div>
		</div>
		
		<div class="col-sm-5 col-md-5 test-margin">
			<div class="well panel panel-default panel-custom-margin colormeGrey" style="display:block; margin-left:0 auto;margin-right:0 auto">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Twitter Widget</h3>
				</div>
				<div class="panel-body">
		
						<a class="twitter-timeline" href="https://twitter.com/Knolspeak" data-widget-id="571036056997199872" height=400>Tweets by @Knolspeak</a>
						<script>
						!function(d,s,id)
						"""),format.raw/*57.7*/("""{"""),format.raw/*57.8*/("""
							"""),format.raw/*58.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))
							"""),format.raw/*60.8*/("""{"""),format.raw/*60.9*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*62.8*/("""}"""),format.raw/*62.9*/("""
						"""),format.raw/*63.7*/("""}"""),format.raw/*63.8*/("""(document,"script","twitter-wjs");
						</script>
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
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/register.scala.html
                  HASH: f7f255f10aa5854efef445cd51d78bedd3944b5d
                  MATRIX: 580->27|743->116|775->140|849->95|877->114|905->184|934->188|977->223|1015->224|1054->236|1136->292|1150->297|1183->321|1234->334|1266->339|1527->573|1555->580|1587->585|1628->596|1659->600|1904->819|1919->825|1985->882|2025->884|2077->908|2133->937|2257->1039|2303->1058|2431->1164|2469->1175|2626->1310|2664->1321|2836->1471|2882->1490|3010->1596|3047->1606|3181->1718|3221->1731|3355->1843|3389->1850|3624->2058|3639->2064|3685->2089|3791->2164|3832->2178|4394->2714|4422->2715|4457->2723|4608->2847|4636->2848|4792->2977|4820->2978|4854->2985|4882->2986
                  LINES: 19->2|21->6|21->6|22->2|24->5|25->6|27->8|27->8|27->8|29->10|31->12|31->12|31->12|31->12|32->13|34->15|34->15|35->16|36->17|37->18|43->24|43->24|43->24|43->24|45->26|46->27|46->27|47->28|47->28|48->29|48->29|49->30|49->30|50->31|50->31|51->32|51->32|52->33|52->33|53->34|57->38|57->38|57->38|60->41|62->43|76->57|76->57|77->58|79->60|79->60|81->62|81->62|82->63|82->63
                  -- GENERATED --
              */
          