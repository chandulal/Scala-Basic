val votes = Seq(
  ("Java", 10),
  ("Scala", 15),
  ("Java",3),
  ("Scala", 5)
)
// This
//val votesByLanguage = votes.groupBy(_._1)

// or
val votesByLanguage = votes.groupBy{
  case(lang, _) if(lang == "Java") => "java"
  case(lang, _)  => lang
}

val voteCountsByLang = votesByLanguage.map {
  case(lang, votes) => {
    val count = votes.map{
      case (lang, count) => count
    }
    println(count)
    (lang, count.sum)
  }
}

val orderedCounts = voteCountsByLang.toSeq.sortBy(_._2).reverse

val ints = 1 to 100

val indexedSeq = ints.map(x => x)

indexedSeq(0)