/**
  * 构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
  * 在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
  * 提供unapply方法使模式匹配可以工作；
  * 生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
  *
  * 普通类只有在伴生对象中定义apply和unapply方法才能够利用伴生对象的方式创建对象和模式匹配
  * 当一个类被定义成为case类后，Scala会自动帮你创建一个伴生对象并帮你实现了apply， unapply，setter，
  * getter 和toString,equals，copy和hashCode等方法
  *
  */
object MatchScala {
  def main(args: Array[String]) {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
          //apply
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
          //unapply
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }
  // 样例类
  case class Person(name: String, age: Int)
}

