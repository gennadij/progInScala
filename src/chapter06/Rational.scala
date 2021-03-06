package chapter06

class Rational(n: Int, d: Int) {
  require(d != 0)
  
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom: Int = d/g
  
//  implicit def intToRational(i: Int): Rational = new Rational(i)
  
  def this(n: Int) = this(n, 1) // auxiliary constructor
  
  override def toString = numer + "/" + denom
  
  def + (that: Rational): Rational = new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  
  def + (i: Int): Rational = 
    new Rational(numer + i * denom, denom)
  
  def - (that: Rational): Rational = 
    new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom)
  
  def - (i: Int): Rational = 
    new Rational(numer - i * denom, denom)
    
  def * (that: Rational): Rational = 
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int) = new Rational(numer * i, denom)
  
  def / (that: Rational): Rational = 
    new Rational(numer * that.denom, denom * that.numer)
  
  def / (i: Int): Rational = new Rational(numer, denom * i)
  
  
  private   def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)

  
}