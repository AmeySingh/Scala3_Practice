import TestStudentPercentCalc.elements
import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._
import scala.util.Sorting.quickSort

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
import scala.tools.nsc.doc.html.HtmlTags.A
case class User (
                    id: Int,
                    name: String,

                    )



/*
class Sorting(val Id: User) extends Ordered[User]{
  def compare(that: User)= Id.id.compare(that.id)
    }
implicit def sortedUser(p:User) = new Sorting(p)
scala.util.Sorting.quickSort(User)
*/
/* def sorted[B >: A](implicit ord: Ordering[B]): Repr
implicit val UserOrdering: Ordering[User] = Ordering.by(_.id)

User.sorted shouldBe List(

)*/
object TestStudentSorter extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString= Source.fromResource("User.json")
  println(jsonString)
  val json = parse(jsonString.mkString)
  println(json)
  val elements = json.children
  println(elements)

  var  idArray = new ArrayBuffer[Int]
  var  nameArray = new ArrayBuffer[String]

  for (st <- elements){
    val curr_st = st.extract[User]
    //val IdArray: Array[Int] = Array(st.extract[User].id)
    //val NameArray:Array[String]= Array(st.extract[User].name)
    //scala.util.Sorting.quickSort(NameArray)
    //println(NameArray.sorted)

    idArray+= curr_st.id
    nameArray+=curr_st.name
  }

  println(idArray.sorted)
  println(nameArray.sorted)
}
