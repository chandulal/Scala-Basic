import scala.util.Random

val name = "1"

// Pattern Matching on Constant
name match {
  case "alice" => "This is alice"
  case "bob" => "This is bob"
  case "gamma" => "This is gamma"
  case _ => "Nothing matched"
}

val intValue = Random.nextInt(10)
// Match block can be put into Variable as well.
def testMatch(intValue: Int) = intValue match {
  case 1 => "One"
  case 2 => "Two"
  case _ => "More than two"
}

testMatch(intValue)


val isAvailable = false

// Pattern Matching on Variable
// Can also use Guard conditions.
isAvailable match {
  case isa if(isa == true) => "Available" + isa
  case _ => "Not Available"
}

//Pattern Matching on Tuple
val hostPort = ("google.com", 8080)

hostPort match {
  case("localhost", port) => s"This is localhost with port 8080"
  case(host, port) => s"This is $host with port $port"
}

//Pattern Matching on Collection (Sequence)
val intList = List(2,3,5)

//The cases should become loose from top to bottom
intList match {
  case List(1,2) => 1 + 2
  case List(a,b) => a + b
  case List(1, _*) => 1 + 10
  case _ => 100
}


//Pattern Matching on Types
val a: Any = 4

a match {
  case value: Int => s"$value is Int"
  case value: Double => s"$value is Double"
}