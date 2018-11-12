// Function vs Method

def addition3(x: Int) = x + 3
val add3 = (x: Int) => x + 3

addition3(5)
add3(5)

val clonedOfAdd3 = add3
val cloned1OfAdd3 = add3

clonedOfAdd3(5)

val clonedOfAddition3 = addition3 _
val cloned1OfAddition3 = addition3 _

clonedOfAddition3(5)

add3.toString()
clonedOfAddition3.toString

add3 == clonedOfAdd3
add3 == clonedOfAddition3
clonedOfAddition3 == cloned1OfAddition3
clonedOfAdd3 == cloned1OfAdd3

add3.andThen(clonedOfAdd3)(5)

def mySubstring[T](value: T) = {
  value.toString.substring(0,4)
}
mySubstring("fsdfsd")
mySubstring(123232)

//val mySubstringFn = (value: T) => value.toString.substring(0,4)

class MySubString[T] extends Function1[T, String]{
  def apply(value: T) = value.toString.substring(0,4)
}

val mySubStringInt = new MySubString[Int]
mySubStringInt(234343)

val mySubStringString = new MySubString[String]

mySubStringString("fasdffsd")
