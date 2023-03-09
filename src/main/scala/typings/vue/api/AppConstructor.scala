package typings.vue.api

import scala.scalajs.js

trait AppConstructor extends js.Object:
  def createApp(rootComponent: js.Object, rootProps: js.UndefOr[js.Object] = js.undefined): App
  def createSSRApp(rootComponent: js.Object, rootProps: js.UndefOr[js.Object] = js.undefined): App
