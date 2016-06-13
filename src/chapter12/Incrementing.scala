package chapter12

trait Incrementing extends IntQueue{
  abstract override def put(x: Int) {
    println("Incrementing -> put=" + x)
    super.put(x + 1)
  }
}