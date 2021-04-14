
import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment5Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val path = "C:\\PIP1\\sourcefile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment5"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)
  val ass5TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass5 = new Assignment5()

  @org.junit.Test
  def test3(): Unit = {
    val actual: DataFrame = ass5.test5(csvDataFrame)
    // actual.printSchema()
    assertEquals(ass5TestDataFrame,actual)
  }
}


