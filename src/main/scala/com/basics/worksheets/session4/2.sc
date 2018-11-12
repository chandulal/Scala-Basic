
trait User {
  val name: String
  val score: Int
}

case class FreeUser(name: String, score: Int, upgradeProb: Double) extends User
case class PremiumUser(name: String, score: Int) extends User

val user: User = FreeUser("Alice", 20, 0.8)

object upgradeProbability {
  def unapply(freeUser: FreeUser): Boolean =
    freeUser.upgradeProb > 0.7
}

user match {
  case freeUser @ upgradeProbability() =>
    println(s"Welcome ${freeUser.name} what can we do for you?")
  case FreeUser(name, score, p)  =>
    println(s"Welcome $name. ")
  case PremiumUser(name, score) => println(s"Welcome back, $name.")
  case _ => "Not found"
}