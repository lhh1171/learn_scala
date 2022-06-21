package ifelseAndCollection

import scala.collection.mutable.ListBuffer

object Test2 {
  def main(args: Array[String]): Unit = {
    //    var a=1 to 10
    //    println(a)
    //语法糖
    //对象.方法名（1个参数）-------->对象 方法名 参数
    //    for (i<-1 to 10){
    //      println(i)
    //    }
//    --------------------------------------------------------------
//    var a = {
//        println("hello")
//        12
//    }
//    println(a)
//    -------------------------------------------------------------
    //scala没有三目运算符
//    var a=1;
//    var b=if (a>10) 12 else "abc";
//    println(b)
//    ----------------------------------------------------------
    //()元组
//    var a=for (i<-1 to 10) yield i
//    println(a)
//    ------------------------------------------------------------
//    for (i<-1 to 10){
//      if (i%2==0){
//        for (j<-1 to i){
//          println(i+"\t"+j)
//        }
//      }
//    }
//    //跟上面代码等同
//    for (i<-1 to 10;if (i%2==0);j<-1 to i) println(i+"\t"+j)
//    //可以用一行写一个九九乘法表
//    ---------------------------------------------------------------
//    //元组相当于数据库里一行数据
//    val a=(1,"aaa",22)
//    println(a._2)
//    val(id,name,age)=a
//    println(id+"\t"+name+"\t"+age)
//    -------------------------------------------------------------
    //数组
//    var array=Array.apply(1,2,3,4,5,6)
//    var arr:Array[Int]=new Array[Int](10)
//    for(i<-0 to 9) arr(i)=i
//    for(i<-0 to 9) println(arr.apply(i))
    //集合 不可变 可变
    //List  ListBuffer
//    val list=List(1,2,3,4,5)
//    val list2=1+:list
//    val list3=list2:+7
//    //连接两个链表
//    val list4=List(6,7,8):::list3
//    for (i<-list2){
//      println(i)
//    }
//    var lb=ListBuffer(1,2,3,4,5)
//    var lb2=list.toBuffer
//    lb(0)=100
//    lb.insert(3,66)
//    lb.remove(5)
//    lb+=12
//    lb++=List(6,7,8)
//    for (i<-lb){
//          println(i)
//    }
    //Set    Set
//    import scala.collection.mutable.Set
//    var s=Set(1,2,3,4)
//    s.add(4)
//    s.add(5)
//    for (i<-s){
//      println(i)
//    }
    //Map  Map
//    import  scala.collection.mutable.Map
//    import  scala.collection.immutable.{Map=>IMap}
//    var m=Map(("a",1),("b",2));
//    m.put("c",12)
//    for ((k,v)<-m){
////      println(k+"\t"+m.get(k).get)
//      println(k+"\t"+m(k))
//    }
//-------------------------------------------------------
//    var a="1"
//    var b=a.toInt
//    println(b+"123")
//    val keys=List("a","b","c")
//    val values=List(1,2,3)
//    var m=keys.zip(values).toMap
//    println(m)
  }


}
