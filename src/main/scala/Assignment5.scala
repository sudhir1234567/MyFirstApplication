import org.apache.spark.sql.functions.{concat, format_string, lit, lpad}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
class Assignment5()
{

    def test5(InputDataframe: DataFrame): DataFrame = {
        val resultDataFrame = InputDataframe.select(col("division_number").cast("String")


        val df1 = InputDataframe.withColumn("division_number", concat(lit("00"), InputDataframe.
          col("division_number")))
        // df1.show()
return df1
    }
}