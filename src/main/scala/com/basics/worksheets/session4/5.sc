case class Rational(n: Int, d: Int){

  def +(that: Rational) = {
    Rational(this.n * that.d + this.d * that.n, this.d * that.d)
  }

  private def gcd(x: Int, y: Int): Int = {
    if (y == 0) x else gcd(y, x % y)
  }
  def +(value: Int) : Rational = this + Rational(value, 1)

  def reduce() = {
    val g = gcd(n,d)
    Rational(this.n/g, this.d/g)
  }
  override def toString = s"$n/$d"
}

object Rational {
  implicit def intToRational(x: Int) =
    Rational(x, 1)

  implicit def intToRational2(x: Int) =
    Rational(x, 1)

  implicit def RationalToDouble(r: Rational) =
    r.n.toDouble / r.d.toDouble
}

val half = Rational(1,2)
val twoHalf = Rational(2,2)

half + twoHalf
half.+(1)

half + 1

1 + half

val total1: Rational = half + 1
val total: Double = 1 + half


Map(1 -> "one")