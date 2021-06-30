//constructor parameters are read only by default, like val id

class Student2(var id:Int, name:String){
  def printMe(): Unit = {
    //this.id = 666 error by default val
    this.id= 555
    println(this.id+" "+this.name)
  }

  override def toString():String = {
    return this.name
  }

}

case class Student3(id:Int, name:String){
  def printMe(): Unit = {

    println(this.id+" "+this.name)
  }
}


object TestCaseVsClass {

    def main(args: Array[String]){
      var obj1:Student2 = new Student2(101,"Rajesh")
     // obj1.printMe()
      println(obj1)

      var obj2:Student3 = Student3(102,"suraj")
      //obj2.printMe()
      println(obj2)

    }

}
