package chapter10

abstract class AbstractElement {
  def contents: Array[String]
  
  def width: Int = {
    if (height == 0) 0 else contents(0).length
  }
  
  def height: Int = contents.length
  
  def above(that: Element): Element = 
    new ArrayElement(this.contents ++ that.contents)
}