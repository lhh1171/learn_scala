package ss

object Test5 {
  def main(args: Array[String]): Unit = {
    val arr=List(1,2,3,4,5)
//    val result=arr.map(_+1).map(_+2).filter(x=>x>5)
//    val result=arr.map(_+1).map(_+2).filter(_>5)
//    val result=arr.map(_+1).map(_+2).filter(_>5).reduce((x,y)=>x+y)
//    val result=arr.map(_+1).map(_+2).filter(_>5).reduce(_+_)
    val result=arr.map(_ + 1).map(_ + 2).filter(_ > 5).sum
    println(arr)
    println(result)
  }
}
