object Recurssion extends App {
  //def main(args: Array[String]): Unit ={
   def Factorial(n: Int) :Int = {
      //def facthelper(x: Int, accumulator: BigInt) :BigInt = {
      if (n <= 1) 1
      else n * Factorial(n - 1)

    }
    def anathorfactorial(n:Int) :BigInt= {
      def factHelper(x: Int, accumalator: BigInt): BigInt =
        if (x <= 1) accumalator
        else factHelper(x - 1, x * accumalator)
        factHelper(n,1)
      }
  println(Factorial(10))
    }









