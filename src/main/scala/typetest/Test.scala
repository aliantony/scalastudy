package typetest

object Test extends App {
  abstract class Sayable {
    def say
  }
  implicit object hello extends Sayable{
    override def say() = {
      println("im in hello")
    }
  }
  def func(implicit x: Sayable) {
    x.say
  }
  //没传值用隐式的hello对象，输出im in hello
  func

  //int类型的默认值，隐式值
  implicit val impVal = 5
  def func1(implicit x: Int) = {
    println(x)
  }
  //没传值用隐式的impVal，输出5
  func1

  //隐式参数，在参数中implicit只能出现一次，而在此之后，所有的参数都会变为implicit
  def func2(x: Int)(implicit y: Int): Unit = {
    printf("x的值：%d, y的值:%d",x,y)
  }
  func2(1)
}