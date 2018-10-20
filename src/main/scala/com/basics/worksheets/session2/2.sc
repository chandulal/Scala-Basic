//Case class

case class City(name: String)

case class Person(name: String, age: Int, city: City) {
  val addAge = (value: Int) => age + value

  def addA(value: Int) = age + value

}

val person1 = Person("Alice", 10, City("London"))
val person2 = Person("Alice", 10, City("London"))

val person3 = person1.copy()
val person4 = person1.copy("Bob")

person1 == person2
person1 == person3
person1 == person4

person1.addAge(5)
person1.addA(10)

//For case class -> do not need 'new' but for class, it's necessary.

//Case class can easily compare two objects with same values.

//Ask var thing
