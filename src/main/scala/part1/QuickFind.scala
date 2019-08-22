package part1

class QuickFind(n: Int) {

  val ids: Array[Int] = new Array(n)

  def union(p: Int, q: Int): Unit = {
    val pid = ids(p)
    val qid = ids(q)
    ids.foreach { id =>
      if (ids(id) == pid) {
        ids(id) = qid
      }
    }
  }

  def connected(p: Int, q: Int): Boolean = ids(p) == ids(q)

}
