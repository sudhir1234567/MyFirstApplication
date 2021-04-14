import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
  class Assignment1(val InputDataframe:DataFrame, val Spark:SparkSession) {

   val outpath = "C:\\Lookuporc"
   
    

    //    InputDataframe.show()
    InputDataframe.write.format("orc").option("header","true").option("overwrite","true").save(outpath)
  }
