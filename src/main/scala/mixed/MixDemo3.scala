package mixed

/**
  * 自身类型
  * @author antony
  * @create 2020-12-19 19:25
  */
object MixDemo3 {
  def main(args: Array[String]): Unit = {

  }
}

//自身类型的使用
trait Logger {
  //明确告诉编译器我就是Exception,不然下面的getMessage要报错
  this : Exception =>
  def log(): Unit = {
    print(getMessage)
  }
}

//class Console extends Logger //error
//要混入Logger,必须自身是Exception的子类
class Console extends Exception with Logger