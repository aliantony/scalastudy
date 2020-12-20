package matchdemo

/**
  * @author antony
  * @create 2020-12-20 12:26
  */
object MatchTuple {
  def main(args: Array[String]): Unit = {
    var lists = Array((0,1), (1,0), (88),(0,1,2), (1,2,3,4))
    for (elem <- lists) {
      val result = elem match {
        case (0,_) => "以0开头的元组"
        case (y,0) => "第二个元素是0的元组"
        case _ => "something else"
      }
      println(result)
      /*if (result.isInstanceOf[ArrayBuffer]) {
          println(result.asInstanceOf[ArrayBuffer])
      }*/
    }
  }
}
