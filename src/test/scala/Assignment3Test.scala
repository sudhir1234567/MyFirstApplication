
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.junit.Assert

class Assignment3Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val path = "C:\\PIP1\\sourcefile"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)
  val ass3TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").option("inferschema","true").csv("C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata\\assignment3")

  val ass3 = new Assignment3()

  @org.junit.Test
  def test3(): Unit = {
    val actual: DataFrame = ass3.test3(csvDataFrame)
   // actual.printSchema()
    assert(ass3TestDataFrame == actual)
  }
}
