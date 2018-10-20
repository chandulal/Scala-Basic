//val

//is evaluated on the definition itself
val three = 3

//var

var four = 4
four = 5

//Lazy evaluation in def as well but will be re-evaluated every time when invoked
def five = 5

five
five //Will re-evaluate evaluate every time


//Lazy evaluation used in build.sbt


//Lazy val will evaluate, but just once when its used the first time
lazy val six = 6
six  + 5
