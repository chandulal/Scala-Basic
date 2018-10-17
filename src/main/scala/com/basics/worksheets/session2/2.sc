

case class City(name: String)
case class Person(name: String, age: Int, city: City){
  val addAge = (value: Int) => age + value

  def addA(value: Int) = age + value
}

val person1 = Person("Alice", 10, City("London"))
val person2 = Person("Alice", 10, City("London"))

val person3 = person1.copy()
//val person4 = person1.copy(city = "New York", name = "Bob")

person1 == person2

person2 == person3

person1 == person3



//person1 == person4

person1.addAge(5)
person1.addA(10)