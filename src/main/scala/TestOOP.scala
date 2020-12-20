import scala.io.StdIn

/**
  * @author antony
  * @create 2020-12-19 11:45
  */
object TestOOP {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 18
    cat.color = "white"
    var f = 1.278441212f
    val d = 23.34514552
    printf("float保留两位小数:%.2f",f)
    println()
    printf("double保留两位小数:%.2f",d)
    println()
    printf("名字：%s, 年龄: %d, 颜色:%s", cat.name, cat.age, cat.color)
    println()
    var s = StdIn.readLine("请输入一行内容:")
    println(s)
  }
}
class Cat {
  var name:String = ""
  var age:Int = _ //_表示默认值
  var color:String = _
}
