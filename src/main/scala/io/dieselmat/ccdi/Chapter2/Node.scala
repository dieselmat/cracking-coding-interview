package io.dieselmat.ccdi.Chapter2

import scala.annotation.tailrec

/**
  * Created by spencermateo on 15/5/17.
  */
class Node(var data: Int) {


  var next: Option[Node] = None

  def appendToTail(d: Int): Unit =
    Node.getTail(this).next = Option(new Node(d))

  def remove(d: Int): Node = {

    if(data == d && next.isDefined) {
      Node.removeAll(next.get, d)
      next.get
    } else {
      Node.removeAll(this, d)
      this
    }
  }

  override def toString: String = {
    var currentNext = Option(this)
    val str = new StringBuilder
    str.append("Node(")
    while(currentNext.isDefined) {
      str.append(currentNext.get.data + ",")
      currentNext = currentNext.get.next
    }

    str.setLength(str.length -1)
    str.append(")").toString()
  }

}


object Node  {

  @tailrec
  def getTail(n: Node): Node = n.next match {
    case Some(next) => getTail(next)
    case None => n
  }


  @tailrec
  def nextEqual(n: Node, data: Int): Option[Node] = n.next match {
    case Some(next) =>
      if (next.data == data) Option(next)
      else nextEqual(next, data)
    case None => None
  }

  @tailrec
  def nodeWithNextEqual(n: Node, data: Int): Option[Node] = n.next match {
    case Some(next) =>
      if (next.data == data) Option(n)
      else nodeWithNextEqual(next, data)
    case None => None
  }

  def nextOfNext(n: Node): Option[Node] = n.next match {
    case Some(nextOuter) => nextOuter.next match {
      case nextInner: Some[Node] => nextInner
      case _ => None

    }
    case None => None
  }

  def removeNext(n: Node): Node = {
    n.next match {
      case Some(itsNext) => n.next = itsNext.next
      case None => n.next = None
    }
    n
  }


  @tailrec
  def removeAll(n: Node, d: Int): Node = n.next match {
    case Some(nInner) =>
      if (nInner.data == d) {
        n.next = Node.nextOfNext(n)
        removeAll(n, d)
      } else {
        removeAll(nInner, d)
      }
    case None => n
  }

  //def apply(ds: Int) = new Node(ds)

  def apply(ds: Seq[Int]) : Node = {
    val headNode: Node = new Node(ds.head)
    var currentNode = Option(headNode)
    for(data <- ds.tail ){
      currentNode.get.next = Option(new Node(data))
      currentNode = currentNode.get.next
    }
    headNode
  }

}
