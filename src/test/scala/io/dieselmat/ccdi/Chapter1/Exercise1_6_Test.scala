package io.dieselmat.ccdi.Chapter1

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_6_Test extends FlatSpec {

  val exercise = new Exercise1_6

  """The words"""" should "compressed" in {
    assert(exercise.compress("aabccccaaa") == "a2b1c4a3")

  }


}
