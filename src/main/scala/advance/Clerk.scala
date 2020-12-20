package advance

/**
  * @author antony
  * @create 2020-12-19 15:11
  */
class Clerk {
  //扩大私有属性的范围，表示在advance包和它的子包也可以访问
  private[advance] var age:Int = 32
  var name:String = "hello"
  private var sal:Double = 999.9
}
// class Clerk 称为伴生类
// object Clerk 伴生对象
// Scala设计者将 static拿掉，设计了伴生类和伴生对象
// 伴生类写非静态内容，伴生对象写静态内容
// 私有属性可以在本类访问，也可以在他的伴生对象中访问
object Clerk {
  def test(c:Clerk): Unit = {
    //伴生对象中可以访问私有属性
    println(c.sal)
    println(c.name)
  }

  def main(args: Array[String]): Unit = {
    var c = new Clerk
    println(c.sal + c.name) //伴生对象中可以访问私有属性
  }
}

object ClerkTest {
  def test(c:Clerk): Unit = {
    //非伴生对象中不能访问私有属性
    //println(c.sal)
    println(c.name)
  }

  def main(args: Array[String]): Unit = {
    var c = new Clerk
    //非伴生对象中不能访问私有属性
    //println(c.sal + c.name)
  }
}
