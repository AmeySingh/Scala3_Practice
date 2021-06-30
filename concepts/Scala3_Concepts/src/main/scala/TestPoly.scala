class Calculator {
  def addition(x: Int, y: Int): Int = {
    return x + y
  }

  def addition(x: Int, y: Int, z: Int): Int = {
    return x + y + z
  }

  def addition(x: Int, y: Int, z: String): String = {
    return x + y + z
  }
}
object TestPoly {
  def main(args: Array[String]): Unit = {
    val add1 = new Calculator()
    println(add1.addition(5, 3, 2))
    println(add1.addition(5, 3, "Amey"))
  }
}
