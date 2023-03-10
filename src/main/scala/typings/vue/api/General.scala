package typings.vue.api

import scala.scalajs.js

trait General extends js.Object:
  def version: String
  def nextTick(callback: js.UndefOr[js.Function0[Unit]] = js.undefined): js.Promise[Unit]
  def defineComponent(component: js.Object): js.Dynamic
  def defineAsyncComponent(source: js.Object): js.Dynamic
  def defineCustomElement(component: js.Object): js.Dynamic
