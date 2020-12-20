package caseobj

/**
  * @author antony
  * @create 2020-12-20 10:54
  */
object Test {
  def main(args: Array[String]): Unit = {
     for(amt <- Array(Dollar(55.2), Currency(51.0, "y"),NoAmount)) {
       val result = amt match {
         //会调用unaaply
         case Dollar(v) => v  + "$"
         case Currency(v, u) => v + u
         case NoAmount => "没内容"
       }
       println(result)
     }
    //::叫中置表达式，如果unaplly产出一个元组，可以在case语句中使用中置表达式，
    //比如可以匹配一个list序列
    List(1,3,5,9) match {
      case first::second::rest => println(first + ":" + second + ":" + rest.length)
      case _ => println("匹配不到")
    }
  }
}
abstract class Acount {

}
case class Dollar(value:Double) extends Acount
case class Currency(value:Double, unit:String) extends Acount
case object NoAmount extends Acount