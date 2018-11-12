trait User {
  val name: String
  val score: Int
}

case class FreeUser(name: String, score: Int, upgradeProb: Double) extends User
case class PremiumUser(name: String, score: Int) extends User

object checkUpgradeProbability {
  def unapply(freeUser : FreeUser): Boolean =
    freeUser.upgradeProb < 0.7
}

val user: User = FreeUser("Alice", 20, 0.4)

user match {
  // Adding variable to a pattern.
  case freeUser @ checkUpgradeProbability() => s"Welcome ${freeUser.name}. Do you wish to convert to a Premium user?"
  case FreeUser(name, score, p) => s"Hi $name. You'll be converted to a Premium user soon."
  case PremiumUser(name, score) => s"Welcome Back! $name."
  case _ => s"User not found."
}