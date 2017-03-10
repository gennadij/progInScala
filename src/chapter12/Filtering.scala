package chapter12

trait Filtering extends IntQueue{
  abstract override def put(x: Int) {
    println("Filtering -> put = " + x)
    if (x > 0) super.put(x)
  }
}