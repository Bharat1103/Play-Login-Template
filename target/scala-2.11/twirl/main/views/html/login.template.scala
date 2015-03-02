
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
					<span class="glyphicon glyphicon-alert"><strong> Operation Failed!</span></strong> """),_display_(/*13.90*/message),format.raw/*13.97*/("""
				"""),format.raw/*14.5*/("""</div>
				""")))}),format.raw/*15.6*/("""
				
				 """),_display_(/*17.7*/flash/*17.12*/.get("successCreate").map/*17.37*/ { message =>_display_(Seq[Any](format.raw/*17.50*/("""
				"""),format.raw/*18.5*/("""<div class="alert alert-dismissable alert-success panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<span class="glyphicon glyphicon-ok">
						<strong>Operation Complete!</strong></span> """),_display_(/*21.52*/message),format.raw/*21.59*/("""
				"""),format.raw/*22.5*/("""</div>
				""")))}),format.raw/*23.6*/("""
			
		 		"""),_display_(/*25.7*/flash/*25.12*/.get("successOut").map/*25.34*/ { message =>_display_(Seq[Any](format.raw/*25.47*/("""
				"""),format.raw/*26.5*/("""<div class="alert alert-dismissable alert-warning panel-custom-margin ">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<span class="glyphicon glyphicon-ok">
						<strong>Operation Complete!</strong></span> """),_display_(/*29.52*/message),format.raw/*29.59*/("""
				"""),format.raw/*30.5*/("""</div>
				""")))}),format.raw/*31.6*/("""
		"""),format.raw/*32.3*/("""</div>
	</div>
	
	<div class="row">
		<div class="col-sm-5 col-md-5">	
			<div class="well panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Login Form</h3>
				</div>
			
				<div class="panel-body">
					 """),_display_(/*43.8*/helper/*43.14*/.form(routes.Application.authenticate(),'id->"loginForm")/*43.71*/ {_display_(Seq[Any](format.raw/*43.73*/("""
        			"""),format.raw/*44.12*/("""<fieldset>
        	    		 """),_display_(/*45.18*/inputText(loginform("email"), '_label -> "Email", 'class -> "form-control formInline",'placeholder->"Registered Email")),format.raw/*45.137*/("""
           				 """),_display_(/*46.18*/inputText(loginform("password"), '_label -> "Password", 'class -> "form-control formInline", 'type->"password",'placeholder->"Password")),format.raw/*46.154*/("""
					"""),format.raw/*47.6*/("""</fieldset>
    
    				<div class="panel-custom-margin" >
     					<input type="submit" value="login" class="btn btn-success btn-margin-left"> or 
        				<a href=""""),_display_(/*51.23*/routes/*51.29*/.Application.home("Home","Guest",false)),format.raw/*51.68*/("""" class="btn btn-default">Cancel</a> 
        			</div>
        			""")))}),format.raw/*53.13*/("""				
				"""),format.raw/*54.5*/("""</div>
			</div>
			<div>
			<img src=""""),_display_(/*57.15*/routes/*57.21*/.Assets.at("images/login2.jpeg")),format.raw/*57.53*/("""" width=100% style="margin:0 auto;display:block" >
			</div>
		</div>
		
		<div class="col-sm-7 col-md-7">
			<div class="row">
				<div class="col-sm-5 col-md-5">
					<img src=""""),_display_(/*64.17*/routes/*64.23*/.Assets.at("images/scalaimage.png")),format.raw/*64.58*/("""" alt="scala" width=100%>
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
                  DATE: Mon Mar 02 16:41:33 IST 2015
                  SOURCE: /home/knoldus/GitRepos/Play-Login-Template/app/views/login.scala.html
                  HASH: bd914935c905b8fdf5ebce244405575e2334ca85
                  MATRIX: 559->1|735->103|767->127|841->82|869->101|897->171|926->175|974->215|1012->216|1043->221|1130->282|1144->287|1171->305|1222->318|1254->323|1515->557|1543->564|1575->569|1617->581|1655->593|1669->598|1703->623|1754->636|1786->641|2053->881|2081->888|2113->893|2155->905|2192->916|2206->921|2237->943|2288->956|2320->961|2587->1201|2615->1208|2647->1213|2689->1225|2719->1228|3030->1513|3045->1519|3111->1576|3151->1578|3191->1590|3246->1618|3387->1737|3432->1755|3590->1891|3623->1897|3822->2069|3837->2075|3897->2114|3996->2182|4032->2191|4099->2231|4114->2237|4167->2269|4374->2449|4389->2455|4445->2490
                  LINES: 19->1|21->5|21->5|22->1|24->4|25->5|27->7|27->7|27->7|28->8|30->10|30->10|30->10|30->10|31->11|33->13|33->13|34->14|35->15|37->17|37->17|37->17|37->17|38->18|41->21|41->21|42->22|43->23|45->25|45->25|45->25|45->25|46->26|49->29|49->29|50->30|51->31|52->32|63->43|63->43|63->43|63->43|64->44|65->45|65->45|66->46|66->46|67->47|71->51|71->51|71->51|73->53|74->54|77->57|77->57|77->57|84->64|84->64|84->64
                  -- GENERATED --
              */
          