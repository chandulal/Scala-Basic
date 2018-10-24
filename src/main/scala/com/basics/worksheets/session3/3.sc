/*
 Option
*/

val javaNull: Option[String] = Option(null)
val hello: Option[String] = Option("Hello")


// trait Option[T]

// class None extends Option //when there is no value

// class Some extends Option

val greeting: Option[String] = Some("Good morning")
val greeting1: Option[String] = None

val a = if (greeting.isDefined) {
  greeting.get
} /* else { // If else part is not defined, then type of a is any because it can be anything.
  "Hello"
}*/

greeting1.getOrElse("How are you?")

greeting.map(g => g.length)
greeting1.map(g => g.length)

case class User(id: Int, name: String)

object UserDB {
  private val users = Map(
    1 -> User(1, "Alice"),
    2 -> User(2, "Bob")
  )

  def findById(id: Int): Option[User] = users.get(id)
}

val findUsersByID = List(1, 2, 3)

val result = findUsersByID.map(UserDB.findById)

val findUser = UserDB.findById(1)

// Pattern Matching

findUser match {
  case Some(User(_, name)) => println(name)
  case None => println("No user")
  case _ => println("Default") // This is not needed in case of Option - because in Option, it's either Some or None
}


result.foreach {
  case Some(User(_, name)) => println(name)
  case None => println("No user")
  case _ => println("Default") // This is not needed in case of Option - because in Option, it's either Some or None
}

