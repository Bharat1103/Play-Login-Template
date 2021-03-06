name := "play-login"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "com.typesafe.play"      %% "play-slick"    % "0.8.1",
  "postgresql"              % "postgresql"    % "9.1-901.jdbc4"
)
