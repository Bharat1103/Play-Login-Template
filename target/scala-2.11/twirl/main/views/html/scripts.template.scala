
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

<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("jquery-validation-1.13.1/dist/jquery.validate.min.js")),format.raw/*7.87*/(""""></script>
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.at("jquery-validation-1.13.1/dist/additional-methods.min.js")),format.raw/*8.90*/(""""></script>
"""),_display_(/*9.2*/if(page=="Login")/*9.19*/{_display_(Seq[Any](format.raw/*9.20*/("""
"""),format.raw/*10.1*/("""<script>
$("#loginForm").validate("""),format.raw/*11.26*/("""{"""),format.raw/*11.27*/("""
	  """),format.raw/*12.4*/("""rules: """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""
		    """),format.raw/*13.7*/("""email: """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""
		      """),format.raw/*14.9*/("""required: true,
		      email:true
		    """),format.raw/*16.7*/("""}"""),format.raw/*16.8*/(""",
		    password: """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/("""
		      """),format.raw/*18.9*/("""required: true
		      """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
		    """),format.raw/*20.7*/("""}"""),format.raw/*20.8*/("""
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""");

</script>
""")))}),format.raw/*24.2*/("""
"""),_display_(/*25.2*/if(page=="Register"||page=="Edit")/*25.36*/{_display_(Seq[Any](format.raw/*25.37*/("""
"""),format.raw/*26.1*/("""<script>
$("#accountForm").validate("""),format.raw/*27.28*/("""{"""),format.raw/*27.29*/("""
            """),format.raw/*28.13*/("""rules : """),format.raw/*28.21*/("""{"""),format.raw/*28.22*/("""
                """),format.raw/*29.17*/("""name : """),format.raw/*29.24*/("""{"""),format.raw/*29.25*/("""
                    """),format.raw/*30.21*/("""required : true
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""",
                address : """),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
                    """),format.raw/*33.21*/("""required : true
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/(""",
                company :"""),format.raw/*35.26*/("""{"""),format.raw/*35.27*/("""
                	"""),format.raw/*36.18*/("""required : true,
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/(""",
                email : """),format.raw/*38.25*/("""{"""),format.raw/*38.26*/("""
                    """),format.raw/*39.21*/("""required : true,
                    email : true
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/(""",
                password : """),format.raw/*42.28*/("""{"""),format.raw/*42.29*/("""
                    """),format.raw/*43.21*/("""required : true,
                    minlength : 8
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""",
                phone : """),format.raw/*46.25*/("""{"""),format.raw/*46.26*/("""
                    """),format.raw/*47.21*/("""required : true
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");
</script>
""")))}))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 19:14:34 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/scripts.scala.html
                  HASH: 5f4983980fa0639bcb0d422952615c2f0e266aa0
                  MATRIX: 553->29|655->43|683->45|723->59|737->65|799->107|851->133|865->139|928->182|981->209|995->215|1081->281|1133->307|1147->313|1236->382|1274->395|1299->412|1337->413|1365->414|1427->448|1456->449|1487->453|1522->460|1551->461|1585->468|1620->475|1649->476|1685->485|1753->526|1781->527|1827->545|1856->546|1892->555|1942->578|1971->579|2005->586|2033->587|2063->590|2091->591|2136->606|2164->608|2207->642|2246->643|2274->644|2338->680|2367->681|2408->694|2444->702|2473->703|2518->720|2553->727|2582->728|2631->749|2691->781|2720->782|2776->810|2805->811|2854->832|2914->864|2943->865|2998->892|3027->893|3073->911|3134->944|3163->945|3217->971|3246->972|3295->993|3389->1059|3418->1060|3475->1089|3504->1090|3553->1111|3648->1178|3677->1179|3731->1205|3760->1206|3809->1227|3869->1259|3898->1260|3939->1273|3968->1274|4004->1283|4033->1284
                  LINES: 19->2|22->2|24->4|24->4|24->4|24->4|25->5|25->5|25->5|27->7|27->7|27->7|28->8|28->8|28->8|29->9|29->9|29->9|30->10|31->11|31->11|32->12|32->12|32->12|33->13|33->13|33->13|34->14|36->16|36->16|37->17|37->17|38->18|39->19|39->19|40->20|40->20|41->21|41->21|44->24|45->25|45->25|45->25|46->26|47->27|47->27|48->28|48->28|48->28|49->29|49->29|49->29|50->30|51->31|51->31|52->32|52->32|53->33|54->34|54->34|55->35|55->35|56->36|57->37|57->37|58->38|58->38|59->39|61->41|61->41|62->42|62->42|63->43|65->45|65->45|66->46|66->46|67->47|68->48|68->48|69->49|69->49|70->50|70->50
                  -- GENERATED --
              */
          