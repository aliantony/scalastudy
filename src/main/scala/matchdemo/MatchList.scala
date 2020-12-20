package matchdemo

import scala.collection.mutable.ArrayBuffer

/**
  * @author antony
  * @create 2020-12-20 12:26
  */
object MatchList {
  def main(args: Array[String]): Unit = {
    var lists = Array(List(0), List(1,0), List(88),List(0,1,2), List(1,2,3,4))
    for (elem <- lists) {
      val result = elem match {
        case 0:: Nil => "0"
        case x::y::Nil => println("x=" + x + " y=" + y)
        case 0::other => "0....."
        case x::Nil => x
        case _ => "something else"
      }
      println(result)
      /*if (result.isInstanceOf[ArrayBuffer]) {
          println(result.asInstanceOf[ArrayBuffer])
      }*/
    }
  }
}
