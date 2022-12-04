import scala.util.control.Breaks

object Breakk {
  def main(args: Array[String]): Unit = {
    val xxx = new Breaks
    //    xxx.breakable(
    //      while (true) {
    //        while (true) {
    //          println("hhhhhhhhhhhhhhhh")
    //          xxx.break()
    //
    //        }
    //      }
    //    )

    xxx.breakable {
      while (true) {
        while (true) {
          println("hhhhhhhhhhhhhhhh")
          xxx.break()
        }
      }
    }
  }
}
