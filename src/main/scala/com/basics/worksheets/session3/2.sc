
val votes = Seq(
  ("Java", 10),
  ("Scala", 15),
  ("Java", 3),
  ("Scala", 5)
)

val votesByLang = votes.groupBy { case (lang, _) => lang }

val countsByLang = votesByLang.map {
  case (lang, countSeq) => {
    val counts = countSeq.map { case (_, count) =>
      count
    }
    (lang, counts.sum)
  }
}
val orderedCounts = countsByLang.toSeq.sortBy(_._2).reverse

val ints = 1 to 100

val abc = ints.map(x => x * 2)

abc(4)
