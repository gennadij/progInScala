package sqrt




class ExactSqrt {

  def calcMultiplicator(radicand: Int, multiplicand: Int):Int = 
    if(radicand % multiplicand == 0) multiplicand
    else if (radicand / 2 > multiplicand) -1
    else calcMultiplicator(radicand, multiplicand + 1)
      
  def calcSqrt(root: Int, counter: Int, radicand: Int): Int = 
    if(radicand == counter) root
    else calcSqrt(root + 1, counter + 2, radicand)
    
  def sum (decriment: Int, sum2: Int): Int = 
    if(decriment <= 0) 0
    else sum(decriment - 2 , sum2 + decriment)

  def sqrt(radicand: Int) = {
    val radicandWithMult = calcMultiplicator(radicand, 3)
    val root = calcSqrt(1, 3, radicandWithMult)
    (radicandWithMult, root)
  }
}

// sum func einbauen