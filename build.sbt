lazy val root = (project in file("."))
  .settings(
    name := "sandbox-zio",
    version := "0.1",
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.1"
    )
  )
