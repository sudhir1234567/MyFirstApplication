name := "TestApplication"

/*version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"
//libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.3.0"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.12"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.3.0"
libraryDependencies += "junit" % "junit" % "4.13.1" */

version := "0.1"

scalaVersion := "2.11.12"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.0"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.12"
//libraryDependencies += "junit" % "junit" % "4.13.1"
libraryDependencies += "junit" % "junit" % "4.12" % Test

//libraryDependencies += "org.scalatest" %% "scalatest" % "2.3.0" % Test
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
//libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.1.0"
//libraryDependencies += "org.apache.hive" % "hive-orc" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.3.0" % "provided"
