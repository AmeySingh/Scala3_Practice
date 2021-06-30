class Students(id:Int, name:String, cmarks:Int, pmarks:Int, mmarks:Int){
// a class to define function to calculate the percent
  println("Student Name is "+ name + "  % Scored is "+ percentage + "%")

  def percentage(): Double ={
    var sum: Int =0
    var percent:Double = 0
    var total: Int= 0
    total=300
    sum = cmarks+pmarks+mmarks
    percent= (((sum:Float) /300)*100).round
    return percent

  }

}


object StudentPercent {
  def main(args: Array[String]) {
    var St1 = new Students(101, "raj", 45, 55, 67)
    St1.percentage();
    var St2 = new Students(id = 102, name = "rajesh", cmarks = 65, pmarks = 85, mmarks = 77)
    St2.percentage();
    var St3 = new Students(id = 103, name = "suraj", cmarks = 43, pmarks = 55, mmarks = 60)
    St3.percentage();
    var St4 = new Students(id = 104, name = "tom", cmarks = 71, pmarks = 65, mmarks = 70)
    St4.percentage();
    val iter = Iterator(St1.percentage(),St2.percentage(),St3.percentage(),St4.percentage())
    val iter1 = iter.max
    println("Highest % Scored is "+ iter1+ "%")
  }

}
