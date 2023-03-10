enablePlugins(ScalaJSPlugin)

scalaVersion := "3.2.2"

name := "typings-vue"
version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.4.0",
  "com.lihaoyi" %%% "scalatags" % "0.12.0"
)

scalaJSUseMainModuleInitializer := true
