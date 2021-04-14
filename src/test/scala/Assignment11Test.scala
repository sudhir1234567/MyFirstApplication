import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment11Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val sourcepath = "C:\\PIP1\\sourcefile"
  val path1 = "C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment10"
  val sourceDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(sourcepath)
  val ass11TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("path1")

  val ass11 = new Assignment11()

  @org.junit.Test
  def test11(): Unit = {
    val actual: DataFrame = ass11.test11(sourceDataFrame)
    // actual.printSchema()
    assertEquals(ass11TestDataFrame,actual)
  }
}

