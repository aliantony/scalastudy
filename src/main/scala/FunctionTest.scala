object FunctionTest { //静态对象才能有main
  def main(args: Array[String]): Unit = {
     var dog = new Dog()
     var sum = dog.sum(1,2)
     println(sum)
     var f1 = dog.sum _ //方法转函数
     println(f1)
    //定义函数
    var f2 = (n:Int) => {
      n*n
    }
    println(f2(100))

    println("----------------")
    lazy val res = dog.sum(1, 2)
    //使用res才执行
    println(res)
  }
}

class Dog {
  def sum(a:Int, b:Int=1): Int = { //指定默认值
    println("惰性结束，开始执行")
    a+b
  }

  def cal(a:Int, b:Int, op:Char)= {
    if (op == '+') {
       a+b
    } else if (op == '-') {
       a-b
    } else {
       null
    }
  }
}
