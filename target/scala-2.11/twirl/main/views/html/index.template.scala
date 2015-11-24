
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""



"""),_display_(/*5.2*/message),format.raw/*5.9*/("""

"""),format.raw/*7.1*/("""<dl>
<dt>Para consultar movimiento  de un productos</dt>
<dd>/movements/ """),format.raw/*9.17*/("""{"""),format.raw/*9.18*/("""idProduct"""),format.raw/*9.27*/("""}"""),format.raw/*9.28*/("""  """),format.raw/*9.30*/("""donde  idProduct para pruebas puede tomar valor de 1, 2 3,4,5 y 6</dd>
</dl>
<br>
<dl>
<dt>Para consultar productos dado  tipo y numero de documento</dt>
<dd>/user/"""),format.raw/*14.11*/("""{"""),format.raw/*14.12*/("""documentType"""),format.raw/*14.24*/("""}"""),format.raw/*14.25*/("""/"""),format.raw/*14.26*/("""{"""),format.raw/*14.27*/("""documentoNumber"""),format.raw/*14.42*/("""}"""),format.raw/*14.43*/("""/products     donde documentType puede ser  cc ó ce... y documentNumber puede ser 123 ó 456</dd>
</dl>



"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 12 16:09:29 COT 2015
                  SOURCE: /home/ferlinux/activator-dist-1.3.6/spinner-bank-pruebas/app/views/index.scala.html
                  HASH: 44b9546adbc0179217941f62d547a3d2de45c495
                  MATRIX: 527->1|639->18|669->23|695->30|723->32|823->105|851->106|887->115|915->116|944->118|1136->282|1165->283|1205->295|1234->296|1263->297|1292->298|1335->313|1364->314
                  LINES: 20->1|25->1|29->5|29->5|31->7|33->9|33->9|33->9|33->9|33->9|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14
                  -- GENERATED --
              */
          