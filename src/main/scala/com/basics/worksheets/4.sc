//Recursion

def factorial(number: Int): Int = {
  if (number == 1) 1 else number * factorial(number-1)
}

factorial(5)

//Tail Recursion
def fact(accumulator: Int, number: Int): Int = {
  if (number == 1) accumulator
  else fact(number * accumulator, number - 1)
}

fact(1,5)


// Abstraction of accumulator
def improvedFact(number: Int): Int = {
  def fact(accumulator: Int, number: Int): Int = {
    if (number == 1) accumulator
    else fact(accumulator * number, number - 1)
  }
  fact(1,number)
}

improvedFact(5)