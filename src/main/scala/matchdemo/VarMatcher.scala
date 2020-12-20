package matchdemo

/**
  * @author antony
  * @create 2020-12-20 15:59
  */
object VarMatcher {
  def main(args: Array[String]): Unit = {
    var (a,b,c) = (1,2,3)
    println(a)
    var (x,y) = BigInt(100) /% 10
    println(s"x=$x,y=$y")
    var arr = Array(1,3,5)
    var Array(t,j,_*) = arr
    println(s"t=$t,j=$j")
  }
}
