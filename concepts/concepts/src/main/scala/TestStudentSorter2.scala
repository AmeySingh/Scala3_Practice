import TestStudentPercentCalc.elements
import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._
import scala.util.Sorting.quickSort

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

case class User2 (
                    id: Int,
                    name: String,
                 )

object TestStudentSorter2 extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString= Source.fromResource("User.json")
  println(jsonString)
  val json = parse(jsonString.mkString)
  println(json)
  val elements = json.children
  println(elements)

  //empty list here
  val sortingList:ListBuffer[User2] = ListBuffer()
  //println(sortingList.isInstanceOf[ListBuffer[User2]])

  for (st <- elements){
    val curr_st = st.extract[User2]

    //println(curr_st.isInstanceOf[User2])
    //fill the list here
    sortingList += curr_st
  }

  //sort logic here
  println(sortingList)
  val sortedList = sortingList.sortBy(x=>(x.id,x.name))
  println(sortedList)
}
