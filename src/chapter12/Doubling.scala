package chapter12

trait Doubling extends IntQueue{
  abstract override def put(x: Int) {
    println("Doubling -> put=" + x)
    super.put(2 * x)
  }
}