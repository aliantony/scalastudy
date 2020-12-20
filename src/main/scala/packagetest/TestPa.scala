/**
  * 在一个文件中可以创建多个包，可以在包中创建类，特质，object
  * 可以在一个文件中把class,trait,object放在不同的包中
  * @author antony
  * @create 2020-12-19 14:43
  */
package packagetest {
  package learn {
    class TestPa {
       import packagetest.learn.chapter.AA
       //父包访问子包的必须导包
       var aa = new AA()
    }
    package object chapter {
      var desc:String = "包对象中定义属性"
      def say():Unit = {
        print("包对象中的方法")
      }
    }
    package chapter {
      class CC {
        def test(): Unit = {
          print(desc) //可以使用包对象中定义的属性和方法。
          say()
        }
      }
      class AA {
         class TestPa {

         }
        //就近原则，要访问父类的指定包
         var parent = new packagetest.learn.TestPa
      }
    }
    object Test {
      def main(args: Array[String]): Unit = {

      }
    }
  }
}

