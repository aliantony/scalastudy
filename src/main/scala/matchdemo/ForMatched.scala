package matchdemo

/**
  * @author antony
  * @create 2020-12-20 16:03
  */
object ForMatched {
  def main(args: Array[String]): Unit = {
    var map = Map("A"->1,"B"->0, "C"->3)
    for ((k,v) <- map) {
      println(s"k=$k,v=$v")
    }

    //匹配value等于0的
    for ((k,0) <- map) {
      println(s"k=$k,v=0")
    }

    for ((k,v) <- map if v==0) {
      println(s"k=$k,v=$v")
    }
  }
}
