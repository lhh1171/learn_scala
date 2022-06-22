package LIST
class Node{
  var id:Int=_
  var next:Option[Node]=None
}
object Test10 {
  def main(args: Array[String]): Unit = {
    var n1=new Node
    n1.id=1
    var n2=new Node
    n2.id=2
    var n3=new Node
    n3.id=3
    n1.next=Some(n2)
    n2.next=Some(n3)
    var tmp:Option[Node]=Some(n1)
    while (!tmp.equals(None)){
      println(tmp.get.id)
      tmp=tmp.get.next
    }
  }
}
