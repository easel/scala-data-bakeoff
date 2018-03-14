organization := "com.github.easel"

name := "scala-data-bakeoff"
version := "0.0.1-SNAPSHOT"
isSnapshot := true

scalaVersion := "2.11.8"
val sparkVersion = "2.0.2"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case n if n.startsWith("reference.conf") => MergeStrategy.concat
  case _ => MergeStrategy.deduplicate
}

resolvers in ThisBuild ++= Seq(
  Resolver.typesafeIvyRepo("releases"),
  Resolver.bintrayRepo("easel", "maven"),
  Resolver.bintrayRepo("7thsense", "maven")
)


lazy val root = project.in(file("./"))
    .dependsOn(core, elastic, solr)

lazy val core = project.in(file("./core"))
  .settings(libraryDependencies += Dependencies.ScalaTestCompile)

lazy val elastic = project.in(file("./elastic"))
  .dependsOn(core)
  .settings(libraryDependencies += Dependencies.Elastic4s)

lazy val solr = project.in(file("./solr"))
  .dependsOn(core)
