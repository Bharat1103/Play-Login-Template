
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
object updateprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page:String,email:String, regform: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(CustomFieldInput.f) }};
Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.70*/("""

"""),_display_(/*7.2*/main("Update Details",page,email,true)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
    
    """),format.raw/*9.5*/("""<!-- Begin page content -->
	<div class="row">
		<div class="col-sm-5 col-md-5">
			<div class=" well panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Update Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*18.8*/helper/*18.14*/.form(routes.Application.update(email),'id->"accountForm")/*18.72*/ {_display_(Seq[Any](format.raw/*18.74*/("""
        
        		 		"""),format.raw/*20.14*/("""<fieldset>
        
       			    		 """),_display_(/*22.19*/inputText(regform("name"), '_label -> "Name",'class -> "form-control formInline",'placeholder->"Name")),format.raw/*22.121*/("""
					 		 """),_display_(/*23.11*/inputText(regform("password"), '_label -> "Password", 'type -> "password",'class -> "form-control formInline",'placeholder->"Password")),format.raw/*23.146*/("""
           					 """),_display_(/*24.19*/inputText(regform("password_confirm"), '_label -> "Confirm", 'type -> "password",'class -> "form-control formInline",'placeholder->"Confirm Password")),format.raw/*24.169*/("""
           					 """),_display_(/*25.19*/inputText(regform("phone"), '_label -> "Phone", 'class -> "form-control formInline",'placeholder->"Phone")),format.raw/*25.125*/("""
							 """),_display_(/*26.10*/inputText(regform("address"), '_label -> "Address", 'class -> "form-control formInline",'placeholder->"Address")),format.raw/*26.122*/("""
						   	 """),_display_(/*27.13*/inputText(regform("company"), '_label -> "Company", 'class -> "form-control formInline",'placeholder->"Company")),format.raw/*27.125*/("""
				 				 
	    				"""),format.raw/*29.10*/("""</fieldset>
        
        				<div class="panel-custom-margin" >
            				<input type="submit" value="Update WebUser" class="btn btn-success btn-margin-left"> or 
            				<a href=""""),_display_(/*33.27*/routes/*33.33*/.Application.myprofile(page,email)),format.raw/*33.67*/("""" class="btn btn-default">Cancel</a> 
        				</div>
       				 """)))}),format.raw/*35.14*/("""	
    
    			"""),format.raw/*37.8*/("""</div>

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
						"""),format.raw/*52.7*/("""{"""),format.raw/*52.8*/("""
							"""),format.raw/*53.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))
							"""),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*57.8*/("""}"""),format.raw/*57.9*/("""
						"""),format.raw/*58.7*/("""}"""),format.raw/*58.8*/("""(document,"script","twitter-wjs");
						</script>
				</div>
			</div>
		</div>
	</div>			
""")))}),format.raw/*64.2*/("""
"""))}
  }

  def render(page:String,email:String,regform:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(page,email,regform)

  def f:((String,String,Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (page,email,regform) => apply(page,email,regform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/updateprofile.scala.html
                  HASH: 855e6c2a0361ee2fd03daa33f293b6e3255964c3
                  MATRIX: 531->1|673->69|705->93|779->48|807->67|835->137|863->140|909->178|948->180|984->190|1307->487|1322->493|1389->551|1429->553|1480->576|1545->614|1669->716|1707->727|1864->862|1910->881|2082->1031|2128->1050|2256->1156|2293->1166|2427->1278|2467->1291|2601->1403|2650->1424|2876->1623|2891->1629|2946->1663|3047->1733|3088->1747|3652->2285|3680->2286|3715->2294|3866->2418|3894->2419|4050->2548|4078->2549|4112->2556|4140->2557|4263->2650
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|29->9|38->18|38->18|38->18|38->18|40->20|42->22|42->22|43->23|43->23|44->24|44->24|45->25|45->25|46->26|46->26|47->27|47->27|49->29|53->33|53->33|53->33|55->35|57->37|72->52|72->52|73->53|75->55|75->55|77->57|77->57|78->58|78->58|84->64
                  -- GENERATED --
              */
          