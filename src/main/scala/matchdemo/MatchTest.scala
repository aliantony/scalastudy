package matchdemo

/**
  * @author antony
  * @create 2020-12-20 11:56
  */
object MatchTest {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var res = 0
    var op = "+"
    val r = op match {
      //把匹配的值op赋值给一个变量
      case myvar => println("操作符是" + myvar)
      case "+" => res = a + b
      case "-" => res = a - b
      case "*" if b==21 => res = a*b
        //条件守卫，匹配范围
      case _ if a == 10 => res = a*b
      case _ => println("默认输出")
    }
    println(res)
  }
}
