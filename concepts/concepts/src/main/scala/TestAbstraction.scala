abstract class Animal{
  val name:String = "Jacky"

  def sound():Unit

  def printMe():Unit={
  println("hello from abstract class method"+this.name)
  }
}

class Dog extends Animal{
  override def sound(): Unit = {
    println("bhow bhow bhow bhowwwwwwwww")
  }
}

class Cat extends Animal{
  override def sound(): Unit = {
    println("meow meow meowwwwwwwww")
  }
}

object TestPolymorphism {

  def greetMyPet(pet:Animal): Unit ={
    pet match {
      case pet:Dog =>
        pet.sound()
      case pet:Cat =>
        pet.sound()
    }
  }

  def main(args: Array[String]): Unit = {
    val mypet1:Animal = new Dog()
    val mypet2:Animal = new Cat()
    greetMyPet(mypet1)
    greetMyPet(mypet2)
    mypet2.printMe()

  }

}
