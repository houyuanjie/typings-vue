package typings.vue.api

import scala.scalajs.js
import scala.scalajs.js.|

trait Lifecycle extends js.Object:
  def onMounted(callback: js.Function0[Unit]): Unit
  def onUpdated(callback: js.Function0[Unit]): Unit
  def onUnmounted(callback: js.Function0[Unit]): Unit
  def onBeforeMount(callback: js.Function0[Unit]): Unit
  def onBeforeUpdate(callback: js.Function0[Unit]): Unit
  def onBeforeUnmount(callback: js.Function0[Unit]): Unit
  def onErrorCaptured(callback: js.Function3[js.Any, js.Any, String, Boolean | Unit]): Unit
  def onActivated(callback: js.Function0[Unit]): Unit
  def onDeactivated(callback: js.Function0[Unit]): Unit
