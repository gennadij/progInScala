package chapter06

class Rational_10032017(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d
  require(d != 0)
  
  override def toString = n + "/" + d
  
  def add(that: Rational_10032017): Rational_10032017 = {
    new Rational_10032017(numer * that.denom + that.numer * denom, denom * that.denom)
  }
}