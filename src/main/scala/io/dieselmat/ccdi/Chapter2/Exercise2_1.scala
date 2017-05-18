package io.dieselmat.ccdi.Chapter2

import scala.collection.mutable

/**
  * Created by spencermateo on 17/5/17.
  */
class Exercise2_1 {


  def removeDuplicates(nodeValues: Int*): Option[Node] = {
    val headNode = Option(Node(nodeValues))
    var n = headNode
    var previous: Option[Node] = None
    val hashSet = new mutable.HashSet[Int]()

    while(n.isDefined) {
      if(hashSet.contains(n.get.data))
        previous.get.next = n.get.next
      else {
        hashSet.add(n.get.data)
        previous = n
      }

      n = n.get.next

    }

    println(hashSet)
    headNode

  }

}
