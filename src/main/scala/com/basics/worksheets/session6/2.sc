//Either


//Either[A, B]
//Tuple2[A, B]

Tuple2("abc", 2)


case class Customer(age: Int)

class Alcohol


def buyAlcohol(customer: Customer) = {
  if(customer.age < 16)
    Left("Under 16 can not buy alcohol.")
  else
    Right(new Alcohol)
}

val customer1 = Customer(10)

val stringOrAlcohol = buyAlcohol(customer1)

stringOrAlcohol.isLeft
stringOrAlcohol.isRight

//stringOrAlcohol.left.get
stringOrAlcohol.right.getOrElse()

val str = stringOrAlcohol match {
  case Left(msg) => msg
  case Right(al) => al.toString
}

stringOrAlcohol.map(x => println(x))