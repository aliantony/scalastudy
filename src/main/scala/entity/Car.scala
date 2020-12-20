package entity

import scala.beans.BeanProperty

/**
  * @author antony
  * @create 2020-12-19 14:17
  */
class Car {
  //为属性生成get set方法
  @BeanProperty var name:String = _
}
object Test {
  def main(args: Array[String]): Unit = {
    var c = new Car
    c.name = "scla java"
    c.setName("java")
    println(c.getName);
  }
}
