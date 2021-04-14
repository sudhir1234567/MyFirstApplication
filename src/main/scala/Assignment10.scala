import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
class Assignment10() {

def test10 (InputDataframe: DataFrame): DataFrame = {
  val resultDataFrame = InputDataframe.na.fill('/', List("account_number", "country_code","currency_code","document_number","document_date"))
  return resultDataFrame
}
}
