import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment9Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val sourcepath = "C:\\PIP1\\sourcefile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment9"
  val sourceDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(sourcepath)
  val ass9TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass9 = new Assignment9()

  @org.junit.Test
  def test3(): Unit = {
    val actual: DataFrame = ass9.test9(sourceDataFrame)
    // actual.printSchema()
    assertEquals(ass9TestDataFrame,actual)
  }
}
