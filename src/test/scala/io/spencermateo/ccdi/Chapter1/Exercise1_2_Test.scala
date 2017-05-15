package io.spencermateo.ccdi.Chapter1

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_2_Test extends FlatSpec {

  val exercise = new Exercise1_2

  """The word "hello"""" should "be a permutation of elloh" in {
    assert(exercise.isPermutation("hello", "olleh"))
  }

  """The word "hello"""" should "not be a permutation of world" in {
    assert(!exercise.isPermutation("hello", "world"))
  }

}
