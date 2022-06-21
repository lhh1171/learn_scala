package valvar

object Test1 {
  def main(args: Array[String]): Unit = {
    //可变 不可变
    val a:Int=1
    var b:Int=2
    //能自动推倒类型
    val c=3
    //a=22会报错
    b=a+b
    b=a.+(c)
    println(b)
  }

}
