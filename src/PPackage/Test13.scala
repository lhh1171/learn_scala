package PPackage{
  package p1{
    package p2{
      object Test13{
        def main(args: Array[String]): Unit = {
          println("xxxxxx")
          //屏蔽package里面的类
//          import scala.collection.immutable.{HashMap=>_}
//          import scala.collection.mutable.{HashMap=>_}
//          import java.util.{HashMap=>_}
//          var mm=new util.HashMap
        }
      }
    }
  }
}


