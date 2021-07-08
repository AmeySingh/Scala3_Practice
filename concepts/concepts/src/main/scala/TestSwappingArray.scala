object TestSwappingArray extends App {
  val a= Array(1,2,3,4,5,6)

  println(a.map(i => a.update(i,i)))

  println(a.grouped(2)
    .flatMap{
      case Array(x,y) => Array(y,x)
    }.toArray)

}
