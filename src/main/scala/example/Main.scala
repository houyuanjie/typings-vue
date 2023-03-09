package example

import typings.vue.{Vue, VueApp}

import scala.scalajs.js.Dynamic.literal as JSObject

@main
def run(): Unit =
  println("Hello Scala.js!")

  val app =
    Vue.createApp(
      JSObject(
        data = () =>
          JSObject(
            msg = "Hello Vue!"
          ),
        template = """{{msg}}"""
      )
    )

  app.mount("#app")
