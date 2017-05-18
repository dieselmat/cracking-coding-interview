package io.dieselmat.ccdi.Chapter1

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_3_Test extends FlatSpec {

  val exercise = new Exercise1_3

  """The word "Mr John Smith      """" should "be a Mr%20John%20Smith" in {
    println(exercise.urlify("Mr John Smith      ", 13))
    assert(exercise.urlify("Mr John Smith      ", 13) == "Mr%20John%20Smith")
  }


}
