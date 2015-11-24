
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ferlinux/activator-dist-1.3.6/spinner-bank-pruebas/conf/routes
// @DATE:Thu Nov 12 15:46:30 COT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movements/$idProduct<[^/]+>""", """controllers.Application.findMovementById(idProduct:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/products""", """controllers.Application.findProductsClient(documentType:String, documentNumber:Int)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_findMovementById2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movements/"), DynamicPart("idProduct", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_findMovementById2_invoker = createInvoker(
    Application_1.findMovementById(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findMovementById",
      Seq(classOf[Int]),
      "GET",
      """Consultar movimientos de una cuenta""",
      this.prefix + """movements/$idProduct<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_findProductsClient3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("documentType", """[^/]+""",true), StaticPart("/"), DynamicPart("documentNumber", """[^/]+""",true), StaticPart("/products")))
  )
  private[this] lazy val controllers_Application_findProductsClient3_invoker = createInvoker(
    Application_1.findProductsClient(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findProductsClient",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/products"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_Application_findMovementById2_route(params) =>
      call(params.fromPath[Int]("idProduct", None)) { (idProduct) =>
        controllers_Application_findMovementById2_invoker.call(Application_1.findMovementById(idProduct))
      }
  
    // @LINE:14
    case controllers_Application_findProductsClient3_route(params) =>
      call(params.fromPath[String]("documentType", None), params.fromPath[Int]("documentNumber", None)) { (documentType, documentNumber) =>
        controllers_Application_findProductsClient3_invoker.call(Application_1.findProductsClient(documentType, documentNumber))
      }
  }
}