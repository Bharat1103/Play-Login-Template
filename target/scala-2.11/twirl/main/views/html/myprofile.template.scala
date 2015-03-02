
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
		<div class="col-sm-10 col-md-10">
			<div>
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
			"""),format.raw/*21.4*/("""</div>
		</div>	
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
	
	<div class="row">	
		
		<div class="col-sm-5 col-md-5">
			<div class="well panel panel-default panel-custom-margin colormeGrey" style="display:block;">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Twitter Widget</h3>
				</div>
				<div class="panel-body">
					<a class="twitter-timeline" href="https://twitter.com/_JamesWard" 
						data-widget-id="572304327700520960" height=520>Tweets by @_JamesWard</a>
						<script>
						!function(d,s,id)
						"""),format.raw/*60.7*/("""{"""),format.raw/*60.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))"""),format.raw/*61.33*/("""{"""),format.raw/*61.34*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
								fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*63.8*/("""}"""),format.raw/*63.9*/("""
						"""),format.raw/*64.7*/("""}"""),format.raw/*64.8*/("""(document,"script","twitter-wjs");
						</script>
				</div>
			</div>
		</div>
		
		<div class="col-sm-4 col-md-4">
			<div class="well panel panel-default panel-custom-margin">
				<div class="panel-heading colormeBlack">
					<h3 class="panel-title colormeBlack">Main Menu</h3>
				</div>
				<div class="panel-body">
					<ul class="in-panel-marker">
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> Home</a></li>
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> License</a></li>
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> News Feeds</a></li>
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> Blog</a></li>
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> Wrapper</a></li>
						<li class="custom-pad"><a href="#"><span
							class="glyphicon glyphicon-ok"></span> Web Links</a></li>
					</ul>
				</div>
			</div>	
			
			<div class="well panel panel-default panel-custom-margin colormeGrey">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Polls</h3>
				</div>
				<div class="panel-body">
					<p>Sites of your Interest ?</p>
						<form>
							<div class="radio"><span><input type="radio" name="optradio"> Community</span></div>
							<div class="radio"><span></span><input type="radio" name="optradio"> eCommerce</span></div>
							<div class="radio"><span><input type="radio" name="optradio"> Blogs</span></div>
							<div class="radio"><span><input type="radio" name="optradio"> News</span></div>
							<div class="radio"><span><input type="radio" name="optradio"> Multimedia</span></div>
							<div class="radio"><span><input type="radio" name="optradio"> All</span></div>
							<button type="button"
									class="btn btn-default">Vote</button>
							<button type="button"
									class="btn btn-default btn-margin-left btn-margin-right">Results</button>
						</form>
				</div>
			</div>
		</div>
		<div class="col-sm-3 col-md-3">
			<div class="well panel panel-default panel-custom-margin colormeGrey" style="display:block">
				<div class="panel-heading colormeGrey">
					<h3 class="panel-title">Twitter Widget</h3>
				</div>
				<div class="panel-body">
		
						<a class="twitter-timeline" href="https://twitter.com/Knolspeak" data-widget-id="571036056997199872" height=520>Tweets by @Knolspeak</a>
						<script>
						!function(d,s,id)
						"""),format.raw/*124.7*/("""{"""),format.raw/*124.8*/("""
							"""),format.raw/*125.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))
							"""),format.raw/*127.8*/("""{"""),format.raw/*127.9*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*129.8*/("""}"""),format.raw/*129.9*/("""
						"""),format.raw/*130.7*/("""}"""),format.raw/*130.8*/("""(document,"script","twitter-wjs");
						</script>
				</div>
			</div>
		</div>
			
	</div>
""")))}),format.raw/*137.2*/("""
"""))}
  }

  def render(page:String,email:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,email)(flash)

  def f:((String,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,email) => (flash) => apply(page,email)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 14:43:37 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/myprofile.scala.html
                  HASH: 4df27337997bfb7fe35f188729937d024e0fcff2
                  MATRIX: 581->29|730->90|757->92|815->142|853->143|882->146|976->215|989->220|1022->245|1072->258|1105->265|1320->453|1348->460|1382->467|1425->480|1464->493|1478->498|1508->519|1559->532|1593->539|1811->730|1839->737|1873->744|1916->757|1947->761|3444->2232|3472->2233|3616->2349|3645->2350|3802->2480|3830->2481|3864->2488|3892->2489|6451->5021|6480->5022|6516->5030|6668->5154|6697->5155|6854->5284|6883->5285|6918->5292|6947->5293|7072->5387
                  LINES: 19->2|22->2|23->3|23->3|23->3|25->5|28->8|28->8|28->8|28->8|29->9|31->11|31->11|32->12|33->13|35->15|35->15|35->15|35->15|36->16|38->18|38->18|39->19|40->20|41->21|80->60|80->60|81->61|81->61|83->63|83->63|84->64|84->64|144->124|144->124|145->125|147->127|147->127|149->129|149->129|150->130|150->130|157->137
                  -- GENERATED --
              */
          