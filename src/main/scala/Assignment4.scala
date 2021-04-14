import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{DataFrame, SparkSession}
class Assignment4()
{
  def test4(InputDataframe: DataFrame)= {

    // resultDataFrame.show()
   val  res = InputDataframe.columns.contains("account_number")
    if( res == true)
      {
        val resultDataFrame = InputDataframe.withColumnRenamed("account_number",
          "global_account_number")
  resultDataFrame.show()
      }
  }
}