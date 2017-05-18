package io.dieselmat.ccdi.Chapter2

/**
  * Created by spencermateo on 17/5/17.
  */
class Exercise2_3 {


  def deleteTheMiddle(nodeValues: Int*): Node = {

    val headNode = Node(nodeValues)
    var middleNode = Option(headNode)
    var middle = nodeValues.size / 2 - 1
    for(i <- 0 to middle if middleNode.isDefined) {
      middleNode match {
        case Some(m) => middleNode = m.next

      }
    }

    while(middleNode.isDefined) {
      val m = middleNode.get
      val n = m.next
      n match {
        case Some(innerNode) =>
          m.data = innerNode.data
          m.next = innerNode.next
          middleNode = m.next
        case None =>
          m.next = None
          middleNode = None
      }
    }

    headNode
  }

}
