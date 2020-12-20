package basictype

import java.util

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * @author antony
  * @create 2020-12-20 17:04
  */
object ScalaArrToJavaList {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    //Java中的list
    val arrList = javaArr.command()
    println(arrList)

    //javalist to scala array
    import scala.collection.JavaConversions.asScalaBuffer
    var javaList = new util.ArrayList[String]()
    javaList.add("a")
    javaList.add("b")
    javaList.add("c")
    var mutBuf:mutable.Buffer[String] = javaList
    mutBuf.append("jack")
    println(mutBuf)
  }
}
