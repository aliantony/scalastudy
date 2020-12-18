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
  }
}

class Dog {
  def sum(a:Int, b:Int): Int = {
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
