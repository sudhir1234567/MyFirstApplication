import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment10Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val sourcepath = "C:\\PIP1\\sourcefile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment10"
  val sourceDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(sourcepath)
  val ass10TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass10 = new Assignment10()

  @org.junit.Test
  def test10(): Unit = {
    val actual: DataFrame = ass10.test10(sourceDataFrame)
    // actual.printSchema()
    assertEquals(ass10TestDataFrame,actual)
  }
}

