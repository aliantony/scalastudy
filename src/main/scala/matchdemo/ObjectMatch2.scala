package matchdemo

/**
  * @author antony
  * @create 2020-12-20 15:30
  */
object ObjectMatch2 {
  def main(args: Array[String]): Unit = {
    val nameStr = "Alice,Bob,Thomes"
    nameStr match {
        //会调用Square的unapply方法
      /**
        * 当case后面的对象提取器方法的参数为多个，默认
        * 会调用Names的unapplySeq方法。该方法返回的序列
        * 个数要等于参数个数才能匹配成功。
        */
      case Names(first,second,third) => {
        println(s"$first,$second,$third")
      }
      case _ => println("nothing matched")
    }
  }
}

object Names {
  /**
    * 对象提取器
    * 返回Some表示提取成功，返回None表示提取失败
    * @param z
    * @return
    */
  def unapplySeq(str:String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else
      None
  }
}
