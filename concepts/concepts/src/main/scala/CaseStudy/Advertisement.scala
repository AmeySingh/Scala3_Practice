package CaseStudy
import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._
import org.json4s.JsonAST.JValue

import scala.util.Sorting.quickSort
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
import scala.tools.nsc.doc.html.HtmlTags.A

case class Clicks(
                 impression_id: String,
                 revenue:Float,
                 )

case class Impression(
                       app_id: Option[Int],
                       advertiser_id: Option[String],
                       country_code: String,
                       id:Option[String],

                       )
object clickAdvertisement extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

    val jsonString1= Source.fromResource("clicks.json")
    println(jsonString1)
    val json1 = parse(jsonString1.mkString)
    println(json1)
    val elements1 = json1.children
    println(elements1)

  //sum of revenue per id

  val clk_grp = elements1.groupBy(x => x.extract[Clicks].impression_id)

  var allResult = ArrayBuffer[Map[String, Float]]()
  var sum:Float =0
    for (clk <- clk_grp.iterator) {
        for(r <- clk._2.mkString){
          sum+= r.toFloat
        }

      allResult += Map(clk._1 -> sum)
      //println(curr_clk.impression_id,curr_clk.revenue)
    }

  println(allResult)

  println(sum)

}