
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
						<span class="glyphicon glyphicon-ok"><strong> Operation Complete!</strong></span> """),_display_(/*11.90*/message),format.raw/*11.97*/("""
						"""),format.raw/*12.7*/("""</div>
					""")))}),format.raw/*13.7*/("""			
	
	 				"""),_display_(/*15.8*/flash/*15.13*/.get("successIn").map/*15.34*/ { message =>_display_(Seq[Any](format.raw/*15.47*/("""
						"""),format.raw/*16.7*/("""<div class="alert alert-dismissable alert-success panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<span class="glyphicon glyphicon-ok">
						<strong>Operation Complete!</strong></span> """),_display_(/*19.52*/message),format.raw/*19.59*/("""
						"""),format.raw/*20.7*/("""</div>
					""")))}),format.raw/*21.7*/("""
			"""),format.raw/*22.4*/("""</div>
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
						"""),format.raw/*61.7*/("""{"""),format.raw/*61.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))"""),format.raw/*62.33*/("""{"""),format.raw/*62.34*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
								fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*64.8*/("""}"""),format.raw/*64.9*/("""
						"""),format.raw/*65.7*/("""}"""),format.raw/*65.8*/("""(document,"script","twitter-wjs");
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
						"""),format.raw/*125.7*/("""{"""),format.raw/*125.8*/("""
							"""),format.raw/*126.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))
							"""),format.raw/*128.8*/("""{"""),format.raw/*128.9*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*130.8*/("""}"""),format.raw/*130.9*/("""
						"""),format.raw/*131.7*/("""}"""),format.raw/*131.8*/("""(document,"script","twitter-wjs");
						</script>
				</div>
			</div>
		</div>
			
	</div>
""")))}),format.raw/*138.2*/("""
"""))}
  }

  def render(page:String,email:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,email)(flash)

  def f:((String,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,email) => (flash) => apply(page,email)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 16:41:33 IST 2015
                  SOURCE: /home/knoldus/GitRepos/Play-Login-Template/app/views/myprofile.scala.html
                  HASH: f695c04cd5b66857f29b2479777f2c711df47cc8
                  MATRIX: 581->29|730->90|757->92|815->142|853->143|882->146|976->215|989->220|1022->245|1072->258|1105->265|1365->498|1393->505|1427->512|1470->525|1509->538|1523->543|1553->564|1604->577|1638->584|1907->826|1935->833|1969->840|2012->853|2043->857|3540->2328|3568->2329|3712->2445|3741->2446|3898->2576|3926->2577|3960->2584|3988->2585|6547->5117|6576->5118|6612->5126|6764->5250|6793->5251|6950->5380|6979->5381|7014->5388|7043->5389|7168->5483
                  LINES: 19->2|22->2|23->3|23->3|23->3|25->5|28->8|28->8|28->8|28->8|29->9|31->11|31->11|32->12|33->13|35->15|35->15|35->15|35->15|36->16|39->19|39->19|40->20|41->21|42->22|81->61|81->61|82->62|82->62|84->64|84->64|85->65|85->65|145->125|145->125|146->126|148->128|148->128|150->130|150->130|151->131|151->131|158->138
                  -- GENERATED --
              */
          