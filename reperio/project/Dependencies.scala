
import sbt._

object Version {
  val akka    = "2.5.23"
  val config  = "1.3.4"
  val logback = "1.2.3"
  val scala   = "2.12.7"
  val crossScala = List(scala, "2.12.7")
  val scalaLogging   = "3.9.2"
}

object Library {
  val akka              = "com.typesafe.akka" %% "akka-actor" % Version.akka
  val akkaslf4j         = "com.typesafe.akka" %% "akka-slf4j" % Version.akka
  val logback           = "ch.qos.logback" % "logback-classic" % Version.logback
  val scalaLogging      = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLogging
  val config            = "com.typesafe" % "config" % Version.config
}

object Dependencies {
  import Library._

  def reperio(scalaVersion: String) = List(
    akka,
    akkaslf4j,
    config,
    logback,
    scalaLogging,
    //logbackClassic % "test",
    //mockitoScala   % "test",
    //scalaTest      % "test"
  )
}