package typetest

/**
  * @author antony
  * @create 2020-12-19 17:58
  */
object ConvTest {
  def main(args: Array[String]): Unit = {

  }
  //隐式函数
  implicit def conv(a: Int) = {
    println("in conv")
    a.toString
  }
  def say(b: String) = println(b)
  say(5) //ConvTest 主构造函数会执行这儿，int自动转成了String
}
