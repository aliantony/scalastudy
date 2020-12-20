package typetest

/**
  * @author antony
  * @create 2020-12-19 18:19
  */
object Test2 extends App {
  implicit class MyName(x: Int) {
    println("im in cons")
    val y = x
  }

  def say(x: MyName) = {
    println(x.y)
  }
//调用MyName的主构造函数转换为一个MyName的对象，然后再println其y的值
  say(5)
}
