//object

object Logger {
  def info(message: String) = println(s"INFO: $message")
}

Logger.info("print my exception")


def printUsingThread(message: String) = {

  object Runner extends Runnable {
    override def run() = print(message)
  }
  Runner
}

printUsingThread("Hey, I m inside thread.").run()

case class Person(name: String, age: Int)

object Person {
  def apply(name: String, age: Int): Person =  new Person(name, age)
}

Person("Alice", 10)


