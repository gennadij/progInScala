package main

import chapter6.Rational
import chapter4.ChecksumAccumulator
import chapter7.ForExpression
import chapter7.MiltiTable

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
    
    val padding = " " * (2)
    
    println("Padding: " + padding + ";")
    
    
    //println(new MiltiTable().miltiTable)
    
    println("****************chapter 8***************")
    
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    
    //println("1: " + someNumbers.filter { x => 0 < x })
    
//    println("2: " + someNumbers.filter { _ < 0 })
    
    def fil(a: Int) = a < 0
    
//    println("3: " + someNumbers.filter { fil(_) })
    
    val funktion = fil _
    
//    println("4: " + someNumbers.filter { funktion(_) })
    
    val f = (_: Int) + (_: Int)
    
//    println(f(3, 5))
    
//    someNumbers.foreach { println _ }
    
    def sum(a: Int, b: Int, c: Int) = a + b + c
    
    val funk = sum(1, 2, 5)
    
    val paf = sum _
    
//    println(sum(3, 4 , 15))
    
    
    def makeIncreaser(more: Int) = (x: Int) => x + more
    
    val inc10 = makeIncreaser(11)
    
    println(inc10(15))
    
    def makeIncreaser2(more: Int) = (yetMore: Int) => (x:Int) => x + yetMore + more
    
    val inc1 = makeIncreaser2(5)
    
    val inc2 = inc1(5)
    
    println(inc2(10))
    
    def speed(distance: Int, time: Int): Int = distance / time
    
    val dist = 100
    
    val t = 10
    
    println(speed(time = t, distance = dist))
  }
}