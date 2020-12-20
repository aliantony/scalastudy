package packagetest


/**
  * @author antony
  * @create 2020-12-19 15:30
  */
class PaImport {
    def test(): Unit = {
      //部分引入
      // _表示全部引入
      import scala.collection.mutable.{HashSet,HashMap}
      var set = new HashSet()
      var map = new HashMap()
    }

  def test2(): Unit = {
    //部分引入
    // _表示全部引入
    import scala.collection.mutable.{HashSet,HashMap}
    //导入的类重命名
    import java.util.{HashMap => JavaHashMap,List}
    var scalaMap = new HashMap()
    var map = new JavaHashMap()
  }

  def test3(): Unit = {
    //第一个_表示隐藏HashMap不用了，防止冲突,第二个_表示导入其他类
    import java.util.{HashMap => _,_}
  }
}
