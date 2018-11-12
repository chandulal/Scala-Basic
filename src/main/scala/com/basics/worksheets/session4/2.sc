trait User {
  val name: String
  val score: Int
}

class FreeUser(val name: String, val score: Int) extends User
class PremiumUser(val name: String, val score: Int) extends User

object FreeUser {
  def unapply(freeUser : FreeUser): Option[(String, Int)] =
    Some(freeUser.name, freeUser.score)
}

object PremiumUser {
  // Gets attributes from an object.
  def unapply(premiumUser : PremiumUser): Option[(String, Int)] =
    Some(premiumUser.name, premiumUser.score)
}

val user: User = new FreeUser("Alice", 20)

user match {
  case FreeUser(name, score) => s"$name is a Free User."
  case PremiumUser(name, score) => s"$name is a Premium User."
  case _ => s"User not found."
}

