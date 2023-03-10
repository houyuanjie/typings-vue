package typings.vue

import typings.vue.api.*

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSGlobal

final val VUE = "vue"

@js.native
// @JSImport(VUE, JSImport.Namespace)
@JSGlobal
object Vue extends js.Object with AppConstructor with General with Reactivity with Lifecycle with Injection:

  // AppConstructor
  def createApp(rootComponent: js.Object, rootProps: js.UndefOr[js.Object] = js.undefined): VueApp = js.native
  def createSSRApp(rootComponent: js.Object, rootProps: js.UndefOr[js.Object] = js.undefined): VueApp = js.native

  // General
  def version: String = js.native
  def nextTick(callback: js.UndefOr[js.Function0[Unit]] = js.undefined): js.Promise[Unit] = js.native
  def defineComponent(component: js.Object): js.Dynamic = js.native
  def defineAsyncComponent(source: js.Object): js.Dynamic = js.native
  def defineCustomElement(component: js.Object): js.Dynamic = js.native

  // ReactivityCore
  def ref(value: js.Any): js.Dynamic = js.native
  def computed(options: js.Object, debuggerOptions: js.UndefOr[js.Object] = js.undefined): js.Dynamic = js.native
  def reactive(target: js.Object): js.Dynamic = js.native
  def readonly(target: js.Object): js.Dynamic = js.native
  def watchEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic = js.native
  def watchPostEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic = js.native
  def watchSyncEffect(effect: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic = js.native
  def watch(source: js.Object, callback: js.Object, options: js.UndefOr[js.Object] = js.undefined): js.Dynamic =
    js.native

  // ReactivityUtilities
  def isRef(r: js.Any): js.Dynamic = js.native
  def unref(ref: js.Any): js.Dynamic = js.native
  def toRef(`object`: js.Object, key: js.Any, defaultValue: js.UndefOr[js.Any] = js.undefined): js.Dynamic = js.native
  def toRefs(`object`: js.Object): js.Dynamic = js.native
  def isProxy(value: js.Any): Boolean = js.native
  def isReactive(value: js.Any): Boolean = js.native
  def isReadonly(value: js.Any): Boolean = js.native

  // ReactivityAdvanced
  def shallowRef(value: js.Any): js.Dynamic = js.native
  def triggerRef(ref: js.Object): Unit = js.native
  def customRef(factory: js.Object): js.Dynamic = js.native
  def shallowReactive(target: js.Object): js.Dynamic = js.native
  def shallowReadonly(target: js.Object): js.Dynamic = js.native
  def toRaw(proxy: js.Any): js.Dynamic = js.native
  def markRaw(value: js.Object): js.Dynamic = js.native
  def effectScope(detached: js.UndefOr[Boolean] = js.undefined): js.Dynamic = js.native
  def getCurrentScope(): js.UndefOr[js.Dynamic] = js.native
  def onScopeDispose(fn: js.Function0[Unit]): Unit = js.native

  // Lifecycle
  def onMounted(callback: js.Function0[Unit]): Unit = js.native
  def onUpdated(callback: js.Function0[Unit]): Unit = js.native
  def onUnmounted(callback: js.Function0[Unit]): Unit = js.native
  def onBeforeMount(callback: js.Function0[Unit]): Unit = js.native
  def onBeforeUpdate(callback: js.Function0[Unit]): Unit = js.native
  def onBeforeUnmount(callback: js.Function0[Unit]): Unit = js.native
  def onErrorCaptured(callback: js.Function3[js.Any, js.Object | Null, String, Boolean | Unit]): Unit = js.native
  def onActivated(callback: js.Function0[Unit]): Unit = js.native
  def onDeactivated(callback: js.Function0[Unit]): Unit = js.native
  def onServerPrefetch(callback: js.Function0[js.Promise[js.Any]]): Unit = js.native

  // Injection
  def provide(key: String, value: js.Any): Unit = js.native
  def inject(key: String): js.UndefOr[js.Dynamic] = js.native
  def inject(key: String, defaultValue: js.Any): js.Dynamic = js.native
  def inject(key: String, defaultValue: js.Function0[js.Any], treatDefaultAsFactory: Boolean): js.Dynamic = js.native
