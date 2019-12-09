name := "org.bartmiki"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

// Logging services
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.12.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.12.1"

// Spark dependencies
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"


// ZIO dependencies
libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC17"
libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.0-RC17"
