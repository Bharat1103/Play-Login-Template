
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
      _display_ {import helper._

Seq[Any](format.raw/*2.63*/("""
"""),_display_(/*4.2*/main("DashBoard App Profile","Profile",email,true)/*4.52*/{_display_(Seq[Any](format.raw/*4.53*/("""

	"""),format.raw/*6.2*/("""<div class="row">
		<div class="col-sm-10 col-md-10">
			<div>"""),format.raw/*8.59*/("""
					"""),_display_(/*9.7*/flash/*9.12*/.get("successUpdate").map/*9.37*/ { message =>_display_(Seq[Any](format.raw/*9.50*/("""
						"""),format.raw/*10.7*/("""<div class="alert alert-dismissable alert-info panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<span class="glyphicon glyphicon-ok"><strong> Operation Complete!</strong></span> """),_display_(/*12.90*/message),format.raw/*12.97*/("""
						"""),format.raw/*13.7*/("""</div>
					""")))}),format.raw/*14.7*/("""
					
					"""),_display_(/*16.7*/flash/*16.12*/.get("failedUpdate").map/*16.36*/ { message =>_display_(Seq[Any](format.raw/*16.49*/("""
						"""),format.raw/*17.7*/("""<div class="alert alert-dismissable alert-danger panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<span class="glyphicon glyphicon-alert"><strong> Operation Failed!</strong></span> """),_display_(/*19.91*/message),format.raw/*19.98*/("""
						"""),format.raw/*20.7*/("""</div>
					""")))}),format.raw/*21.7*/("""			
				
	
	 				"""),_display_(/*24.8*/flash/*24.13*/.get("successIn").map/*24.34*/ { message =>_display_(Seq[Any](format.raw/*24.47*/("""
						"""),format.raw/*25.7*/("""<div class="alert alert-dismissable alert-success panel-custom-margin ">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<span class="glyphicon glyphicon-ok">
						<strong>Operation Complete!</strong></span> """),_display_(/*28.52*/message),format.raw/*28.59*/("""
						"""),format.raw/*29.7*/("""</div>
					""")))}),format.raw/*30.7*/("""
			"""),format.raw/*31.4*/("""</div>
		</div>	
	</div>		
	
	<div class="row">
		<div class="col-md-3">		
			<div class="well img-fit" style="background-size: 100% 100%;
					background-image: url(/assets/images/"""),_display_(/*38.44*/{email}),format.raw/*38.51*/(""".jpeg)">
					<a class="btn btn-primary btn-sm" data-toggle="modal" data-target="#picUpload">
						<span class="glyphicon glyphicon-upload"></span>
					</a>
  					
					<!-- Modal -->
					<div class="modal fade" id="picUpload" tabindex="-1" role="dialog" aria-labelledby="picUploadLabel" aria-hidden="true">
  						<div class="modal-dialog">
    						<div class="modal-content">
      							<div class="modal-header">
       								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        							<h4 class="modal-title" id="myModalLabel">Setting Profile Picture</h4>
      							</div>
      						<div class="modal-body">
        						<strong>Upload Picture in Basic Image Format !</strong>
        						"""),_display_(/*53.16*/form(action = routes.Application.uploadFile(email), 'enctype -> "multipart/form-data" , 'id->"uploadForm")/*53.122*/ {_display_(Seq[Any](format.raw/*53.124*/("""
		 						"""),format.raw/*54.10*/("""<input type="file" name="fileUpload" id="fileUpload" class="form-control" >
 								<div class="modal-footer">
        							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        							<button type="submit" class="btn btn-primary">Save changes</button>
      							</div>
 								""")))}),format.raw/*59.11*/("""
 							"""),format.raw/*60.9*/("""</div>
      					</div>
  					</div>
				</div>
			</div>		
		</div>
		
		<div class="col-md-9">
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
						"""),format.raw/*101.7*/("""{"""),format.raw/*101.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))"""),format.raw/*102.33*/("""{"""),format.raw/*102.34*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
								fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*104.8*/("""}"""),format.raw/*104.9*/("""
						"""),format.raw/*105.7*/("""}"""),format.raw/*105.8*/("""(document,"script","twitter-wjs");
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
						"""),format.raw/*165.7*/("""{"""),format.raw/*165.8*/("""
							"""),format.raw/*166.8*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';
							if(!d.getElementById(id))
							"""),format.raw/*168.8*/("""{"""),format.raw/*168.9*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js,fjs);
							"""),format.raw/*170.8*/("""}"""),format.raw/*170.9*/("""
						"""),format.raw/*171.7*/("""}"""),format.raw/*171.8*/("""(document,"script","twitter-wjs");
						</script>
				</div>
			</div>
		</div>
			
	</div>
""")))}),format.raw/*178.2*/("""
"""))}
  }

  def render(page:String,email:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(page,email)(flash)

  def f:((String,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (page,email) => (flash) => apply(page,email)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/myprofile.scala.html
                  HASH: 81c5431a44369684a837a800a0aed378cd91dafa
                  MATRIX: 581->29|745->90|772->109|830->159|868->160|897->163|986->275|1018->282|1031->287|1064->312|1114->325|1148->332|1408->565|1436->572|1470->579|1513->592|1552->605|1566->610|1599->634|1650->647|1684->654|1947->890|1975->897|2009->904|2052->917|2096->935|2110->940|2140->961|2191->974|2225->981|2494->1223|2522->1230|2556->1237|2599->1250|2630->1254|2839->1436|2867->1443|3687->2236|3803->2342|3844->2344|3882->2354|4235->2676|4271->2685|5794->4181|5823->4182|5968->4298|5998->4299|6156->4429|6185->4430|6220->4437|6249->4438|8808->6970|8837->6971|8873->6979|9025->7103|9054->7104|9211->7233|9240->7234|9275->7241|9304->7242|9429->7336
                  LINES: 19->2|22->2|23->4|23->4|23->4|25->6|27->8|28->9|28->9|28->9|28->9|29->10|31->12|31->12|32->13|33->14|35->16|35->16|35->16|35->16|36->17|38->19|38->19|39->20|40->21|43->24|43->24|43->24|43->24|44->25|47->28|47->28|48->29|49->30|50->31|57->38|57->38|72->53|72->53|72->53|73->54|78->59|79->60|120->101|120->101|121->102|121->102|123->104|123->104|124->105|124->105|184->165|184->165|185->166|187->168|187->168|189->170|189->170|190->171|190->171|197->178
                  -- GENERATED --
              */
          