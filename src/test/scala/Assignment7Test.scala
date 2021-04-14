import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment7Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val path = "C:\\PIP1\\sourcefile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment7"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)
  val ass5TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass7 = new Assignment7()

  @org.junit.Test
  def test3(): Unit = {
    val actual: DataFrame = ass7.test7(csvDataFrame)
    // actual.printSchema()
    assertEquals(ass5TestDataFrame,actual)
  }
}

