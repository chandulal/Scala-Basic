
//def product( x: Int, y: Int) = x * y
implicit val multiplicand: Int = 7
implicit val multiplier: Double = 8.0

def product(x: Int)(implicit y: Int) = x * y
//product(2)(3)
product(2)

//def max(x: Int, y: Int): Boolean = x < y
def isLess[T](x: T, y: T)(implicit ord: Ordering[T]): Boolean = ord.lt(x, y)
isLess("apple", "pineapple")
isLess(1, 2)

def msort[T](x: List[T])(implicit ord: Ordering[T]): List[T] = {
  val mid = x.length / 2
  if (mid == 0) x
  else {
    def merge(x1: List[T], x2: List[T]): List[T] = {
      (x1, x2) match {
        case(Nil, x2) => x2
        case(x1, Nil) => x1
        case(x1head:: x1tail, x2head:: x2tail) =>
          if (ord.lt(x1head,x2head)) x1head:: merge(x1tail, x2)
          else x2head :: merge(x1, x2tail)
      }
    }
    val (firstlist, secondlist) = x.splitAt(mid)
    merge(msort(firstlist), msort(secondlist))
  }
}

val numbers = List(8,3,2,9)
msort(numbers)

val strings = List("apple", "pineapple", "orange")
msort(strings)

val num1 = 1::2::9::7::Nil
msort(num1)


