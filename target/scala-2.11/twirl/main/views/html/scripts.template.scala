
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

/* scripts Template File */
object scripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* scripts Template File */
  def apply/*2.2*/(page: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.at("bootstrap/js/jquery-2.1.3.js")),format.raw/*4.63*/(""""></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*5.64*/(""""></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("jquery-validation-1.13.1/dist/jquery.validate.min.js")),format.raw/*6.87*/(""""></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("jquery-validation-1.13.1/dist/additional-methods.min.js")),format.raw/*7.90*/(""""></script>

<script>
$( document ).ready(function() """),format.raw/*10.32*/("""{"""),format.raw/*10.33*/("""
	"""),_display_(/*11.3*/if(page=="Login")/*11.20*/{_display_(Seq[Any](format.raw/*11.21*/("""
		"""),format.raw/*12.3*/("""$("#loginForm").validate("""),format.raw/*12.28*/("""{"""),format.raw/*12.29*/("""
			  """),format.raw/*13.6*/("""rules: """),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""
				    """),format.raw/*14.9*/("""email: """),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
				      """),format.raw/*15.11*/("""required: true,
				      email:true
				    """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""",
				    password: """),format.raw/*18.19*/("""{"""),format.raw/*18.20*/("""
				      """),format.raw/*19.11*/("""required: true,
				      minlength:8
				      """),format.raw/*21.11*/("""}"""),format.raw/*21.12*/("""
				    """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""
				"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/(""");
		""")))}),format.raw/*24.4*/("""
		"""),_display_(/*25.4*/if(page=="Register")/*25.24*/{_display_(Seq[Any](format.raw/*25.25*/("""
		"""),format.raw/*26.3*/("""$("#accountForm").validate("""),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""
		            """),format.raw/*27.15*/("""rules : """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
		                """),format.raw/*28.19*/("""name : """),format.raw/*28.26*/("""{"""),format.raw/*28.27*/("""
		                    """),format.raw/*29.23*/("""required : true
		                """),format.raw/*30.19*/("""}"""),format.raw/*30.20*/(""",
		                address : """),format.raw/*31.29*/("""{"""),format.raw/*31.30*/("""
		                    """),format.raw/*32.23*/("""required : true
		                """),format.raw/*33.19*/("""}"""),format.raw/*33.20*/(""",
		                company :"""),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
		                	"""),format.raw/*35.20*/("""required : true
		                """),format.raw/*36.19*/("""}"""),format.raw/*36.20*/(""",
		                email : """),format.raw/*37.27*/("""{"""),format.raw/*37.28*/("""
		                    """),format.raw/*38.23*/("""required : true,
		                    email : true
		                """),format.raw/*40.19*/("""}"""),format.raw/*40.20*/(""",
		                password : """),format.raw/*41.30*/("""{"""),format.raw/*41.31*/("""
		                    """),format.raw/*42.23*/("""required : true,
		                    minlength : 8
		                """),format.raw/*44.19*/("""}"""),format.raw/*44.20*/(""",
		                password_confirm: """),format.raw/*45.37*/("""{"""),format.raw/*45.38*/("""
							"""),format.raw/*46.8*/("""required: true,
							minlength: 8,
							equalTo: "#password"
						"""),format.raw/*49.7*/("""}"""),format.raw/*49.8*/(""",
		                phone : """),format.raw/*50.27*/("""{"""),format.raw/*50.28*/("""
		                	"""),format.raw/*51.20*/("""digits : true,
		                    required : true,
		                    maxlength : 10,
		                    minlength : 10
		                """),format.raw/*55.19*/("""}"""),format.raw/*55.20*/("""
		            """),format.raw/*56.15*/("""}"""),format.raw/*56.16*/("""
		        """),format.raw/*57.11*/("""}"""),format.raw/*57.12*/(""");
		""")))}),format.raw/*58.4*/("""
		
		"""),_display_(/*60.4*/if(page=="Edit")/*60.20*/{_display_(Seq[Any](format.raw/*60.21*/("""
		"""),format.raw/*61.3*/("""$("#accountForm").validate("""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/("""
		            """),format.raw/*62.15*/("""rules : """),format.raw/*62.23*/("""{"""),format.raw/*62.24*/("""
		                """),format.raw/*63.19*/("""name : """),format.raw/*63.26*/("""{"""),format.raw/*63.27*/("""
		                    """),format.raw/*64.23*/("""required : true
		                """),format.raw/*65.19*/("""}"""),format.raw/*65.20*/(""",
		                password : """),format.raw/*66.30*/("""{"""),format.raw/*66.31*/("""
		                    """),format.raw/*67.23*/("""required : true,
		                    minlength : 8
		                """),format.raw/*69.19*/("""}"""),format.raw/*69.20*/(""",
		                password_confirm: """),format.raw/*70.37*/("""{"""),format.raw/*70.38*/("""
							"""),format.raw/*71.8*/("""required: true,
							minlength: 5,
							equalTo: "#password"
						"""),format.raw/*74.7*/("""}"""),format.raw/*74.8*/(""",
		                phone : """),format.raw/*75.27*/("""{"""),format.raw/*75.28*/("""	                	
		                	"""),format.raw/*76.20*/("""digits : true,
		                    required : true,
		                    maxlength : 10,
		                    minlength : 10
		                """),format.raw/*80.19*/("""}"""),format.raw/*80.20*/(""",
		                address : """),format.raw/*81.29*/("""{"""),format.raw/*81.30*/("""
		                    """),format.raw/*82.23*/("""required : true
		                """),format.raw/*83.19*/("""}"""),format.raw/*83.20*/(""",
		                company :"""),format.raw/*84.28*/("""{"""),format.raw/*84.29*/("""
		                	"""),format.raw/*85.20*/("""required : true
		                """),format.raw/*86.19*/("""}"""),format.raw/*86.20*/("""
		            """),format.raw/*87.15*/("""}"""),format.raw/*87.16*/("""
		        """),format.raw/*88.11*/("""}"""),format.raw/*88.12*/(""");
		""")))}),format.raw/*89.4*/("""
		
		
		
		"""),_display_(/*93.4*/if(page=="Profile")/*93.23*/{_display_(Seq[Any](format.raw/*93.24*/("""
		
		"""),format.raw/*95.3*/("""$( "#uploadForm" ).validate("""),format.raw/*95.31*/("""{"""),format.raw/*95.32*/("""
  			"""),format.raw/*96.6*/("""rules: """),format.raw/*96.13*/("""{"""),format.raw/*96.14*/("""
    			"""),format.raw/*97.8*/("""fileUpload : """),format.raw/*97.21*/("""{"""),format.raw/*97.22*/("""
      			"""),format.raw/*98.10*/("""required : true,
      			accept: "image/*"
    			"""),format.raw/*100.8*/("""}"""),format.raw/*100.9*/("""
  			"""),format.raw/*101.6*/("""}"""),format.raw/*101.7*/("""
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/(""");
		""")))}),format.raw/*103.4*/("""
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/(""");
</script>

"""))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Mar 10 16:55:15 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/scripts.scala.html
                  HASH: 34ef0a896dfe227eed27a998a4c2f99543d5429f
                  MATRIX: 553->29|655->43|683->45|723->59|737->65|799->107|851->133|865->139|928->182|980->208|994->214|1080->280|1132->306|1146->312|1235->381|1316->434|1345->435|1374->438|1400->455|1439->456|1469->459|1522->484|1551->485|1584->491|1619->498|1648->499|1684->508|1719->515|1748->516|1787->527|1859->572|1888->573|1936->593|1965->594|2004->605|2080->653|2109->654|2145->663|2174->664|2206->669|2234->670|2270->676|2300->680|2329->700|2368->701|2398->704|2453->731|2482->732|2525->747|2561->755|2590->756|2637->775|2672->782|2701->783|2752->806|2814->840|2843->841|2901->871|2930->872|2981->895|3043->929|3072->930|3129->959|3158->960|3206->980|3268->1014|3297->1015|3353->1043|3382->1044|3433->1067|3531->1137|3560->1138|3619->1169|3648->1170|3699->1193|3798->1264|3827->1265|3893->1303|3922->1304|3957->1312|4055->1383|4083->1384|4139->1412|4168->1413|4216->1433|4391->1580|4420->1581|4463->1596|4492->1597|4531->1608|4560->1609|4596->1615|4629->1622|4654->1638|4693->1639|4723->1642|4778->1669|4807->1670|4850->1685|4886->1693|4915->1694|4962->1713|4997->1720|5026->1721|5077->1744|5139->1778|5168->1779|5227->1810|5256->1811|5307->1834|5406->1905|5435->1906|5501->1944|5530->1945|5565->1953|5663->2024|5691->2025|5747->2053|5776->2054|5842->2092|6017->2239|6046->2240|6104->2270|6133->2271|6184->2294|6246->2328|6275->2329|6332->2358|6361->2359|6409->2379|6471->2413|6500->2414|6543->2429|6572->2430|6611->2441|6640->2442|6676->2448|6715->2461|6743->2480|6782->2481|6815->2487|6871->2515|6900->2516|6933->2522|6968->2529|6997->2530|7032->2538|7073->2551|7102->2552|7140->2562|7219->2613|7248->2614|7282->2620|7311->2621|7342->2624|7371->2625|7408->2631|7437->2632|7466->2633
                  LINES: 19->2|22->2|24->4|24->4|24->4|24->4|25->5|25->5|25->5|26->6|26->6|26->6|27->7|27->7|27->7|30->10|30->10|31->11|31->11|31->11|32->12|32->12|32->12|33->13|33->13|33->13|34->14|34->14|34->14|35->15|37->17|37->17|38->18|38->18|39->19|41->21|41->21|42->22|42->22|43->23|43->23|44->24|45->25|45->25|45->25|46->26|46->26|46->26|47->27|47->27|47->27|48->28|48->28|48->28|49->29|50->30|50->30|51->31|51->31|52->32|53->33|53->33|54->34|54->34|55->35|56->36|56->36|57->37|57->37|58->38|60->40|60->40|61->41|61->41|62->42|64->44|64->44|65->45|65->45|66->46|69->49|69->49|70->50|70->50|71->51|75->55|75->55|76->56|76->56|77->57|77->57|78->58|80->60|80->60|80->60|81->61|81->61|81->61|82->62|82->62|82->62|83->63|83->63|83->63|84->64|85->65|85->65|86->66|86->66|87->67|89->69|89->69|90->70|90->70|91->71|94->74|94->74|95->75|95->75|96->76|100->80|100->80|101->81|101->81|102->82|103->83|103->83|104->84|104->84|105->85|106->86|106->86|107->87|107->87|108->88|108->88|109->89|113->93|113->93|113->93|115->95|115->95|115->95|116->96|116->96|116->96|117->97|117->97|117->97|118->98|120->100|120->100|121->101|121->101|122->102|122->102|123->103|124->104|124->104
                  -- GENERATED --
              */
          