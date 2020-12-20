object Main {
  def main(args: Array[String]): Unit = {
    var obj = new ObjectConstruct("he", 18)
    println(obj)
    var worker = new Worker("jack")
    worker.name //不能访问局部变量inName
    var worker1 = new Worker1("jack")
    worker1.inName //可以访问
    worker1.name //可以访问
  }
}
/**
  * @author antony
  * @create 2020-12-19 13:54
  */
class ObjectConstruct(sname:String, sage:Int) { //主构造器
  var name:String = sname
  var age:Int = sage

  def this(sname:String) {
    //辅助构造器第一行必须显示调用主构造器
    this("jack", 10)
    //this 调用主构造器，调主构造器父类的构造器
    this.name = sname
  }

  override def toString: String = {
    "name=" + this.name + " age=" + this.age
  }
}
//inName是一个局部变量
class Worker(inName:String) {
  var name = inName
}

//inName是一个类的私有的只读属性
class Worker1(val inName:String) {
  var name = inName
}

//inName是类的可读写的私有属性
class Worker2(var inName:String) {
  var name = inName
}
