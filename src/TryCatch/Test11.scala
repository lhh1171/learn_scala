package TryCatch

class MyExp(str:String) extends Exception(str){

}


object Test11 {
  def xxx():Unit={
    throw new MyExp("xxx2222222222222222222222")
  }
  def main(args: Array[String]): Unit = {
//    var a=1
//    try{
//      a =1/0
//    }catch {
//      case e:java.lang.ArithmeticException=>e.printStackTrace()
//      case _=>println("xxx111111")
//    }
    try{
      xxx()
    }catch {
      case e:MyExp=>e.printStackTrace()
      case _=>println("xxx111111")
    }
    println("xxx")
  }
}
