trait Log{
  def logMessage(msg:String)
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
  ameyLogger.logMessage("stay happy")

  val praveenLogger = new PraveenLogger()
  praveenLogger.logMessage("keep safe")

}
