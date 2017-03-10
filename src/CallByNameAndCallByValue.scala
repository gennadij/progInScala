

object CallByNameAndCallByValue {
  def main(args: Array[String]) {
    delayedByName(time)
    println("===================")
    delayedByValue(time)
    println("===================")
    val integer = 23
    val b = 43
    printNamedArg(integer, b=34)
  }
  
  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  
  def delayedByName(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
    println("Calling t again ...")
    t
    println(t)
  }
  
  def delayedByValue(t: Long) = {
    println("In delayed method")
    println("Param: " + t)
    println("Calling t again ...")
    t
  }
  
  def printNamedArg(a:Int, b:Int) = {
    println(a)
    println(b)
  }
}