package typings.vue.syntax

import scalatags.Text.all.*

trait TextTagsSyntax:
  import TextTagsSyntax.mkDirectiveAttr

  val vText = attr("v-text")
  val vHtml = attr("v-html")
  val vShow = attr("v-show")
  val vIf = attr("v-if")
  val vElse = attr("v-else").empty
  val vElseIf = attr("v-else-if")
  val vFor = attr("v-for")
  val vOn = attr("v-on")
  val vBind = attr("v-bind")
  val vModel = attr("v-model")
  val vSlot = attr("v-slot")
  def vSlot(name: String) = attr("v-slot:" + name).empty
  val vPre = attr("v-pre").empty
  val vOnce = attr("v-once").empty
  val vMemo = attr("v-memo")
  val vCloak = attr("v-cloak").empty

  extension (sc: StringContext)
    def vOn(): Attr = mkDirectiveAttr("v-on:")(sc)
    def vBind(): Attr = mkDirectiveAttr("v-bind:")(sc)
    def vModel(): Attr = mkDirectiveAttr("v-model:")(sc)
    def vSlot(): Attr = mkDirectiveAttr("v-slot:")(sc)

object TextTagsSyntax extends TextTagsSyntax:
  private def mkDirectiveAttr(directive: String)(sc: StringContext): Attr =
    val name = sc.parts.mkString
    val directiveName = directive + name
    attr(directiveName)
