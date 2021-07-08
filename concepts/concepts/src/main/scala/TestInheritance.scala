class Person{
  val id:Int = 0
  val name:String = ""

  def greetMee(): Unit ={
    println("hello i am ",name)
  }
}

class Student4 extends Person{
  val marks:Int = 0

  def tellMarks(): Unit ={
    println("my marks are ",marks)
  }
}

class Employee(salary:Int) extends Person{
  val country:String = "India" //class variable common for all emp objects

  def tellSalary(): Unit ={
    println("my salary is ",salary)
  }
}


object TestInheritance {
  def main(args:Array[String]): Unit ={
    val st = new Student4()
    st.tellMarks()
    val emp1 = new Employee(20000)
    emp1.tellSalary()
    val emp2 = new Employee(50000)
    emp2.tellSalary()
  }

}
