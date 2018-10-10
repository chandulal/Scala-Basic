println("Hello World")

(1 to 10).map( _ * 10)

//statements

val weight=50 //kg
var comment=""

if(weight > 70)
  comment="Start exercise"
else
  comment="You are fit"

//expressions

val comment1 = if(weight > 70) "Start exercise" else "You are fit"

class Person(var name: String)

def changeName(person: Person) ={
  new Person(person.name + "Blob")
}

val person = new Person("Alice")
person.name
val p = changeName(person)
person.name
p.name