package CaseCLass
//case class是final无法继承
case class Person(id:Int,name:String)

case class Stu(id:Int,name:String,age:Int)
object Test8 {
  def main(args: Array[String]): Unit = {
//    val p=new Person(1,"xxx")
//    println(p.id+"\t"+p.toString)
    val p:Any=new Person(1,"xxx")
    p match {
      case Person(id,name)=>println("person"+id+name)
      case Stu(id,name,age)=>println("stu"+id+"\t"+name+"\t"+age)
      case _=>println("other")
    }
  }
}
