import org.apache.spark.sql.functions.{monotonically_increasing_id, when}
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment9()
  {
    def test9(InputDataframe: DataFrame): DataFrame = {
      val resultDataFrame = InputDataframe.withColumn ("unique_id", monotonically_increasing_id + 123)
      .where ("id == 'null' or id == ' '")
      //resultDataFrame.show()
return resultDataFrame
    }
  }