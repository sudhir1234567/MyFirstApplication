/*import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment4Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val path = "C:\\PIP1\\sourcefile"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)
  val ass4TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment4")

  val ass4 = new Assignment4()

  @org.junit.Test
  def test4(): Unit = {
    val actual: DataFrame = ass4.test4(csvDataFrame)
    // actual.printSchema()
    assertEquals(ass4TestDataFrame,actual)
  }
}
*/

