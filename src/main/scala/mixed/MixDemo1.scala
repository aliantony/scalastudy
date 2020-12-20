package mixed

/**
  * @author antony
  * @create 2020-12-19 19:25
  */
object MixDemo1 {
  def main(args: Array[String]): Unit = {
   var mysql = new Mysql4 with Db4 with File4
    print(mysql)
    print(mysql.insert(100))
  }
}
trait Operate4 {
  println("Operate4...")
  def insert(id:Int) //抽象方法
}
trait Data4 extends Operate4 {
  println("Data4")

  override def insert(id: Int): Unit = {
    println("插入数据=" + id)
  }
}

trait Db4 extends Data4 {
  println("DB4")

  override def insert(id: Int): Unit = {
    print("向数据库")
    super.insert(id) //这里super在动态混入时不一定是父类，和混入的顺序有密切关系
  }
}
trait File4 extends Data4 {
  println("FILE4")

  override def insert(id: Int): Unit = {
    print("向文件")
    super.insert(id) //这里super在动态混入时不一定是父类，和混入的顺序有密切关系
  }
}

class Mysql4 {

}