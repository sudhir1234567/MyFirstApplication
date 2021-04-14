import org.apache.spark.sql.functions.{col, current_timestamp}
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment7() {

    def test7( InputDataframe: DataFrame): DataFrame = {
      val df1 = InputDataframe.select(col("post_date").cast("String"))

      val df3 = df1.withColumn("Current Date", current_timestamp()).where("post_date == '2020' or post_date == 12")
      //df3.show()

      return df3
    }
  }