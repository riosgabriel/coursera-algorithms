package part1

class QuickUnion(n: Int) {

  val ids: Array[Int] = Array.range(0, n)

  def root(i: Int): Int = {
    val value = ids(i)

    if (value == i) value
    else root(value)
  }

  def connected(p: Int, q: Int): Boolean = root(p) == root(q)

  def union(p: Int, q: Int): Unit = {
    val rootP = root(p)
    val rootQ = root(q)
    ids(rootP) = rootQ
  }

}

object QuickUnionMain extends App {

  val qu = new QuickUnion(10)

  qu.ids.foreach(println)
}
