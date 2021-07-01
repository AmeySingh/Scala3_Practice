import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

case class Student(
                    id: Int,
                    name: String,
                    cmarks: Int,
                    pmarks: Int,
                    mmarks: Int

                  )

class StudentHelper {
  var allResult = ArrayBuffer[Map[Int, Double]]()

  def calculateStudentPercent(stobj: Student): ArrayBuffer[Map[Int, Double]] = {
    var sum: Int = 0
    var percent: Double = 0

    sum = (stobj.mmarks + stobj.cmarks + stobj.pmarks)
    percent = (((sum: Float) / 300) * 100).round
    this.allResult += Map(stobj.id -> percent)
    return this.allResult
  }

  def getTopperStudentId(): Int = {
    var percent: ArrayBuffer[Double] = ArrayBuffer()
    var result: Int = 0
    for (e <- this.allResult) {
      percent += e.values.head
    }

    for (e <- this.allResult) {
      if (e.values.head == percent.max) {
        result = e.keys.head
        return result
      } else {
        result = 0
      }
    }
    return result

  }

}

object TestStudentPercentCalc extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString = Source.fromResource("Student.json")
  println(jsonString)
  val json = parse(jsonString.mkString)
  println(json)
  val elements = (json).children
  println(elements)

  var sthelper = new StudentHelper()

  for (st <- elements) {
    val curr_st = st.extract[Student]
    //println(s"Student: ${m.id}, ${m.name}, ${m.cmarks},${m.pmarks},${m.mmarks}")
    sthelper.calculateStudentPercent(curr_st)
  }
  println(sthelper.allResult)
  println("Topper student id is " + sthelper.getTopperStudentId())

  for (st <- elements){
    val curr_st = st.extract[Student]
    if(curr_st.id == sthelper.getTopperStudentId()){
      println(curr_st)
    }else{
      //println("No Topper Found.")
    }
  }
}
