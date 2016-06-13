

class Sqrt {
  def sqrtIter(guess: Double, radicand: Double): Double =
    if(isGoodEnough(guess, radicand)) guess
    else sqrtIter(improve(guess, radicand), radicand)
    
    def improve(guess: Double, radicand: Double) = 
      (guess + radicand / guess) / 2
      
    def isGoodEnough(guess: Double, radicant: Double) = 
      abs(square(guess) - radicant) < 0.001
    
    def square(squared: Double) = squared * squared
          
    def abs(x: Double) = if (x > 0) x else x * (-1)  
    
    def sqrt(radicand: Double) = sqrtIter(1.0, radicand)
}