trait Log2{
  def logMessage(msg:String)
  //concrete trait methods
  def defaultMessageLogger(): Unit ={
    println("This is is default message")
      }
}
trait errorLog2{
  val maxLength = 15
  def errorMessage(msg:String):Unit ={
  if (msg.length < maxLength) {println("Wrong Message")}

}

class AmeyLogger2 extends Log2{
  def logMessage(msg: String): Unit ={
    println("Yes i am the cutest my favorite message is ",msg)
  }
}

class PraveenLogger2 extends errorLog2{
  }


object TestTrait4 extends App{
  val ameyLogger2 = new AmeyLogger2()
  ameyLogger2.defaultMessageLogger()
  ameyLogger2.logMessage("Praveen is cutie Pie")

  val praveenLogger2 = new PraveenLogger2()
  praveenLogger2.errorMessage("Yes I am")

}}
