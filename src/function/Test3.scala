package function

object Test3 {
  def plus(i:Int,j:Int):Int={
    return i+j
  }
  def sub(i:Int,j:Int)=i-j
  def ops(f:(Int,Int)=>Int,i:Int,j:Int)=f(i,j)
  def ss()=3
  //lazy init
  def sss=4
  def Incr():()=>Int={
    var a=0;
    ()=>{
      a+=1
      a
    }
  }
  def main(args: Array[String]): Unit = {
//    println(plus(1,2))
//    println(ss)
    //函数是一等公民
    //python 函数类型|lambda表达式（闭包，匿名函数）
    //a=1
    //(Int)=>Int   | (1)->{1+1}
//    println(ops(plus,1,2))
//    println(ops((x,y)=>x+y,1,3))
//    ----------------------------------------
    var i1=Incr()
    var i2=Incr()
    println(i1())
    println(i2())
    println(i1())
    println(i2())
    println(i1())
    println(i2())
    println(i1())
    println(i2())
  }
}
