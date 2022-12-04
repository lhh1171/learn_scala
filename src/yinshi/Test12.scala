package yinshi
class Obj{
  def yyy():Unit={
    println("yyy")
  }
}

class Rich{
  def xxx():Unit={
    println("xxx")
  }
}
object Test12 {
  def main(args: Array[String]): Unit = {
    //隐式转换--------自动调用
    //隐式函数
//    implicit def adfasfdasfd(o:Obj)=new Rich
//    val o=new Obj
//    o.yyy()
//    o.xxx()
//    implicit def jjkjasdf(i:Int)=new Rich
//    1.xxx()
    //隐式类
//    implicit class XXX(b: Obj){
//      def zzz(): Unit ={
//        println("zzz")
//      }
//    }
//    val o=new Obj
//    o.xxx()
//    o.yyy()
//    o.zzz()
    //隐式参数
    //Scala 函数柯里化(Currying)
    //https://www.runoob.com/scala/currying-functions.html
//    def plus( i:Int)(implicit j:Int)=i+j
//    println(plus(1)(2))
//    implicit var j=22
//    println(plus(2))

    def myplus(a:Int)(b:Int)=a+b
    println(myplus(1)(2)) //clif
    val p=myplus(12)(_) //half function
    println(p(12))
  }
}
