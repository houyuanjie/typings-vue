package typings.vue.api

import scala.scalajs.js

trait Reactivity extends js.Object with ReactivityCore with ReactivityUtilities with ReactivityAdvanced

trait ReactivityCore extends js.Object:
  def ref(value: js.Any): js.Dynamic
  def computed(options: js.Object): js.Dynamic
  def reactive(target: js.Object): js.Dynamic
  def readonly(target: js.Object): js.Dynamic
  def watchEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic
  def watchPostEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic
  def watchSyncEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic
  def watch(source: js.Object, callback: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic

trait ReactivityUtilities extends js.Object:
  def isRef(r: js.Object): js.Dynamic
  def unref(ref: js.Object): js.Dynamic
  def toRef(`object`: js.Object, key: js.Any, defaultValue: js.UndefOr[js.Any] = js.undefined): js.Dynamic
  def toRefs(`object`: js.Object): js.Dynamic
  def isProxy(value: js.Any): Boolean
  def isReactive(value: js.Any): Boolean
  def isReadonly(value: js.Any): Boolean

trait ReactivityAdvanced extends js.Object:
  def shallowRef(value: js.Any): js.Dynamic
  def triggerRef(ref: js.Object): Unit
  def customRef(factory: js.Object): js.Dynamic
  def shallowReactive(target: js.Object): js.Dynamic
  def shallowReadonly(target: js.Object): js.Dynamic
  def toRaw(proxy: js.Any): js.Dynamic
  def markRaw(value: js.Object): js.Dynamic
  def effectScope(detached: js.UndefOr[Boolean]): js.Dynamic
  def getCurrentScope(): js.UndefOr[js.Dynamic]
  def onScopeDispose(fn: js.Function0[Unit]): Unit
