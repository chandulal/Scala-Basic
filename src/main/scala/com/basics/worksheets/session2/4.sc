trait Bird {
  def describe = println("I am a bird.")
}

trait Swimming extends Bird{
  def swim = println("I can swim.")
  override def describe = println("I am a swimming bird.")
}

trait Flying extends Bird {
  val flyMessage: String
  def fly() = println(flyMessage)
  override def describe = println("I am a flying bird.")
}

class Pigeon extends Bird with Swimming with Flying {
  override val flyMessage: String = "I can fly high."
}

class Hawk extends Bird with Flying with Swimming {
  override val flyMessage: String = "I can fly super high."
}

class Penguin extends Bird with Swimming

class FrigateBird extends Bird with Flying {
  override val flyMessage: String = "I can fly even higher."
}

val birds = List(new Pigeon, new Hawk, new FrigateBird)

val swimmingBirds = List(new Pigeon, new Hawk, new Penguin)

birds.foreach(b => b.fly)

swimmingBirds.foreach(b => b.swim)

//Linearization => Right trait will override the left one.
val birds1 = List(new Pigeon, new Hawk, new Penguin, new FrigateBird)
birds1.foreach(b => b.describe)