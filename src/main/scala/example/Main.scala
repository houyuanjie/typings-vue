package example

import typings.vue.*
import typings.vue.syntax.All.*
import scalatags.Text.all.*

@main
def run(): Unit =
  println("Hello Scala.js!")

  val app =
    Vue.createApp(
      ^(
        data = () =>
          ^(
            msg = "Hello Vue!",
            count = 0
          ),
        template = div(
          h2 {
            "{{msg}}"
          },
          button(vOn"click" := "count++") {
            "Count is: {{count}}"
          }
        ).toString
      )
    )

  app.mount("#app")
