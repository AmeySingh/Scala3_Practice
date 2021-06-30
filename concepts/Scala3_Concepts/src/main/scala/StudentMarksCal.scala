object StudentMarksCal{
  def main(args: Int){
    val grade = 80;

    if (grade >= 90 && grade <= 100) {
    println ("Grade A ");
  } else if (grade >= 80 && grade <= 90) {
    println ("Grade B ");
  } else if (grade >= 70 && grade <= 80) {
    println ("Grade C ");
  } else {
    println ("Failure");
  }
  }
  def main(args: Array[String]): Unit ={

    val marks = Array(1,2,3,4,5)
    main(5)
  }
}
