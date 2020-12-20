/**
  * @author antony
  * @create 2020-12-18 21:17
  */
object ExceptionTest {
  def main(args: Array[String]): Unit = {
    try {
       var b = 1 / 0
    } catch { //scala中只能有一个catch
      //越具体的异常越靠前
      case ex: ArithmeticException => { println("除数异常" + ex.getMessage()) }
      case ex: Exception => print("异常" + ex.printStackTrace())
    } finally {
      print("结束")
      throw new IllegalArgumentException("参数非法") //throw有类型，Nothing
    }
  }
}
