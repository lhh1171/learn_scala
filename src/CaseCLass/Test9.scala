package CaseCLass
class Person1(var id:Int,var name:String){
  self=>
  override def toString: String = "Person:id="+self.id+",name="+self.name
}
object Person1{
  def apply(id: Int, name: String): Person ={
    new Person(id, name)
  }

  def unapply(arg: Person): Option[(Int, String)] = Some(arg.id,arg.name)
  //Option<T>{Some(T),None}
}
object Test9 {
  def main(args: Array[String]): Unit = {
    val p:Any=Person1(1,"abc")

    p match {
      case Person1(id,name)=>println("person:"+id+"\t"+name)
      case _=>println("other")
    }
    val x:Option[Int]=Some(12)
    val y:Option[Int]=None
    println(x.getOrElse(0)+"\t"+y.getOrElse(0))
  }
}
