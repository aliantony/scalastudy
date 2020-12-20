package mixed

/**
  * @author antony
  * @create 2020-12-19 19:25
  */
object MixDemo {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义基础，让它们可以使用trait方法
    var b = new OracleB() with Operate3
    b.insert(1)
    val mysql = new Mysql3 with Operate3
    mysql.insert(2)
    val mysql2 =  new Mysql4 with Operate3 {
      override def say: Unit = print("hi how are you")
    }
    mysql2.insert(4)
    mysql2.say
  }
}
trait Operate3 {
  def insert(id:Int): Unit = { //默认实现了
    println("插入数据id=" + id)
  }
}
class OracleB {

}
abstract class Mysql3 {

}

abstract class Mysql4 {
def say
}