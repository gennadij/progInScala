package main

import chapter6.Rational
import chapter4.ChecksumAccumulator
import chapter7.ForExpression
import chapter7.MiltiTable
import chapter10.Element
import chapter10.Element
import chapter10.Element
import chapter10.Element
import chapter10.Element
import chapter10.Spiral
import chapter12.BasicIntQueue
import chapter12.MyQueue
import chapter12.Filtering
import chapter12.Incrementing
import chapter12.Doubling
import chapter15._

object Main {
	
  
  def main(args: Array[String]) = {
    println("*****************chapter 6 *************")
    
    val a = new Rational(4, 5)
    val b = new Rational(7, 8)
    val c = new Rational(8, 9)
    val d = new Rational(11, 10)
    
//    println(a + b)
//    println(a * b)
//    println(a / b)
//    println(d * 3)
    
    val checkSum = ChecksumAccumulator.calculate("test")
    
    //println(checkSum)
    
    println("****************chapter 7***************")
    
    val forExp = new ForExpression
    
//    forExp.grep(".*Name.*")
//    println("**************************")
//    val arrayOfFiles = forExp.scalaFiles
//    for(file <- arrayOfFiles) println(file)
    
//    forExp.callFor
    
    val padding = " " * (2)
    
//    println("Padding: " + padding + ";")
    
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
    
//    println(inc10(15))
    
    def makeIncreaser2(more: Int) = (yetMore: Int) => (x:Int) => x + yetMore + more
    
    val inc1 = makeIncreaser2(5)
    
    val inc2 = inc1(5)
    
//    println(inc2(10))
    
    def speed(distance: Int, time: Int): Int = distance / time
    
    val dist = 100
    
    val t = 10
    
//    println(speed(time = t, distance = dist))
    
//    println(sum(3, 4 , 15))
    
    println("**********************chapter 8****************")
    
    var assertionsEnabled = false
    val x = 10
    def byNameAssert(predicate: => Boolean) = 
      if(assertionsEnabled == !predicate)
        throw new AssertionError
        
    def boolAssert(predicate: Boolean) = 
      if(assertionsEnabled == !predicate)
        throw new AssertionError
        
//    byNameAssert(x / 0 == 0)
//    println("=============")
//    boolAssert(x / 0 == 0)
    
    println("**********************chapter 10****************")
    
//    val elem = new Element
//    val e1: Element = new ArrayElement(Array("hello", "world"))
//    val ae: ArrayElement = new LineElement("hello")
//    val e2: Element = ae
//    val e3: Element = new UniformElement('x', 2, 3)
    
    
//    println(Spiral.spiral(20, 0))
    
    println("******************chapter 12*******************")
    
    val q = new BasicIntQueue
    
    q.put(10)
    q.get()
    
    println("*************************************")
    
    val q2 = new MyQueue
    
    q2.put(10)
    q2.get()
    
    println("*************************************")
    
    val q3 = (new BasicIntQueue with Doubling with Filtering with Incrementing)
    
    q3.put(-2)
    println("***********************")
    q3.put(0)
    println("***********************")
    q3.put(1)
    println("***********************")
    println("******************chapter 13 *******************")
    
    println("******************chapter 15 *******************")
    
    var expr: Int = 0
    expr match {
        case 0 => println("zero")
        case somethingElse => println("not zero: " + somethingElse)
      }
    
    
    val f1 = new ExprFormater
    
    val e1 = BinOp("*", BinOp("/", Number(1), Number(2)),
                        BinOp("+", Var("x"), Number(1)))
    val e2 = BinOp("+", BinOp("/", Var("x"), Number(2)),
                        BinOp("/", Number(1.5), Var("x")))
    val e3 = BinOp("/", e1, e2)
    
    def show(e: Expr) = println(f1.format(e) + "\n\n")
    
    for (e <- Array(e1, e2, e3)) show(e)
    
    
    
    
    println(expr)
    println("******************chapter 16 *******************")
    
    
    
  }
}