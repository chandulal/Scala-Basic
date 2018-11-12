/******************************************************************************

// Implicit values

  ******************************************************************************/

def product(x: Int)(implicit y: Int) = x * y

//product(5)

implicit val multiplier: Int = 6

product(5)

def isSmaller[T](x: T, y: T)(implicit ord: Ordering[T]): Boolean =
  ord.lt(x, y)

isSmaller(10, 2)

isSmaller("apple", "orange")

def msort[T](list: List[T])(implicit ordering: Ordering[T]): List[T] = {
  val mid = list.length / 2
  if(mid == 0) list
  else{
    def merge(firstHalf: List[T], secondHalf: List[T]): List[T] = {
      (firstHalf, secondHalf) match {
        case (Nil, secondHalf) => secondHalf
        case (firstHalf, Nil) => firstHalf
        case (firstHalfHead :: firstHalfTail, secondHalfHead :: secondHalfTail) =>
          if (ordering.lt(firstHalfHead, secondHalfHead))
            firstHalfHead :: merge(firstHalfTail, secondHalf)
          else
            secondHalfHead :: merge(firstHalf, secondHalfTail)
      }
    }
    val (split1, split2) = list.splitAt(mid)
    merge(msort(split1), msort(split2))
  }
}

val listOfNumbers = List(193, 32, 432, 543, 65, 76, 876)
val listOfFruits = List("apple", "strawberry", "orange", "pineapple", "blueberry")

msort(listOfNumbers)
msort(listOfFruits)