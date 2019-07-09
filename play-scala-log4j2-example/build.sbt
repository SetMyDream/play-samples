val log4jVersion = "2.12.0"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLogback)
  .settings(
    name := """play-2.6-log4j2""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.0",
    libraryDependencies ++= Seq(
      guice,
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4jVersion,
      "org.apache.logging.log4j" % "log4j-api" % log4jVersion,
      "org.apache.logging.log4j" % "log4j-core" % log4jVersion,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0-M3" % Test,
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
