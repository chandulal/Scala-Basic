// Trait

abstract class Bird {

}

abstract class FlyingBird extends Bird{
  val flyMessage: String
  def fly() = println(flyMessage)
}


abstract class SwimmingBird extends Bird{
  def swim() =  println("I am swimming.")
}

class Pigeon extends FlyingBird// , SwimmingBird -> Multiple Inheritance like this is not supported -> We need traits
{
  override val flyMessage: String = "I am a flyer."
}

class Hawk extends FlyingBird {
  override val flyMessage: String = "I am a super flyer."
}

class Penguin extends Bird

class FrigateBird extends SwimmingBird

//Ask shortcut to see type
val birds = List(new Pigeon, new Hawk)

birds.foreach(bird => bird.fly())
//birds.foreach(bird => bird.swim())