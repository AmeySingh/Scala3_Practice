/*
case class Student(id:Int, name:String) extends Ordered[Student]{

  def main(args: Array[String]): Unit = {
    def sortById(Stu1: Student, Stu2: Student): Boolean = {
      Stu1.id < Stu2.id
    }
  }
  //sortById: (Stu1: Student,Stu2:Student) Boolean

  override def compare(that: Student): Int = java.lang.Integer.compare(id, that.id)
}
  object Students{
    def main(args: Array[String]) {
      val Stu1 = Student(101, "raj")
      val Stu2 = Student(121, "rajesh")
      val Stu3 = Student(130, "Suraj")
      val Stu4 = Student(114, "tom")
      val emptyList = List(Stu1, Stu2, Stu3, Stu4)
      val result = emptyList.sortWith((Stu1, Stu2) => Student.sortById(Stu1,Stu2))
      println(result)


    }
} */