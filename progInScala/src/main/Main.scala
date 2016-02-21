package main

import chapter6.Rational

object Main {
  
  def main(args: Array[String]) = {
    val a = new Rational(4, 5)
    val b = new Rational(7, 8)
    val c = new Rational(8, 9)
    val d = new Rational(11, 10)
    
    
    
    println(a + b)
    println(a * b)
    println(a / b)
    println(d * 3)
  }
}