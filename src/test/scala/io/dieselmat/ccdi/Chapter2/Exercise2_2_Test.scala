package io.dieselmat.ccdi.Chapter2

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 17/5/17.
  */
class Exercise2_2_Test extends FlatSpec {

  "A node" should "should remove " in {

    val exercise2_1 = new Exercise2_2

    val retVal = exercise2_1.findKthToTheLast(1,1,2,3,4,5)
    println(retVal)
  }

}
