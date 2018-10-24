trait Iterable[T]

//Present both immutable and mutable
trait Seq[T] extends Iterable[T]

trait Set[T] extends Iterable[T]

trait Map[T] extends Iterable[T]

// In case mutable collection is needed
import scala.collection.mutable.Seq

// Avoid this - because by default immutable collections are imported
// but this will override that.
//import scala.collection.mutable._

val seq = Seq(1, 2, 3, 4)
val set = Set(1, 2, 3, 1)
val map = Map(1->"One", 2-> "Two")

// List uses cons operator internally
val list = List(4, 5, 6, 7)

// So a list can be created using cons operator as well
4 :: 5 :: 6 :: 7 :: Nil

// :: operator is useful in Pattern matching
List(7).::(6).::(5).::(4)

val square = (x: Int) =>  x * x
list.map(square)

val multiplyBy =(x: Int, by: Int) =>  x * by
list.map(multiplyBy(_,2))

list.foreach(x => x * 2)

list.filter(_ % 2 == 0)

list.partition(_ % 2 == 0)

val hostPort = ("localhost", 8080)
hostPort._1
hostPort._2

val tuple3 = ("https", "localhost", 8080)

//Can define tuple with maximum 22 elements - because at max Tuple22 supported
tuple3._3

val list2 = List("a", "b", "c", "d")
list2.zip(list)
list2.zipWithIndex
list2.head
list2.tail
list2.last
list2.init
list.take(2)
list.takeRight(2)

list.foldLeft(0)((x,y) => x + y) //Basically sum from left

list.foldLeft(0){(x,y) =>
  println(s"$x and $y")
  x + y
}

// foldRight will start from right.

val listOfList = List(List(1,2), List(3,4))
listOfList.flatten

listOfList.map(x => x.map(y => y * 5))

listOfList.map(x => x.map(y => y * 5)).flatten
listOfList.flatMap(x => x.map(y => y * 5))