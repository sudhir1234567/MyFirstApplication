/*import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment8Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val sourcepath = "C:\\PIP1\\sourcefile"
  val lookUpPath = "C:\\PIP1\\Lookupfile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment8"
  val sourceDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(sourcepath)
  val lookUpDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(lookUpPath)
  val ass8TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass8 = new Assignment8()

  @org.junit.Test
  def test8(): Unit = {
    val actual: DataFrame = ass8.test8(sourceDataFrame,lookUpDataFrame)
    // actual.printSchema()
    assertEquals(ass8TestDataFrame,actual)
  }
}
*/