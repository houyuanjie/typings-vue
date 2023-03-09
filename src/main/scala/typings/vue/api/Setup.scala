package typings.vue.api

import scala.scalajs.js

sealed trait Setup extends js.Function
trait SetupWithoutProps extends Setup with js.Function0[js.Object]
trait SetupWithProps[P] extends Setup with js.Function1[P, js.Object]
trait SetupWithPropsAndContext[P] extends Setup with js.Function2[P, js.Dynamic, js.Object]
