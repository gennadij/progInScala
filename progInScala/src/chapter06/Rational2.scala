package chapter06

class Rational2(n: Int, d: Int) {
  val numer = n
  require(d != 0)
  def add(that: Rational2): Rational2 = new Rational2(n + d + that.numer, d + n)
}