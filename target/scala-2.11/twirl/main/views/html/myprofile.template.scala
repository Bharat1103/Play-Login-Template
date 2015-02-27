
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

/* profile Template File */
object myprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* profile Template File */
  def apply/*2.2*/(page:String,email:String)(implicit flash:play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.63*/("""
"""),_display_(/*3.2*/main("DashBoard App Profile","Profile",email,true)/*3.52*/{_display_(Seq[Any](format.raw/*3.53*/("""

	"""),format.raw/*5.2*/("""<div class="row">
		<div class="col-sm-8 col-md-8">
			
					"""),_display_(/*8.7*/flash/*8.12*/.get("successUpdate").map/*8.37*/ { message =>_display_(Seq[Any](format.raw/*8.50*/("""
						"""),format.raw/*9.7*/("""<div class="alert alert-dismissable alert-info panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<strong>Operation Complete!</strong> """),_display_(/*11.45*/message),format.raw/*11.52*/("""
						"""),format.raw/*12.7*/("""</div>
					""")))}),format.raw/*13.7*/("""			
	
	 				"""),_display_(/*15.8*/flash/*15.13*/.get("successIn").map/*15.34*/ { message =>_display_(Seq[Any](format.raw/*15.47*/("""
						"""),format.raw/*16.7*/("""<div class="alert alert-dismissable alert-success panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<strong>Operation Complete!</strong> """),_display_(/*18.45*/message),format.raw/*18.52*/("""
						"""),format.raw/*19.7*/("""</div>
					""")))}),format.raw/*20.7*/("""
		"""),format.raw/*21.3*/("""</div>	
	</div>		
	
	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron panel-custom-margin">
				<h2>Bootstrap Template Loaded Successfully!</h2>
					<p>Welcome to Knoldus Intership Program [KIP]</p>
						<button type="button" class="btn btn-info" data-toggle="collapse"
							data-target="#Collapse-content">Know More</button>
			</div>
			<div id="Collapse-content" class="collapsing">
				<p>Welcome to Knoldus Software LLP. Here
				   you will find experts of Scala and Akka, we will help you build
				   high quality, efficient and scalable products. You might save a
				   lot of Time, Money and effort for building and maintaining your
				   automated systems by applying the scala paradigm at its core.
				</P>
				
				<P>The Akka and Play framework allows you to tap into the true
				   potential of your machine by incorporating every ounce of
				   computing power your CPU and Memory can spare for use.</p>
			</div>
		</div>	
	</div>	
""")))}),format.raw/*46.2*/("""
"""))}
  }

  def render(page:String,email:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,email)(flash)

  def f:((String,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,email) => (flash) => apply(page,email)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 12:43:39 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/myprofile.scala.html
                  HASH: 8494cd4c5e1149f18017070726f00b26d00f2764
                  MATRIX: 581->29|730->90|757->92|815->142|853->143|882->146|969->208|982->213|1015->238|1065->251|1098->258|1313->446|1341->453|1375->460|1418->473|1457->486|1471->491|1501->512|1552->525|1586->532|1804->723|1832->730|1866->737|1909->750|1939->753|2948->1732
                  LINES: 19->2|22->2|23->3|23->3|23->3|25->5|28->8|28->8|28->8|28->8|29->9|31->11|31->11|32->12|33->13|35->15|35->15|35->15|35->15|36->16|38->18|38->18|39->19|40->20|41->21|66->46
                  -- GENERATED --
              */
          