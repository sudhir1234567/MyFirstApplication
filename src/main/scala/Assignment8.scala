/*import Main.resultDataFrame
import org.apache.spark.sql.functions.{col, lit}
import org.apache.spark.sql.{DataFrame, SparkSession}

  class Assignment8() {

    def test8(InputDataframe1: DataFrame, InputDataframe2: DataFrame): DataFrame = {
      val df1 = InputDataframe1.schema("account_number").dataType

      val df2 = InputDataframe2.schema("Account_Number").dataType
      val df3 = InputDataframe1.schema("country_code").dataType
      val df4 = InputDataframe2.schema("country_code").dataType
      if (df1 == df2 && df3 == df4) {
        val resultDataFrame = InputDataframe1.select(col("account_number"), col("country_code"),
          col("account_number").as("updated_column_number"))
        resultDataFrame.show()
       //  resultDataFrame.write.format("csv").option("header","true").option("inferschema","true").save("C:\\demoyest")
      }
      else {
        val resultDataFrame = InputDataframe1.select(col("account_number"), lit(0))
        resultDataFrame.show()
      }
    return resultDataFrame
    }
  }*/