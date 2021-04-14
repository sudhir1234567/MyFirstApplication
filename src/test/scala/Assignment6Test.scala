import junit.framework.TestCase.assertEquals
import org.apache.spark.sql.{DataFrame, SparkSession}

class Assignment6Test {
  val Spark = SparkSession.builder()
    .master("local[4]")
    .appName("MyApplication")
    .getOrCreate()

  @org.junit.Before
  val path = "C:\\PIP1\\sourcefile"
  val csvDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)

  val ass6 = new Assignment6()

  @org.junit.Test
  def test6(): Unit = {
    val expected = 0
    val actual  = ass6.test6(csvDataFrame)
    // actual.printSchema()
    assert(expected != actual)
  }
}
