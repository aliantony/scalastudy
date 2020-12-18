object  MyDemo {
  def main(args: Array[String]): Unit = {
     tuupleTest()
  }
  def tuupleTest(): Unit = {
    var array = Array(1,2,3,4,5,6)
    for (i <- 0 until array.length) {
      println(array(i))
    }
    var triple = ("zhangsan", "lisi", "wangw")
    println(triple._1)
    println(triple._2)
    println(triple._3)
    var map = Map("zhangsan" -> 1, "李四" -> 2)
    for ((k,v) <- map) {
      println(k,v)
    }

    for ((k,_) <- map) {
      println(k)
    }

    for ((_,v) <- map) {
      println(v)
    }

    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext){
      println(it.next())
    }


  }
}
