package io.dieselmat.ccdi.Chapter1

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_5_Test extends FlatSpec {

  val exercise = new Exercise1_5

  """The words"""" should "be isOneWay" in {
    assert(exercise.isOneway("pale", "ple"))

    assert(exercise.isOneway("pales", "pale"))

    assert(exercise.isOneway("pale", "bale"))

    assert(!exercise.isOneway("pale", "bake"))
  }


}
