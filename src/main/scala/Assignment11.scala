import org.apache.spark.sql.functions.{col, to_date}
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment11() {

    def test11(InputDataframe: DataFrame): DataFrame = {
      val sss = InputDataframe.select(col("file_arrival_datetime"), col("account_number"))
      to_date(col(""), "yyyy/mm/dd/hh")
      // sss.show()
      val resultDataFrame = sss.select("*").where("file_arrival_datetime != 'null'")
//resultDataFrame.show()
      return resultDataFrame
    }
  }