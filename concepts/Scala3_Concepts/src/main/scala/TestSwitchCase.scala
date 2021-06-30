object TestSwitchCase {

  def main(args: Array[String]): Unit = {
    val weekdays = Seq("Sunday", "Monday", "Tuesday")
    weekdays.foreach( i => checkMyDay(i))

    weekdays(0) match {
      case "Sunday" =>
        println("its holiday.")
      case "Monday" =>
        println("its Monday.")
    }

    def checkMyDay(day:String): Unit ={
      day match {
        case "Sunday" =>
          println("its holiday.")
        case "Monday" =>
          println("its Monday.")
        case "Tuesday" =>
          println("its Tuesday.")
      }
    }
  }

}
