import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{Row, SparkSession}
object Main extends App {

    val Spark = SparkSession.builder()
      .master("local[4]")
      .appName("MyApplication")
      .getOrCreate()
 now i am pulling this particular file on my local repository...!!


/* related to csv to orc conversion */
 val path = "C:\\Lookupfile"
  val path1 = "C:\\sourcefile"
  val InputDatafra me1 = Spark.read.option("header", "true").option("inferSchema", "true").csv(path)
    val InputDataframe2 = Spark.read.option("header", "true").option("inferSchema", "true").csv(path1)
/*----------------------------------------------------------------------------------------------------*/

val SourcePath = "C:\\sourceorc"
  val LookUpPath = "C:\\Lookuporc"
  val sourceDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").orc(SourcePath)
  val lookUpDataFrame = Spark.read.option("header", "true").option("inferSchema", "true").orc(LookUpPath)


  // val Ass1 = new Assignment1(InputDataframe1, Spark)
//  val Ass2 = new Assignment2()
//  val Ass3 = new Assignment3()
  //val resultDataFrame = Ass3.test3(sourceDataFrame)
 val Ass4 = new Assignment4()
  Ass4.test4(sourceDataFrame)
 //val Ass5 = new Assignment5()
  //val resultDataFrame = Ass5.test5(sourceDataFrame)
  //val Ass6 = new Assignment6()
  //val resultDataFrame = Ass6.test6(sourceDataFrame)
//  val Ass7 = new Assignment7()
  //val resultDataFrame = Ass7.test7(sourceDataFrame)
 //val Ass8 = new Assignment8()
  //val resultDataFrame = Ass8.test8(sourceDataFrame,lookUpDataFrame)
 //val Ass9 = new Assignment9()
  //val resultDataFrame = Ass9.test9(sourceDataFrame)
  //val Ass10 = new Assignment10()
  //val resultDataFrame = Ass10.test10(sourceDataFrame)
 //val Ass11 = new Assignment11()
  //val resultDataFrame = Ass11.test11(sourceDataFrame)
}
