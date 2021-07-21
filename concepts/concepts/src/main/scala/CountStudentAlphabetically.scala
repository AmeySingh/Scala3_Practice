
import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._
import scala.util.Sorting.quickSort

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

case class User3 (
                    id: Int,
                    name: String,
                 )

object CountStudentAlphabetically extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString= Source.fromResource("User.json")
  println(jsonString)
  val json = parse(jsonString.mkString)
  println(json)
  val elements = json.children
  println(elements)

  //empty list here
  val sortingList1 = new ArrayBuffer[User3]
  //println(sortingList.isInstanceOf[ListBuffer[User2]])

  for (st <- elements){
    val curr_st = st.extract[User3]
    sortingList1 += curr_st
  }

  //sort logic here
  println(sortingList1)
  val lWords = sortingList1.groupBy(_.name(0)).map(x => (x._1,x._2.length))

  println(lWords)


}
