
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[scala.Tuple2[String, String]],play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page:String,loginform: Form[(String,String)])(implicit flash:play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(CustomFieldInput.f) }};
Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.70*/(""" 

"""),_display_(/*7.2*/main("Enter Details",page,"Guest",false)/*7.42*/{_display_(Seq[Any](format.raw/*7.43*/("""   
	"""),format.raw/*8.2*/("""<div class="row">
		<div class="col-sm-7 col-md-7">				
				"""),_display_(/*10.6*/flash/*10.11*/.get("failed").map/*10.29*/ { message =>_display_(Seq[Any](format.raw/*10.42*/("""
				"""),format.raw/*11.5*/("""<div class="alert alert-dismissable alert-danger panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Operation Failed!</strong> """),_display_(/*13.42*/message),format.raw/*13.49*/("""
				"""),format.raw/*14.5*/("""</div>
				""")))}),format.raw/*15.6*/("""
				
				 """),_display_(/*17.7*/flash/*17.12*/.get("successCreate").map/*17.37*/ { message =>_display_(Seq[Any](format.raw/*17.50*/("""
				"""),format.raw/*18.5*/("""<div class="alert alert-dismissable alert-success panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Operation Complete!</strong> """),_display_(/*20.44*/message),format.raw/*20.51*/("""
				"""),format.raw/*21.5*/("""</div>
				""")))}),format.raw/*22.6*/("""
			
		 		"""),_display_(/*24.7*/flash/*24.12*/.get("successOut").map/*24.34*/ { message =>_display_(Seq[Any](format.raw/*24.47*/("""
				"""),format.raw/*25.5*/("""<div class="alert alert-dismissable alert-warning panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Operation Complete!</strong> """),_display_(/*27.44*/message),format.raw/*27.51*/("""
				"""),format.raw/*28.5*/("""</div>
				""")))}),format.raw/*29.6*/("""
		"""),format.raw/*30.3*/("""</div>
	</div>
	
	<div class="row">
		<div class="col-sm-5 col-md-5">	
			<div class="well panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Login Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*41.8*/helper/*41.14*/.form(routes.Application.authenticate(),'id->"loginForm")/*41.71*/ {_display_(Seq[Any](format.raw/*41.73*/("""
        			"""),format.raw/*42.12*/("""<fieldset>
        	    		 """),_display_(/*43.18*/inputText(loginform("email"), '_label -> "Email", 'class -> "form-control formInline",'placeholder->"Registered Email")),format.raw/*43.137*/("""
           				 """),_display_(/*44.18*/inputText(loginform("password"), '_label -> "Password", 'class -> "form-control formInline", 'type->"password",'placeholder->"Password")),format.raw/*44.154*/("""
					"""),format.raw/*45.6*/("""</fieldset>
    
    				<div class="panel-custom-margin" >
     					<input type="submit" value="login" class="btn btn-success btn-margin-left"> or 
        				<a href=""""),_display_(/*49.23*/routes/*49.29*/.Application.home("Home","Guest",false)),format.raw/*49.68*/("""" class="btn btn-default">Cancel</a> 
        			</div>
        			""")))}),format.raw/*51.13*/("""				
				"""),format.raw/*52.5*/("""</div>
			</div>
			<div>
			<img src=""""),_display_(/*55.15*/routes/*55.21*/.Assets.at("images/login2.jpeg")),format.raw/*55.53*/("""" width=100% style="margin:0 auto;display:block" >
			</div>
		</div>
		
		<div class="col-sm-7 col-md-7">
			<div class="row">
				<div class="col-sm-5 col-md-5">
					<img src=""""),_display_(/*62.17*/routes/*62.23*/.Assets.at("images/scalaimage.png")),format.raw/*62.58*/("""" alt="scala" width=100%>
				</div>
				
				<div class="col-md-7">
					<ul>
						<li>
							<div>
								<h4>
									<strong>Passionate Team of Scala Developers</strong>
								</h4>
								
								<div>
									<p>	We have one of the biggest team of Scala
										Developers in India, possibly the world. Our team is
										passionate about Scala and believes in writing clean code.
									</p>
								</div>


							</div>
						</li>

						<li>
							<div>
								<h4>
									<strong>Technology Stack </strong>
								</h4>
								
								<div >
									<p> Because of our commitment towards Scala
										, we have evolved best practices and tools for application
										development. Our toolset is one of the most evolved for
										efficient software development. Look at the <span class="italic">stack
										that we use</span>.
									</p>
									
								</div>
							</div>
						</li>

						<li>
							<div>
								<h4>	
									<strong>Proven Results &amp; Satisfied Partners </strong>
								</h4>
						
								<div>
									<p> We have delivered / deployed quite a few applications on
									    Scala which are robust, scalable, extensible and are running
									    successfully. Our partners have been highly satisfied with
									    our understanding, knowledge, communication and delivery.
									    Please refer to our testimonials	and you would get an idea of what we mean.
									</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
""")))}))}
  }

  def render(page:String,loginform:Form[scala.Tuple2[String, String]],flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,loginform)(flash)

  def f:((String,Form[scala.Tuple2[String, String]]) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,loginform) => (flash) => apply(page,loginform)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 14:18:05 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/login.scala.html
                  HASH: 5d0c953e3017be6cb5b9bc1d54e999d100ee3ce7
                  MATRIX: 559->1|735->103|767->127|841->82|869->101|897->171|926->175|974->215|1012->216|1043->221|1130->282|1144->287|1171->305|1222->318|1254->323|1467->509|1495->516|1527->521|1569->533|1607->545|1621->550|1655->575|1706->588|1738->593|1954->782|1982->789|2014->794|2056->806|2093->817|2107->822|2138->844|2189->857|2221->862|2437->1051|2465->1058|2497->1063|2539->1075|2569->1078|2880->1363|2895->1369|2961->1426|3001->1428|3041->1440|3096->1468|3237->1587|3282->1605|3440->1741|3473->1747|3672->1919|3687->1925|3747->1964|3846->2032|3882->2041|3949->2081|3964->2087|4017->2119|4224->2299|4239->2305|4295->2340
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|28->8|30->10|30->10|30->10|30->10|31->11|33->13|33->13|34->14|35->15|37->17|37->17|37->17|37->17|38->18|40->20|40->20|41->21|42->22|44->24|44->24|44->24|44->24|45->25|47->27|47->27|48->28|49->29|50->30|61->41|61->41|61->41|61->41|62->42|63->43|63->43|64->44|64->44|65->45|69->49|69->49|69->49|71->51|72->52|75->55|75->55|75->55|82->62|82->62|82->62
                  -- GENERATED --
              */
          