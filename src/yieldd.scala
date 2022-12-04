object yieldd {
  def main(args: Array[String]): Unit = {
    var a=for (i<-1 to 10) yield i
    println(a)
  }
}
