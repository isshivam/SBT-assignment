name := "SBT_assignment"

version := "0.1"

scalaVersion := "2.13.6"
lazy val http = project.in(file("http"))
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.2.6",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.15",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.2.6",
    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % "Test",
    libraryDependencies +="org.mockito" %% "mockito-scala" % "1.16.37" % "Test",

  )

lazy val actor = project.in(file("actor"))
  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.15" % "Test",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.15" % "Test"
  )







lazy val root = project.in(file(".")).aggregate(http, actor)

