package typings.vue.api

import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.|

trait App extends js.Object:
  self =>
  def mount(rootContainer: Element | String): js.Dynamic
  def unmount(): Unit
  def provide(key: js.Symbol | String, value: js.Any): self.type
  def component(name: String): js.UndefOr[js.Dynamic]
  def component(name: String, component: js.Object): self.type
  def directive(name: String): js.UndefOr[js.Dynamic]
  def directive(name: String, directive: js.Object): self.type
  def use(plugin: js.Object, options: js.UndefOr[js.Array[js.Any]] = js.undefined): self.type
  def mixin(mixin: js.Object): self.type
  def version: String
  def config: js.Dynamic
