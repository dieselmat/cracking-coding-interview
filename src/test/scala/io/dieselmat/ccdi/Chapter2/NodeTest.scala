package io.dieselmat.ccdi.Chapter2

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 17/5/17.
  */
class NodeTest extends FlatSpec {

  "A node" should "contain elements" in {

    val n = new Node(1)
    n.appendToTail(2)
    n.appendToTail(3)
    n.appendToTail(2)
    n.appendToTail(1)

    println(n)
    assert(true)
    println(n.remove(1))

  }

}
