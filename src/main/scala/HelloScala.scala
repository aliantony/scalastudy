object HelloScala {
  def main(args: Array[String]): Unit = {
    for (e <- 1 to 3;
         j <- 1 to 3) {
      println(e, j)
    }
    var a = for (i <- 1 to 5) yield i * 2
    println(a)
  }

}