package basictype

import scala.collection.mutable.ArrayBuffer

/**
  * @author antony
  * @create 2020-12-20 16:36
  */
object ArrayBufferTest {
  def main(args: Array[String]): Unit = {
    //可变长数组,类似Java的ArrayList
    val arr = ArrayBuffer(3,2,5)
    arr.append(4,7)
    println(arr(1))
    println(arr.hashCode())
    arr.remove(2)
    
    val array = arr.toArray //转成定长数组
    val b = arr.toBuffer //转成变长数组

    //二位数组
    var ab = Array.ofDim[Double](3,4)
    ab(1)(1) = 100
    for (elem <- ab) {
      for (a <- elem) {
        print(a + "\t")
      }
      println()
    }
  }
}
