import scala.collection.immutable.StringOps
//Implicits

"Hello".exists(_.isDigit)

implicit def stringWrapper(s: String) = new StringOps(s)

//
//"hello".exists(x => x.isDigit)

object DoubleImplicits {
  implicit def doubleToInt(d: Double) = d.toInt
}

import DoubleImplicits.doubleToInt

val value: Int = 4.5


