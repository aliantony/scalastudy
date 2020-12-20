package basictype

/**
  * @author antony
  * @create 2020-12-20 16:27
  */
object CollectionTest {
  def main(args: Array[String]): Unit = {
    var a = new Array[Int](10)
    a(1) //访问下标1的元素
    a(6) = 10
    print(a.length)
    for (elem <- a) {
      println(elem)
    }
    //第二种方式定义数组
    var a2 = Array("a", 1,2)

  }

}
