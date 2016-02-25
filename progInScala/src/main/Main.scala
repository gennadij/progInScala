package main

import chapter6.Rational
import chapter4.ChecksumAccumulator
import chapter7.ForExpression
object Main {
	
  println("*****************chapter 6 *************")
  def main(args: Array[String]) = {
    val a = new Rational(4, 5)
    val b = new Rational(7, 8)
    val c = new Rational(8, 9)
    val d = new Rational(11, 10)
    
    println(a + b)
    println(a * b)
    println(a / b)
    println(d * 3)
    
    val checkSum = ChecksumAccumulator.calculate("test")
    
    println(checkSum)
    
    println("****************chapter 7***************")
    
    val forExp = new ForExpression
    
    forExp.grep(".*Name.*")
    println("**************************")
    val arrayOfFiles = forExp.scalaFiles
    for(file <- arrayOfFiles) println(file)
    forExp.callFor
  }
}