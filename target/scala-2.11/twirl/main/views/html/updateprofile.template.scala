
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

"""),_display_(/*7.2*/main("Update me",page,email,true)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
    
    """),format.raw/*9.5*/("""<!-- Begin page content -->
	<div class="row">
		<div class="col-sm-5 col-md-5">
			<div class="panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Update Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*18.8*/helper/*18.14*/.form(routes.Application.update(email),'id->"accountForm")/*18.72*/ {_display_(Seq[Any](format.raw/*18.74*/("""
        
        		 		"""),format.raw/*20.14*/("""<fieldset>
        
       			    		 """),_display_(/*22.19*/inputText(regform("name"), '_label -> "Name",'class -> "form-control formInline")),format.raw/*22.100*/("""
           					 """),_display_(/*23.19*/inputText(regform("email"), '_label -> "Email", 'class -> "form-control formInline")),format.raw/*23.103*/("""
					 		 """),_display_(/*24.11*/inputText(regform("password"), '_label -> "Password", 'type -> "password",'class -> "form-control formInline")),format.raw/*24.121*/("""
           					 """),_display_(/*25.19*/inputText(regform("phone"), '_label -> "Phone", 'class -> "form-control formInline")),format.raw/*25.103*/("""
							 """),_display_(/*26.10*/inputText(regform("address"), '_label -> "Address", 'class -> "form-control formInline")),format.raw/*26.98*/("""
						   	 """),_display_(/*27.13*/inputText(regform("company"), '_label -> "Company", 'class -> "form-control formInline")),format.raw/*27.101*/("""
				 				 
	    				"""),format.raw/*29.10*/("""</fieldset>
        
        				<div class="panel-custom-margin" >
            				<input type="submit" value="Update WebUser" class="btn btn-success btn-margin-left"> or 
            				<a href=""""),_display_(/*33.27*/routes/*33.33*/.Application.home()),format.raw/*33.52*/("""" class="btn btn-default">Cancel</a> 
        				</div>
       				 """)))}),format.raw/*35.14*/("""	
    
    			"""),format.raw/*37.8*/("""</div>

			</div>
		</div>
			
		<div class="col-sm-5 col-md-5 test-margin" style="display:inline; height:20%; float:right">
			<div class="panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Twitter Widget</h3>
				</div>
				<div class="panel-body">
		
						<a class="twitter-timeline" href="https://twitter.com/Knolspeak" data-widget-id="571036056997199872">Tweets by @Knolspeak</a>
						<script>!function(d,s,id)"""),format.raw/*50.32*/("""{"""),format.raw/*50.33*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
						if(!d.getElementById(id))"""),format.raw/*51.32*/("""{"""),format.raw/*51.33*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
						fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*52.43*/("""}"""),format.raw/*52.44*/("""}"""),format.raw/*52.45*/("""(document,"script","twitter-wjs");</script>
				</div>
			</div>
		</div>
	</div>			
""")))}),format.raw/*57.2*/("""
"""))}
  }

  def render(page:String,email:String,regform:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(page,email,regform)

  def f:((String,String,Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (page,email,regform) => apply(page,email,regform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 18:50:22 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/updateprofile.scala.html
                  HASH: 928cc975f21ebb5a0e894063a780bccc135fa54e
                  MATRIX: 531->1|673->69|705->93|779->48|807->67|835->137|863->140|904->173|943->175|979->185|1296->476|1311->482|1378->540|1418->542|1469->565|1534->603|1637->684|1683->703|1789->787|1827->798|1959->908|2005->927|2111->1011|2148->1021|2257->1109|2297->1122|2407->1210|2456->1231|2682->1430|2697->1436|2737->1455|2838->1525|2879->1539|3400->2033|3429->2034|3572->2149|3601->2150|3749->2270|3778->2271|3807->2272|3923->2358
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|29->9|38->18|38->18|38->18|38->18|40->20|42->22|42->22|43->23|43->23|44->24|44->24|45->25|45->25|46->26|46->26|47->27|47->27|49->29|53->33|53->33|53->33|55->35|57->37|70->50|70->50|71->51|71->51|72->52|72->52|72->52|77->57
                  -- GENERATED --
              */
          