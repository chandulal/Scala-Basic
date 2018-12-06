// Partial function


List(1, 2, 3).map(_ * 10)

//List("1", "2", "abc").map(_.toInt)


val sqRoot = new PartialFunction[Int, Double] {
  override def isDefinedAt(x: Int) = x > 0
  override def apply(v1: Int) = scala.math.sqrt(v1)
}

sqRoot.isDefinedAt(10)
sqRoot.isDefinedAt(-10)

sqRoot(10)
sqRoot(-10)


List(1,2,3,-2).map(x => sqRoot(x))
List(1,2,3,-2).collect(sqRoot)

// Partially applied function


def sum(v1: Int, v2: Int) = {
  v1 + v2
}


val add4 = (number: Int)  => sum(number, 4)
val add2 = (number: Int)  => sum(number, 2)


add4(10)