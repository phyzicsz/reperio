import sbt._

name := "reperio"
licenses := Seq("Apache 2.0 License" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := Version.scala
crossScalaVersions := Version.crossScala

libraryDependencies ++= Dependencies.reperio(scalaVersion.value)

