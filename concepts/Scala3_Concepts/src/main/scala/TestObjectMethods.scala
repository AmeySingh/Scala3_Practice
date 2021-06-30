object TestObjectMethods {

  def main(args: Array[String]) {
    volume1(20,(x => x*x))
    volume2(20, square(20))

    //HOF which accepts function as parameter
    def volume1(y: Int, f: Int => Int): Unit = {
      println("Volume of cube side " + y + " is " + y * f(y))
    }

    def volume2(y: Int, f: () => Int): Unit = {
      println("Volume of cube side " + y + " is " + y*f())
    }

    //HOF which returns function
    def square(i: Int): () => Int = {
      () => i * i
    }
  }

}
