/* trait Log{
  def logMessage(msg:String)
  //concrete trait methods
  def defaultMessageLogger(): Unit ={
    println("This is is default message")
  }
}

class AmeyLogger extends Log{
  def logMessage(msg: String): Unit ={
    println("Yes i am the cutest my favorite message is ",msg)
  }
}

class PraveenLogger extends Log{
  def logMessage(msg: String): Unit ={
    println("Yes i am the dumbest and my favorite message is ",msg)
  }
}

object TestTrait1 extends App{
  val ameyLogger = new AmeyLogger()
  ameyLogger.defaultMessageLogger()
  ameyLogger.logMessage("Praveen is cutie Pie")

  val praveenLogger = new PraveenLogger()
  praveenLogger.logMessage("keep safe")

}
*/