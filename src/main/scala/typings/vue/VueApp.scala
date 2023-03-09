package typings.vue

import typings.vue.api.App
import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSGlobal

@js.native
// @JSImport(VUE, JSImport.Namespace)
@JSGlobal
class VueApp extends js.Object with App:
  self =>
  def mount(rootContainer: Element | String): js.Dynamic = js.native
  def unmount(): Unit = js.native
  def provide(key: js.Symbol | String, value: js.Object): self.type = js.native
  def component(name: String): js.UndefOr[js.Dynamic] = js.native
  def component(name: String, component: js.Object): self.type = js.native
  def directive(name: String): js.UndefOr[js.Dynamic] = js.native
  def directive(name: String, directive: js.Object): self.type = js.native
  def use(plugin: js.Object, options: js.UndefOr[js.Array[js.Any]] = js.undefined): self.type = js.native
  def mixin(mixin: js.Object): self.type = js.native
  val version: String = js.native
  var config: js.Dynamic = js.native
