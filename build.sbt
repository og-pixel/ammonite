lazy val SCALA_2 = "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "ammonite",
    organizationName := "Ammonite",
    organization := "com.miloszjakubanis",
    version := "0.0.1",
  )
