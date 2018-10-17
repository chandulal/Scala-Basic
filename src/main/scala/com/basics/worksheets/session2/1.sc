/*
class

 */

class Person(name: String, age: Int, city: String)

val person1 = new Person("Alice", 10, "London")


class Point(x: Int, y: Int) {

  val abc = (p: Int) => println(p)

  def move(dx: Int, dy: Int) = {
    new Point(x + dx, y + dy)
  }
  override def toString: String = s"($x, $y)"
}


val point1 = new Point(2, 3)
val point2 = new Point(2, 3)

point1.move(2,2)

point1.abc(10)

point1 == point2
