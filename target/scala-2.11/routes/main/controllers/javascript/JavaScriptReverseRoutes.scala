
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ferlinux/activator-dist-1.3.6/spinner-bank-pruebas/conf/routes
// @DATE:Thu Nov 12 15:46:30 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def findMovementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findMovementById",
      """
        function(idProduct) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movements/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idProduct", idProduct)})
        }
      """
    )
  
    // @LINE:14
    def findProductsClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findProductsClient",
      """
        function(documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber) + "/products"})
        }
      """
    )
  
  }


}