/*
case class Sorting2(id: Int, name:String) extends Ordered[Sorting2] {
  override def compare(that: Sorting2): Int =
    java.lang.Integer.compare(id, that.id)

}
Sorting2.sorted shouldBe List(
  Sorting2(101, "raj"),
  Sorting2(121, "rajesh"),
  Sorting2(130, "Suraj"),
    Sorting2(114, "tom")
  ) */