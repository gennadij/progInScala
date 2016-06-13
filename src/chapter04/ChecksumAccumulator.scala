
package chapter04

import scala.collection.mutable.Map

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  
  def calculate(s: String): Int = 
    if(cache.contains(s))
      cache(s)
    else{
      val test = "test"
      val acc = new ChecksumAccumulator
      
      println(acc.toString())
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}


class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte):Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}
