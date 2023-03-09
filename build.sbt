enablePlugins(ScalaJSPlugin)

scalaVersion := "3.2.2"

name := "typings-vue"
version := "0.1.0-SNAPSHOT"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0"

scalaJSUseMainModuleInitializer := true
