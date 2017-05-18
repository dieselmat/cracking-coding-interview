package io.dieselmat.ccdi.Chapter2

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 17/5/17.
  */
class Exercise2_1_Test extends FlatSpec {

  "A node" should "should remove " in {

    val exercise2_1 = new Exercise2_1

    exercise2_1.removeDuplicates(1,3,2,3,4,1) match {
      case Some(n) => println(n)
      case None => println("nothing")
    }

  }

}
