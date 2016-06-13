package chapter12

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue{
  
  private val buf = new ArrayBuffer[Int]
  
  def get() = {
    println("BasicIntQueue -> get")
    buf.remove(0)
  }
  def put(x: Int) { 
    println("BasicIntQueue -> put=" + x)
    buf += x
  }
  
}