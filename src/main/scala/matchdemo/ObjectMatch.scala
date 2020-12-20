package matchdemo

/**
  * @author antony
  * @create 2020-12-20 15:30
  */
object ObjectMatch {
  def main(args: Array[String]): Unit = {
    val number:Double = Square(6.0) //调用apply返回36
    number match {
        //会调用Square的unapply方法
      /**
        * number会传给unapply,unapply返回值会赋给n
        */
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }
}

object Square {
  /**
    * 对象提取器
    * 返回Some表示提取成功，返回None表示提取失败
    * @param z
    * @return
    */
  def unapply(z:Double): Option[Double] = Some(math.sqrt(z))

  def apply(z:Double): Double = z * z
}
