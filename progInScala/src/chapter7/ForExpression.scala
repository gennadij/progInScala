package chapter7

class ForExpression {
  def callFor = {
    
    val fileHere = (new java.io.File("..").listFiles)
  
    for (file <- fileHere)
      println(file)
  }
}