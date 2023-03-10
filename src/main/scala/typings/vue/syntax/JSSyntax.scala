package typings.vue.syntax

import scala.scalajs.js

trait JSSyntax:
  inline def ^ = js.Dynamic.literal

object JSSyntax extends JSSyntax
