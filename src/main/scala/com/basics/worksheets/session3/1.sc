

val seq = Seq(1, 2, 3, 4)

val set = Set(1,2,3,1)

val map = Map(1 -> "One", 2 -> "two")

val list = List(4, 5, 6, 7)

4 :: 5 :: 6 :: 7 :: Nil

List(7).::(6).::(5).::(4)

val square = (x: Int) => x * x
val multiplyBy2 = (x: Int, by: Int) => x * by
list.map(multiplyBy2(_, 2))

list.foreach(x => x * 2)

list.filter(_ % 2 == 0)
list.partition(_ % 2 == 0)

val hostPort = ("localhost", 8080)
hostPort._1
hostPort._2

val tuple3 = ("https", "localhost", 8080)
tuple3

val list2 = List("a", "b", "c", "d")
list2.zipWithIndex
list2.head
list2.tail
list2.last
list2.init
list2.take(2)
list2.takeRight(2)

list.foldLeft(0){(x, y) =>
  println(s"$x and $y")
  x + y
}

list.foldRight(0){(x, y) =>
  println(s"$x and $y")
  x + y
}

val listOfList = List(List(1,2), List(3,4))

listOfList.flatten

listOfList.flatMap(xs => xs.map(y => y * 5))

case class Person(name: String)

val persons = List(Person("Alice"), Person("Bob"))

val changeName = (x: Person) => println(x.name)
persons.map(changeName)

