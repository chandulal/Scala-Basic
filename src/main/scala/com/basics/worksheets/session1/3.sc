//Higher order function

def listOp(listInt: List[Int], fn: Int => Int ) ={
  listInt.map(value => fn(value))
}

val add3 = (x: Int) => x + 3

val square = (x: Int) => x * x

listOp(List(1,2,3), add3)

listOp(List(1,2,3), square)

List(1,2,4).map(x => x + 1)

def buildUrl(ssl: Boolean, domain: String) = {
  val schema = if(ssl) "https://" else "http://"
  (endPoint: String, query: String) =>
    s"$schema$domain/$endPoint?$query"
}

val getUrl = buildUrl(true, "www.grab.com")
getUrl("users", "id=1")