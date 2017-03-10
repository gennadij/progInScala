package chapter07

class MiltiTable {
  def makeRowsSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  
  def makeRow(row: Int) = {
    makeRowsSeq(row).mkString
  }
  
  def miltiTable = {
    val tableSeq = 
      for (row <- 1 to 10) yield makeRow(row)
    tableSeq.mkString("\n")
  }
}