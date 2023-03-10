package typings.vue.api

import scala.scalajs.js

trait Injection extends js.Object:
  def provide(key: String, value: js.Any): Unit
  def inject(key: String): js.UndefOr[js.Dynamic]
  def inject(key: String, defaultValue: js.Any): js.Dynamic
  def inject(key: String, defaultValue: js.Function0[js.Any], treatDefaultAsFactory: Boolean): js.Dynamic
