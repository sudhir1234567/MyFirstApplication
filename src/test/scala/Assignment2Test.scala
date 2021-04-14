import junit.framework.Assert.assertEquals
import junit.framework.Test
import org.apache.spark.sql.{DataFrame, SparkSession}


class Assignment2Test{
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()


@org.junit.Before
  val path1 = "C:\\PIP1\\sourcefile"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path1)
  val asse2TestDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv("C:\\Users\\S\\IdeaProjects\\TestApplication\\src\\testdata")
  val ass2 = new Assignment2()

  @org.junit.Test
  def test2(): Unit = {
    val actual: DataFrame = ass2.test(csvDataFrame)
    assertEquals(actual,asse2TestDataFrame)
  }
}