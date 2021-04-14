import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment2() {

    //println(InputDataframe.count())


    def test(InputDataframe: DataFrame): DataFrame = {

      val resultDataFrame = InputDataframe.filter("document_currency_cost != 0 or document_currency_cost != 'null' ")

        //resultDataFrame.show()
return resultDataFrame
      //val op = resultDataFrame.write.format("csv").save("F:\\Myprojects\\src\\test")

    }
  }