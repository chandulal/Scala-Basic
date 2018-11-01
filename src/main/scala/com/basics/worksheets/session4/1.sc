import scala.util.Random

val name = "1"

name match {
  case "alice" => "This is alice"
  case "bob" => "This is bob"
  case "gamma" => "This is gamma"
  case _ => "Nothing matched"
}

val intValue = Random.nextInt(10)



def testMatch(intValue: Int) = intValue match {
  case 1 => "One"
  case 2 => "Two"
  case _ => "More than two"
}

testMatch(1)

val isAvailable = false

isAvailable match {
  case isa if(isa == false) => "Available " + isa
  case _ => "Not Available"
}

val hostPort = ("google.com", 8080)

hostPort match {
  case ("localhost", port) => s"This is localhost with port $port"
  case (host, port) => s"This is $host with port $port"
}

val intList = List(1,2,3,4)

intList match {
  case 1::2::Nil => 1 + 2
  case List(1, _*) => 1 + 10
  case List(a,b) => a + b
  case _ => 100
}

val a: Any = 4

a match {
  case value: Int => s"This $value is int"
  case value: Double => s"This $value is double"
}