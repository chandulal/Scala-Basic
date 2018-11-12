/******************************************************************************

// Implicit definitions

******************************************************************************/

case class Rational(n: Int, d: Int){

  def +(that: Rational): Rational = {
    Rational(this.n * that.d + that.n * this.d, this.d * that.d)
      .reduce()
  }

  def +(i: Int): Rational = this + Rational(i, 1)

  private def gcd(x: Int, y: Int): Int = {
    if(y==0) x else gcd(y, x % y)
  }

  def reduce() = {
    val g = gcd(n, d)
    Rational(this.n/g, this.d/g)
  }
  override def toString = s"$n/$d"
}

object Rational{
  implicit def intToRational(i: Int): Rational = Rational(i, 1)

  implicit def rationalToDouble(r: Rational): Double =r.n.toDouble /r.d.toDouble
}

val half = Rational(1,2)
val threeQuarter = Rational(3,4)

half + threeQuarter
half.+(threeQuarter)

half + 1

1 + half

val total: Double = 1 + half

val total1: Rational = half + 1

val total2: Double = half + 1