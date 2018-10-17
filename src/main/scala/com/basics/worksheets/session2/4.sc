
trait Bird

trait Swimming {
  def swim() = println(" I am swimming.")
}

trait Flying {
  val flyMessage: String
  def fly() = println(flyMessage)
}

class Pigeon extends Bird with Flying with Swimming {
  override val flyMessage = "I am a flyer."
}

class Hawk extends Bird with Flying with Swimming {
  override val flyMessage = "I am a super flyer."
}

class Penguin extends Bird with Swimming

class FrigateBird extends Bird with Flying {
  override val flyMessage = "I am a excellent flyer"
}


val birds = List(new Pigeon, new Hawk, new FrigateBird)

val swimmingBirds = List(new Pigeon, new Hawk, new Penguin)

swimmingBirds.foreach(b => b.swim())

val birds1 = List(new Pigeon, new Hawk, new FrigateBird, new Penguin)