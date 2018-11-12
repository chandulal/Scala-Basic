
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