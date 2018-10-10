println("Hello World")

(1 to 20).map( _ * 10)

//--------------------------------------------
//statements

val weight=50 //kg
var comment=""

if(weight > 70)
  comment="Start exercise"
else
  comment="You are fit"

//expressions

val comment1 = if(weight > 70) "Start exercise" else "You are fit"

//------------------------------------------------------------------------------
// Immutability (Pure Function -> should not modify any outside arguments
//                             -> should always return the same value given same arguments
// )

class Person(var name: String)

def changeName(person: Person) = {
  new Person(person.name + "blob")
}

val person = new Person("Alice")
person.name
val p = changeName(person)
person.name
p.name