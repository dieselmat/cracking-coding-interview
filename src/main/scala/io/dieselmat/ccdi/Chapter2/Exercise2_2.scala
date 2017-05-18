package io.dieselmat.ccdi.Chapter2

import scala.collection.mutable

/**
  * Created by spencermateo on 17/5/17.
  */
class Exercise2_2 {


  def findKthToTheLast(kth: Int, nodeValues: Int*): Int = {

    var i = 0
    var nextNode = Option(Node(nodeValues))
    var retNode = nextNode


    while(nextNode.isDefined) {

      if(kth > i) {
        i = i + 1
      } else if(kth <= i) {
        retNode = retNode.get.next
      }
      nextNode = nextNode.get.next


    }

    retNode match {
      case Some(n) => n.data
      case None => 0
    }

  }

}
