package OBject
//在out里
//javap -verbose Test6
//javap -c Test6
//class 里面的方法都不是静态
//object里面的方法都是静态
//class Test6{
////  val a=1//get
////  var b=2//get set
////  def c=3//get
////  def yyy():Unit={}
//  self=>
//  private[this] var _id:Int=_
//  //get
//  def id=self._id
//  //set
//  def id_=(__id:Int)= {
//    if (__id>100){
//      self._id=100
//    }else{
//      self._id = __id
//    }
//  }
//}
//object Test6 {
//  def xxx():Unit={
//
//  }
//
//  def main(args: Array[String]): Unit = {
//    val t=new Test6
//    t.id=199
//    println(t.id)
//  }
//}
//--------------------------------------------------------------------------------------------------
class Test6(var a:Int,var b:String){
  self=>
  val xxx=1
  var c:Int=100
  def dis()={
    println(self.a+"\t"+self.b+"\t"+self.c)
  }
  def this(a:Int,b:String,c:Int){
    this(a,b)
    self.c=c
  }
  def this(){
    this(1,"xxx")
  }
}
class Node(a:Int,b:String,var x:Int)  extends Test6 (a,b){
  self=>
  override val xxx: Int = 2

  override def dis(): Unit = {
    super.dis()
    println("node"+self.a+"\t"+self.b+"\t"+self.x)
  }
}
object Test6{
  def main(args: Array[String]): Unit = {
    val t=new Node(1,"xxx",2)
    t.dis()
  }
}