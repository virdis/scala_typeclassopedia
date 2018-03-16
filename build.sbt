name := "scala_typeclassopedia"

version := "0.0.1"

scalaVersion := "2.12.4"

val catsVersion = "1.0.1"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % catsVersion withSources() withJavadoc(),
  "org.typelevel" %% "cats-free" % catsVersion withSources() withJavadoc(),
  "org.typelevel" %% "cats-mtl-core" % "0.2.2" withSources() withJavadoc(),
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

scalacOptions ++= Seq(
  "-encoding", "UTF-8"
)

addCompilerPlugin("org.scalamacros" %% "paradise" % "2.1.1" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.5")