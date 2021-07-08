/* trait Log1{
  def logMessage(msg:String)
  //concrete trait methods
  def defaultMessageLogger(): Unit ={
    println("This is is default message")
      }
}
trait errorLog{
  def errorMessage(msg:String)
}

class AmeyLogger1 extends Log1{
  def logMessage(msg: String): Unit ={
    println("Yes i am the cutest my favorite message is ",msg)
  }
}

class PraveenLogger1 extends errorLog{
  def errorMessage(msg: String): Unit ={
    println("I am too smart for Amey ",msg)
  }
}

object TestTrait3 extends App{
  val ameyLogger1 = new AmeyLogger1()
  ameyLogger1.defaultMessageLogger()
  ameyLogger1.logMessage("Praveen is cutie Pie")

  val praveenLogger1 = new PraveenLogger1()
  praveenLogger1.errorMessage("Yes I am")

}
*/