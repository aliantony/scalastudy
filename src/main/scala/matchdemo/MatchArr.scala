package matchdemo

import scala.collection.mutable.ArrayBuffer

/**
  * @author antony
  * @create 2020-12-20 12:26
  */
object MatchArr {
  def main(args: Array[String]): Unit = {
    var arrs = Array(Array(0), Array(1,0), Array(0,1,2), Array(1,2,3,4))
    for (elem <- arrs) {
      val result = elem match {
        case Array(0) => "0"
        case Array(x, y) => ArrayBuffer(y, x)
        case Array(0, _*) => "以0开头的数组"
        case _ => "什么集合都不是"
      }
      println(result)
      /*if (result.isInstanceOf[ArrayBuffer]) {
          println(result.asInstanceOf[ArrayBuffer])
      }*/
    }
  }
}
