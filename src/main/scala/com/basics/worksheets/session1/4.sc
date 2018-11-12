//Recursion

def factorial(number: Int) :Int =
  if(number == 1) 1 else number * factorial(number -1)

factorial(50)

def fact(accumulator: Int, number: Int) :Int ={
  if(number == 1) accumulator
  else fact(accumulator * number, number - 1)
}
fact(1, 50)

def improvedFact(number: Int) :Int = {

  def fact(accumulator: Int, n: Int) :Int ={
    if(n == 1) accumulator
    else fact(accumulator * n, n - 1)
  }
  fact(1, number)
}

improvedFact(5)
