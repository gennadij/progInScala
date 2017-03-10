package chapter12


trait Rectangular {
  val topLeft: Point
  val bottomRight: Point
  
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}