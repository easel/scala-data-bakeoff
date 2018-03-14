import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object Dependencies {

  object Versions {
    val Akka: String = "2.4.11"
    val AkkaAWSECS = "0.0.1"
    val AkkaJS: String = "0.2.4.10"
    val AkkaPersistenceRedis = "0.5.0"
    val AkkaPersistenceInMemory = "1.3.10"
    val AkkaSSE: String = "1.8.0"
    val AkkaStreamExtensions = "0.10.0"
    val Alluxio = "1.0.1"
    val Avro4s = "1.3.2"
    val AWS = "1.11.48"
    //    val angularVersion = "1.4.4"
    val AsyncHttpClient = "2.0.19"
    val BooPickle = "1.1.0"
    val Bootstrap4 = "4.0.0-alpha.3"
    val BouncyCastle = "1.46"
    val Cats = "0.7.2"
    val CatsScalatest = "1.1.2"
    val Circe = "0.5.2"
    val CloudWatchMetrics = "0.4.0"
    val CommonsHttp = "4.5.2"
    val CommonsIo = "2.4"
    val Diode = "0.5.2"
    val Elastic4s = "2.3.2"
    val ElasticSearch = "2.3.4"
    val ElasticSearchSpark20 = "5.1.1"
    val Enums = "3.0"
    val EWSJavaApi = "2.1.0.ss.0"
    val FlyWay = "3.0.0"
    //    val jacksonVersion: String = "2.4.4"
    //    val kamonVersion: String = "0.4.0"
    val Guice = "4.1.0"
    val JBCrypt = "0.3m"
    val JodaConvert = "1.8"
    val JodaTime = "2.9.2"
    val Logback = "1.7.1"
    val LogbackLogstashEncoder = "4.7"
    val MacWire = "2.2.0"
    val Mockito = "1.9.5"
    val Netty3 = "3.10.6.Final"
    val Netty40 = "4.0.42.Final"
    val Netty41 = "4.1.5.Final"
    val PlayCirce = "2.5-0.4.1.ss.0"
    val PlayRedis = "2.4.1"
    val PlayMetrics = "2.5.0_0.5.0.ss.0"
    val PlayMockWs = "2.5.0"
    val RosHTTP = "1.0.1.ss.0"
    val Parquet = "2.1.0"
    val PostgresDriver = "9.4.1210"
    val React = "15.0.2"
    val ScalaCsv = "1.3.3"
    val ScalaIO = "0.4.3"
    val ScalaJsAngular = "0.7.0.ss.1"
    val ScalaJsCharts = "0.2"
    val ScalaJsDom = "0.8.2"
    val ScalaJsJavaTime = "0.1.0"
    val ScalaJsJquery = "0.8.0"
    val ScalaJsJQueryFacade = "1.0-RC6"
    val ScalaJsMoment = "0.1.5"
    val ScalaJsReact = "0.11.1"
    val ScalaJsReactComponents = "0.4.1"
    val ScalaCache = "0.9.1"
    val ScalaCheck = "1.13.1"
    val ScalaCss = "0.4.0"
    val Scalactic = "3.0.0"
    val ScalaTest = "3.0.0"
    val ScalaTestPlusPlay = "1.6.0.ss.0"
    val SCodec = "1.9.0"
    val SigarLoader = "1.6.6-rev002"
    val Slf4j = "1.7.21"
    val Slick = "3.1.1"
    val SlickPg = "0.14.3"
    val Slogging = "0.5.0"
    val SodaTime = "0.0.1.ss.0"
    val Squants = "0.6.2"
    val SSDateTime = "0.1.10"
    val SSCollections = "0.1.7-SNAPSHOT"
    val ThreetenBp = "1.3.3-SNAPSHOT"
    val TypesafeLogging = "3.4.0"
    val Univocity = "2.2.1"
    val XDotAiDiff = "1.2.0"
    //    val sparkVersion: String = "1.4.1"

  }

  val Akka = Def.setting(Seq(
    "com.theseventhsense.ec2akka" %% "ec2-akka" % Versions.AkkaAWSECS,
    "com.theseventhsense.ec2akka" %% "ecs-akka" % Versions.AkkaAWSECS,
    "com.typesafe.akka" %% "akka-actor" % Versions.Akka,
    "com.typesafe.akka" %% "akka-contrib" % Versions.Akka,
    "com.typesafe.akka" %% "akka-cluster" % Versions.Akka,
    "com.typesafe.akka" %% "akka-cluster-tools" % Versions.Akka,
    "com.typesafe.akka" %% "akka-cluster-sharding" % Versions.Akka,
    "com.typesafe.akka" %% "akka-cluster-metrics" % Versions.Akka,
    "com.typesafe.akka" %% "akka-http-core" % Versions.Akka,
    "com.typesafe.akka" %% "akka-http-experimental" % Versions.Akka,
    "com.typesafe.akka" %% "akka-parsing" % Versions.Akka,
    "com.typesafe.akka" %% "akka-persistence" % Versions.Akka,
    "com.typesafe.akka" %% "akka-stream" % Versions.Akka,
    "com.typesafe.akka" %% "akka-slf4j" % Versions.Akka,
    "com.mfglabs" %% "akka-stream-extensions" % Versions.AkkaStreamExtensions,
    "com.github.romix.akka" %% "akka-kryo-serialization" % "0.4.0"
//    "de.heikoseeberger" %% "akka-sse" % Versions.AkkaSSE
    //"com.mfglabs" %% "akka-stream-extensions-elasticsearch" % "0.7.3" intransitive(),
    //"com.mfglabs" %% "akka-stream-extensions-postgres" % "0.7.3" intransitive(),
    //"com.mfglabs" %% "commons-aws" % "0.7.2",
    //"org.querki" %% "requester" % "2.1"
  ))

  val AkkaJS = Def.setting(Seq(
    "eu.unicredit" %%% "akkajsactor" % "0.2.4.10",
    "eu.unicredit" %%% "akkajsactorstream" % "0.2.4.10"
  ))

  val AkkaPersistenceRedis = Def.setting(Seq(
    "com.hootsuite" %% "akka-persistence-redis" % Versions.AkkaPersistenceRedis
  ))

  val AkkaTestKit = Def.setting(Seq(
    "com.typesafe.akka" %% "akka-testkit" % Versions.Akka,
    "com.typesafe.akka" %% "akka-multi-node-testkit" % Versions.Akka,
    "com.github.dnvriend" %% "akka-persistence-inmemory" % Versions.AkkaPersistenceInMemory
  ))

  val Alluxio = Def.setting(Seq(
    "org.alluxio" % "alluxio-core-client" % Versions.Alluxio
  ))

  val Avro4s = Def.setting(Seq(
    "com.sksamuel.avro4s" %% "avro4s-core" % Versions.Avro4s
  ))

  val AWS = Def.setting(Seq(
    "com.amazonaws"       % "aws-java-sdk" % Versions.AWS,
    "com.github.dwhjames" %% "aws-wrap"    % "0.8.0.ss.0"
  ))

  val AsyncHttpClient = Def.setting(Seq(
    "org.asynchttpclient"       % "async-http-client" % Versions.AsyncHttpClient
  ))

  val BooPickle = Def.setting(Seq(
    "me.chrons" %%% "boopickle" % Versions.BooPickle
  ))

  val Bootstrap4 = Def.setting(Seq(
    "org.webjars.npm" % "bootstrap" % Versions.Bootstrap4
  ))

  val BouncyCastle = Def.setting(Seq(
    "org.bouncycastle" % "bcprov-jdk16" % Versions.BouncyCastle
  ))
  val Cats = Def.setting(Seq(
    "org.typelevel" %%% "cats" % Versions.Cats
  ))
  val CatsScalatestCompile = Def.setting(Seq(
    "com.ironcorelabs" %% "cats-scalatest" % Versions.CatsScalatest
  ))

  val CatsScalatest = Def.setting(Seq(
    "com.ironcorelabs" %% "cats-scalatest" % Versions.CatsScalatest % "test"
  ))
  val Circe = Def.setting(Seq(
    "io.circe" %%% "circe-core" % Versions.Circe,
    "io.circe" %%% "circe-generic" % Versions.Circe,
    "io.circe" %%% "circe-parser" % Versions.Circe
  ))

  val CloudWatchMetrics = Def.setting(Seq(
    "com.blacklocus" % "metrics-cloudwatch" % Versions.CloudWatchMetrics
  ))

  val CommonsHttp = Def.setting(Seq(
    "org.apache.httpcomponents" % "httpcore" % Versions.CommonsHttp,
    "org.apache.httpcomponents" % "httpclient" % Versions.CommonsHttp
  ))

  val CommonsIo = Def.setting(Seq(
    "commons-io" % "commons-io" % Versions.CommonsIo
  ))

  val Diode = Def.setting(Seq(
    "me.chrons" %%% "diode" % Versions.Diode,
    "me.chrons" %%% "diode-react" % Versions.Diode
  ))

  val Elastic4s = Def.setting(Seq(
    "com.sksamuel.elastic4s" %% "elastic4s-core" % Dependencies.Versions.Elastic4s,
    "com.sksamuel.elastic4s" %% "elastic4s-streams" % Dependencies.Versions.Elastic4s,
    "org.elasticsearch" % "elasticsearch" % Dependencies.Versions.ElasticSearch,
    "com.vividsolutions" % "jts" % "1.13"
  ))

  val ElasticSearchSpark = Def.setting(Seq(
    "org.elasticsearch" %% "elasticsearch-spark-20" % Versions.ElasticSearchSpark20
  ))

  val Enums = Def.setting(Seq(
    "org.julienrf" %%% "enum" % Versions.Enums
  ))

  val FlyWay = Def.setting(Seq(
    "org.flywaydb" %% "flyway-play" % Versions.FlyWay
  ))

  val Guice = Def.setting(Seq(
    "net.codingwell"               %% "scala-guice"         % Versions.Guice,
    "com.google.inject"            % "guice"                % Versions.Guice,
    "com.google.inject.extensions" % "guice-assistedinject" % Versions.Guice
  ))

  val JBCrypt = Def.setting(Seq(
    "org.mindrot" % "jbcrypt" % Versions.JBCrypt
  ))

  val JodaTime = Def.setting(Seq(
    "joda-time" % "joda-time" % Versions.JodaTime,
    "org.joda" % "joda-convert" % Versions.JodaConvert
  ))

  val Logback = Def.setting(Seq(
    "ch.qos.logback" % "logback-access" % "1.1.7",
    "ch.qos.logback" % "logback-classic" % "1.1.7",
    "ch.qos.logback" % "logback-core" % "1.1.7"
  ))

  val LogbackLogstashEncoder = Def.setting(Seq(
    "net.logstash.logback" % "logstash-logback-encoder" % Versions.LogbackLogstashEncoder
  ))

  val PlayCirce = Def.setting(Seq(
    "play-circe" %% "play-circe" % Versions.PlayCirce
  ))

  val PlayMetrics = Def.setting(Seq(
    "com.kenshoo" %% "metrics-play" % Versions.PlayMetrics
  ))

  val PlayMockWs = Def.setting(Seq(
    "de.leanovate.play-mockws" %% "play-mockws" % Versions.PlayMockWs % "test"
  ))

  val PlayRedis = Def.setting(Seq(
    "com.typesafe.play.modules" %% "play-modules-redis" % Versions.PlayRedis
  ))

  val RosHTTP = Def.setting(Seq(
    "fr.hmil" %%% "roshttp" % Versions.RosHTTP
  ))

  val ScalaCsv = Def.setting(Seq(
    "com.github.tototoshi" %% "scala-csv" % Versions.ScalaCsv
  ))

  val Squants = Def.setting(Seq(
    "com.squants"  %% "squants" % Versions.Squants
  ))

  val SSDateTime = Def.setting(Seq(
    "com.theseventhsense" %%% "utils-datetime" % Versions.SSDateTime
  ))

  val SSCollections = Def.setting(Seq(
    "com.theseventhsense" %%% "utils-collections" % Versions.SSCollections
  ))

  val SSCollectionsSpark = Def.setting(Seq(
    "com.theseventhsense" %% "utils-collections-spark" % Versions.SSCollections
  ))

  val SSCollectionsMapDB = Def.setting(Seq(
    "com.theseventhsense" %% "utils-collections-mapdb" % Versions.SSCollections
  ))

  val SSCollectionsCirce = Def.setting(Seq(
    "com.theseventhsense" %% "utils-collections-circe" % Versions.SSCollections
  ))

  val SSDateTimeCirce = Def.setting(Seq(
    "com.theseventhsense" %%% "utils-datetime-circe" % Versions.SSDateTime
  ))

  val SSDateTimePlayJson = Def.setting(Seq(
    "com.theseventhsense" %%% "utils-datetime-playjson" % Versions.SSDateTime
  ))

  val MacWire = Def.setting(Seq(
    "com.softwaremill.macwire" %%% "macros" % Versions.MacWire % "provided",
    "com.softwaremill.macwire" %%% "util" % Versions.MacWire,
    "com.softwaremill.macwire" %%% "proxy" % Versions.MacWire
  ))

  val Mockito = Def.setting(Seq(
    "org.mockito" % "mockito-core" % Versions.Mockito,
    "org.mockito" % "mockito-all" % Versions.Mockito
  ))

  val Netty3 = Def.setting(Seq(
    "io.netty" % "netty" % Versions.Netty3
  ))

  val Netty40 = Def.setting(Seq(
    "io.netty" % "netty-buffer" % Versions.Netty40,
    "io.netty" % "netty-codec" % Versions.Netty40,
    "io.netty" % "netty-codec-http" % Versions.Netty40,
    "io.netty" % "netty-common" % Versions.Netty40,
    "io.netty" % "netty-handler" % Versions.Netty40,
    "io.netty" % "netty-transport" % Versions.Netty40,
    "io.netty" % "netty-all" % Versions.Netty40
  ))

  val Netty41 = Def.setting(Seq(
    "io.netty" % "netty-buffer" % Versions.Netty41,
    "io.netty" % "netty-codec" % Versions.Netty41,
    "io.netty" % "netty-codec-http" % Versions.Netty41,
    "io.netty" % "netty-common" % Versions.Netty41,
    "io.netty" % "netty-handler" % Versions.Netty41,
    "io.netty" % "netty-transport" % Versions.Netty41,
    "io.netty" % "netty-all" % Versions.Netty41
  ))

  val Parquet = Def.setting(Seq(
    "com.twitter" % "parquet" % Versions.Parquet
  ))

  val PostgresDriver = Def.setting(Seq(
    "org.postgresql"      % "postgresql"           % Versions.PostgresDriver
  ))

  val React = Def.setting(Seq(
    ("org.webjars.npm" % "react" % Versions.React intransitive())
      / "react-with-addons.js"
      commonJSName "React"
      minified "react-with-addons.min.js",

    ("org.webjars.npm" % "react-dom" % Versions.React intransitive())
      / "react-dom.js"
      commonJSName "ReactDOM"
      minified "react-dom.min.js"
      dependsOn "react-with-addons.js"

    //    ("org.webjars.npm" % "react-bootstrap" % "0.28.1" intransitive())
    //      / "react-bootstrap.js"
    //      dependsOn s"react-with-addons.js"
    //      minified "react-bootstrap.min.js"
  ))

  val ScalaIO = Def.setting(Seq(
     "com.github.scala-incubator.io" %% "scala-io-core" % Versions.ScalaIO,
     "com.github.scala-incubator.io" %% "scala-io-file" % Versions.ScalaIO
  ))

  val ScalaJsAngular = Def.setting(Seq(
    "com.greencatsoft" %%% "scalajs-angular" % Versions.ScalaJsAngular
  ))

  val ScalaJsCharts = Def.setting(Seq(
    "com.github.easel" %%% "scalajs-charts" % Versions.ScalaJsCharts
  ))

  val ScalaJsDom = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-dom" % Versions.ScalaJsDom
  ))

  val ScalaJsJavaTime = Def.setting(Seq(
    "org.scala-js" %%% "scalajs-java-time" % Versions.ScalaJsJavaTime intransitive()
  ))

  val ScalaJsJquery = Def.setting(Seq(
    "be.doeraene" %%% "scalajs-jquery" % Versions.ScalaJsJquery intransitive()
  ))

  val ScalaJsJQueryFacade = Def.setting(Seq(
    "org.querki" %%% "jquery-facade" % Versions.ScalaJsJQueryFacade
  ))

  val ScalaJsReact = Def.setting(Seq(
    "com.github.japgolly.scalajs-react" %%% "core" % Versions.ScalaJsReact,
    "com.github.japgolly.scalajs-react" %%% "extra" % Versions.ScalaJsReact,
    "com.github.japgolly.scalajs-react" %%% "test" % Versions.ScalaJsReact
  ))

  val ScalaJsReactComponents = Def.setting(Seq(
    "com.github.chandu0101.scalajs-react-components" %%% "core" % Versions.ScalaJsReactComponents
  ))

  val ScalaCache = Def.setting(Seq(
    "com.github.cb372" %% "scalacache-redis" % Versions.ScalaCache,
    "com.github.cb372" %% "scalacache-caffeine" % Versions.ScalaCache
  ))

  val ScalaCss = Def.setting(Seq(
    "com.github.japgolly.scalacss" %%% "core" % Versions.ScalaCss,
    "com.github.japgolly.scalacss" %%% "ext-react" % Versions.ScalaCss,
    "com.github.japgolly.scalacss" %%% "ext-scalatags" % Versions.ScalaCss
  ))

  val ScalaJsMoment = Def.setting(Seq(
    "io.github.widok" %%% "scala-js-momentjs" % Versions.ScalaJsMoment
  ))

  val ScalaCheck = Def.setting(Seq(
    "org.scalacheck" %% "scalacheck" % Versions.ScalaCheck % "test"
  ))

  val Scalactic = Def.setting(Seq(
    "org.scalactic" %%% "scalactic" % Versions.Scalactic
  ))

  val ScalaTestCompile = Def.setting(Seq(
    "org.scalatest" %%% "scalatest" % Versions.ScalaTest
  ))

  val ScalaTest = Def.setting(Seq(
    "ai.x" %% "diff" % Versions.XDotAiDiff % "test",
    "org.scalactic" %%% "scalactic" % Versions.Scalactic,
    "org.scalatest" %%% "scalatest" % Versions.ScalaTest % "test"
  ))

  val ScalaTestPlusPlay = Def.setting(Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % Versions.ScalaTestPlusPlay
  ))

  val SCodec = Def.setting(Seq(
    "org.scodec" %%% "scodec-core" % Versions.SCodec
  ))

  val SigarLoader = Def.setting(Seq(
    "io.kamon" % "sigar-loader" % Versions.SigarLoader
  ))

  val Slf4j = Def.setting(Seq(
    "org.slf4j" % "slf4j-api" % Versions.Slf4j,
    "org.slf4j" % "jcl-over-slf4j" % Versions.Slf4j,
    "org.slf4j" % "jul-to-slf4j" % Versions.Slf4j,
    "org.slf4j" % "log4j-over-slf4j" % Versions.Slf4j
  ))
  val Slick = Def.setting(Seq(
    "com.typesafe.slick" %% "slick" % Versions.Slick
  ))

  val SlickPg = Def.setting(Seq(
    "com.github.tminglei" %% "slick-pg" % Dependencies.Versions.SlickPg,
    "com.github.tminglei" %% "slick-pg_date2" % Dependencies.Versions.SlickPg,
    "com.github.tminglei" %% "slick-pg_circe-json" % Dependencies.Versions.SlickPg
  ))

  val Slogging = Def.setting(Seq(
    "biz.enef" %%% "slogging" % Versions.Slogging,
    "biz.enef" %% "slogging-slf4j" % Versions.Slogging exclude("org.slf4j", "log4j-over-slf4j")
  ))
  val ThreetenBp = Def.setting(Seq(
    "org.threeten" %%% "threetenbp" % Versions.ThreetenBp
  ))
  val TypesafeLogging = Def.setting(Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % Versions.TypesafeLogging
  ))
  val Univocity = Def.setting(Seq(
    "com.univocity"         % "univocity-parsers"    % Versions.Univocity
  ))
}
