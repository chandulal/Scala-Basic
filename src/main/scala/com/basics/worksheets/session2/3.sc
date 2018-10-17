//trait

abstract class Bird {
}

abstract class FlyingBird extends Bird {
  val flyMessage: String
  def fly() = println(flyMessage)

}

abstract class SwimmingBird extends Bird {
  def swim() = println("I am swimming.")
}
class Pigeon extends FlyingBird {
  override val flyMessage = "I am a flyer."
}

class Hawk extends FlyingBird {
  override val flyMessage = "I am a super flyer"
}

class Penguin extends Bird

class FrigateBird extends SwimmingBird

val birds = List( new Pigeon, new Hawk)

val swimmingBirds = List(new Pigeon, new Hawk, new Penguin)

birds.foreach(bird => bird.fly())
birds.foreach(bird => bird.swim())

swimmingBirds.foreach(bird => bird.swim())