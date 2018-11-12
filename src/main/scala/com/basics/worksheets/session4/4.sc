import scala.collection.immutable.StringOps
//Implicits

"Hello1".exists(_.isDigit)

"Hello".length

//Marking Rule - By Using the implicit keyword -> We mark it to be used by the compiler as an Implicit.
implicit def stringWrapper(s: String) = new StringOps(s)
// StringOps is there to allow calling methods on top of string like map, exists, foreach, etc.

//"Hello1".exists(x => x.isDigit) //-> error because implicit method 'exists' already exists for String.
// This becomes an ambiguous call after we explicitly define an implicit method to convert String to StringOps in order to be able to call these methods.

//Implicit method +
"abc" + "xyz"

"abc".+("xyz")

object DoubleImplicits {
  implicit def doubleToInt(d: Double) = d.toInt
  def doubleToInt2(d: Double) = d.toInt
  //implicit def doubleToInt3(d: Double) = d.toInt //-> This will cause ambiguity
}

//Scope
import DoubleImplicits._
//Or can specifically import doubleToInt in the scope to avoid ambiguity.

val value1 : Int = doubleToInt2(4.5) //Explicits-first rule
val value : Int = 4.5 //with implicit, no need to call.