//object

//This is a class with a single object.
object Logger {
  def info(message: String) = println(s"INFO: $message")
}

//Equivalent to Class.methodName
Logger.info("print my exception")


// Can return an object inside definition as well.
def printUsingThread(message: String) = {

  object Runner extends Runnable {
    override def run() = print(message)
  }
  Runner
}
printUsingThread("Hey, I m inside thread.").run()


case class Person(name: String, age: Int)

// Companion object for the above class
// because there is a class with same name in this file.
object Person {
  def apply(name: String,age: Int): Person = new Person(name, age + 10)
}

Person("Alice", 10)