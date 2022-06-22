package INterface
//接口,如果有两个接口里面的方法一样，报错
trait Log{
  def debug(): Unit ={
    println("xxx")
  }
}
trait BB{
  def plus(a:Int,b:Int): Int
}
trait CC{
  def sub(a:Int,b:Int): Int
}

class Node extends Log with BB with CC{
  override def plus(a: Int, b: Int): Int = a+b

  override def sub(a: Int, b: Int): Int = a-b
}
class Node2{}
object Test7 {
  def main(args: Array[String]): Unit = {
    val n=new Node
    println(n.plus(1,2))
    val n2=new Node2 with Log
    n2.debug()
  }
}
