package org.bartmiki.spark

import org.apache.spark.sql.SparkSession
import org.apache.log4j.Logger
import org.apache.log4j.Level

object WordCount {
  Logger.getLogger("org").setLevel(Level.WARN)
  Logger.getLogger("akka").setLevel(Level.WARN)

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("Simple Application")
      .master("local[*]")
      .getOrCreate()
    import spark.implicits._

    val path = args(0)

    val lorem = spark.read.textFile(path).cache()
    val words = lorem
      .flatMap(_.split("\\s+").toList)
      .map(_.toLowerCase)
      .filter(_.length > 1)

    val counts = words
      .groupBy('value)
      .count()
      .orderBy('count.desc)
      .limit(10)

    counts.show()

    spark.stop()
  }
}
