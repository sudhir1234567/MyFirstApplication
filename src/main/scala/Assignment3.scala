import org.apache.spark.sql.functions.{bround, col}
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment3() {


    def test3(InputDataframe: DataFrame): DataFrame = {
      val resultDataFrame = InputDataframe.select(col("document_currency_cost"), bround(col("document_currency_cost"), 2).as("updated_cost"))
     // resultDataFrame.printSchema()
      return resultDataFrame
    }
  }
