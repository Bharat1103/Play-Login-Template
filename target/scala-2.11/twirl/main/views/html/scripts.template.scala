
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

"""),format.raw/*11.1*/("""<script>
$("#loginForm").validate("""),format.raw/*12.26*/("""{"""),format.raw/*12.27*/("""
	  """),format.raw/*13.4*/("""rules: """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
		    """),format.raw/*14.7*/("""email: """),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""
		      """),format.raw/*15.9*/("""required: true,
		      email:true
		    """),format.raw/*17.7*/("""}"""),format.raw/*17.8*/(""",
		    password: """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""
		      """),format.raw/*19.9*/("""required: true
		      """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
		    """),format.raw/*21.7*/("""}"""),format.raw/*21.8*/("""
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""");

</script>
""")))}),format.raw/*25.2*/("""
"""),_display_(/*26.2*/if(page=="Register"||page=="Edit")/*26.36*/{_display_(Seq[Any](format.raw/*26.37*/("""
"""),format.raw/*27.1*/("""<script>
$("#accountForm").validate("""),format.raw/*28.28*/("""{"""),format.raw/*28.29*/("""
            """),format.raw/*29.13*/("""rules : """),format.raw/*29.21*/("""{"""),format.raw/*29.22*/("""
                """),format.raw/*30.17*/("""name : """),format.raw/*30.24*/("""{"""),format.raw/*30.25*/("""
                    """),format.raw/*31.21*/("""required : true
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/(""",
                address : """),format.raw/*33.27*/("""{"""),format.raw/*33.28*/("""
                    """),format.raw/*34.21*/("""required : true
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/(""",
                company :"""),format.raw/*36.26*/("""{"""),format.raw/*36.27*/("""
                	"""),format.raw/*37.18*/("""required : true,
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/(""",
                email : """),format.raw/*39.25*/("""{"""),format.raw/*39.26*/("""
                    """),format.raw/*40.21*/("""required : true,
                    email : true
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""",
                password : """),format.raw/*43.28*/("""{"""),format.raw/*43.29*/("""
                    """),format.raw/*44.21*/("""required : true,
                    minlength : 8
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/(""",
                phone : """),format.raw/*47.25*/("""{"""),format.raw/*47.26*/("""
                    """),format.raw/*48.21*/("""required : true
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""");
</script>
""")))}))}
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 27 21:20:55 IST 2015
                  SOURCE: /home/knoldus/play-login/app/views/scripts.scala.html
                  HASH: 3d5a7e13d2edff895c528ebdee86f63f5e5ec728
                  MATRIX: 553->29|655->43|683->45|723->59|737->65|799->107|851->133|865->139|928->182|981->209|995->215|1081->281|1133->307|1147->313|1236->382|1274->395|1299->412|1337->413|1366->415|1428->449|1457->450|1488->454|1523->461|1552->462|1586->469|1621->476|1650->477|1686->486|1754->527|1782->528|1828->546|1857->547|1893->556|1943->579|1972->580|2006->587|2034->588|2064->591|2092->592|2137->607|2165->609|2208->643|2247->644|2275->645|2339->681|2368->682|2409->695|2445->703|2474->704|2519->721|2554->728|2583->729|2632->750|2692->782|2721->783|2777->811|2806->812|2855->833|2915->865|2944->866|2999->893|3028->894|3074->912|3135->945|3164->946|3218->972|3247->973|3296->994|3390->1060|3419->1061|3476->1090|3505->1091|3554->1112|3649->1179|3678->1180|3732->1206|3761->1207|3810->1228|3870->1260|3899->1261|3940->1274|3969->1275|4005->1284|4034->1285
                  LINES: 19->2|22->2|24->4|24->4|24->4|24->4|25->5|25->5|25->5|27->7|27->7|27->7|28->8|28->8|28->8|29->9|29->9|29->9|31->11|32->12|32->12|33->13|33->13|33->13|34->14|34->14|34->14|35->15|37->17|37->17|38->18|38->18|39->19|40->20|40->20|41->21|41->21|42->22|42->22|45->25|46->26|46->26|46->26|47->27|48->28|48->28|49->29|49->29|49->29|50->30|50->30|50->30|51->31|52->32|52->32|53->33|53->33|54->34|55->35|55->35|56->36|56->36|57->37|58->38|58->38|59->39|59->39|60->40|62->42|62->42|63->43|63->43|64->44|66->46|66->46|67->47|67->47|68->48|69->49|69->49|70->50|70->50|71->51|71->51
                  -- GENERATED --
              */
          