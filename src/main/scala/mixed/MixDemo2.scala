package mixed

/**
  * @author antony
  * @create 2020-12-19 19:25
  */
object MixDemo2 {
  def main(args: Array[String]): Unit = {
   var mysql = new Mysql5 with Db5 with File5
    print(mysql)
    print(mysql.insert(128))
  }
}
trait Operate5 {
  def insert(id:Int) //抽象方法
}


trait File5 extends Operate5 {
  //如果我们在子特质中重写或实现了一个父特质的方法，但同时调用了super
  //这时我们的方法不是完全实现，因此需要申明为abstract override
  //这时super.insert(id)实际调用的就和混入顺序相关
   abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中")
    super.insert(id) //这里super在动态混入时不一定是父类，和混入的顺序有密切关系
  }
}

trait Db5 extends Operate5 {
  println("DB4")

  override def insert(id: Int): Unit = {
    print("将数据保存到数据库中")
  }
}

class Mysql5 {

}