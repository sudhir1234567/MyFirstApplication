import org.apache.spark.sql.functions.col
 import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
 class Assignment6() {

   def test6(InputDataframe: DataFrame):Double = {
     val resultDataFrame = InputDataframe.select(col("document_currency_cost")).
       rdd.map(_ (0).asInstanceOf[Double]).reduce(_ + _)
    // println(resultDataFrame)
     if (resultDataFrame == 0) {
       println("Working fine!!!")
     }
     else {
       println("dodument_currency_cost and stop the flow")
     }
     return resultDataFrame
   }
 }
