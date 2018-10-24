/*
  Option
*/

 val javaNull: Option[String] = Option(null)
 val hello: Option[String] = Option("Hello")

 val greeting: Option[String] = Some("Good morning")
 val greeting1: Option[String] = None


 greeting1.getOrElse("How are you?")

 greeting.map(g => g.length)


 case class User(id: Int, name: String)

 object User {
   private val users = Map(
     1 -> User(1,"Alice"),
     2 -> User(2, "Bob")
   )
   def findById(id: Int) = users.get(id)
}

 val maybeUser = User.findById(3)
 maybeUser match {
   case Some(User(_, name)) => println(name)
   case None => println("No user")
 }
