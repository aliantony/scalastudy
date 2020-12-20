package caseobj

/**
  * @author antony
  * @create 2020-12-20 11:20
  */
object BookTest {
  /**
    * 嵌套匹配 _表示忽略的属性，_*表示忽略后面所有的
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val sal = Bundle("书籍",10, Book("漫画", 40), //-10
      Bundle("文学作品",20, Book("阳谷",80), Book("围城", 30))) //-20
    var res = sal match {
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    println(res)
    println("最终价格是:" + price(sal))
    /**
      * @表示将嵌套的值绑定到变量，_*把剩下的所有绑定到rest
      */
    var res2 = sal match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
    }
    println(res2)
    println(res2._1.desc)
    println(res2._2)

    var res3 = sal match {
      case Bundle(_, _, art@Book(_, _), rest) => (art, rest)
    }

    println(res3)
  }

  def price(it:Item):Double = {
    it match {
      case Book(_, price) => price
      //dist 少多少钱
      case Bundle(_, disc, its@_*) => its.map(price).sum - disc
    }
  }
}
abstract class Item
case class Book(desc:String, price:Double) extends Item
//bundle的price表示捆绑卖的优惠价格
case class Bundle(desc:String, price:Double, item: Item*) extends Item