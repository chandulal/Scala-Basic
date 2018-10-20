object Cakes {
  trait Cake {
    val name: String
  }

  class Cupcake extends Cake {
    override val name = "This is a cupcake."
  }
  class Donut extends Cake {
    override val name = "This is a donut."
  }

  class UnknownCake extends Cake {
    override val name = "I don't know."
  }
}

object CakeFactory {
  import Cakes._
  def apply(cakeName: String) = {
    cakeName match {
      case "Cupcake" => new Cupcake
      case "Donut" => new Donut
      case _ => new UnknownCake
    }
  }
}

CakeFactory("Donut").name
CakeFactory("Cupcake").name
CakeFactory("Cupcak").name


case class Person(name: String, age: Int)

trait Type
case class Tuple(name: String, age: Int) extends Type
case class Random() extends Type

object Person{
  // apply method can be useful to construct the object of the class
  // from any type of input arguments according to your use case.
  // Provides flexibility.
  def apply(dataType: Type): Person = {
    dataType match {
      case t: Tuple => new Person(t.name, t.age)
      case _: Random => new Person("Random", 1)
    }
  }
}

Person("Alice", 20).name
Person(Tuple("Alice",10))
Person(Random()).age

