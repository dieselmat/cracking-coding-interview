package io.spencermateo.ccdi.Chapter1

import org.scalatest.FlatSpec

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_4_Test extends FlatSpec {

  val exercise = new Exercise1_4

  """The word "tact coa"""" should "be a permutaion palindrome" in {
    assert(exercise.isPermutationOfPalindrome("tact coa"))

    assert(exercise.isPermutationOfPalindrome("hanah"))

    assert(!exercise.isPermutationOfPalindrome("hanahz"))
  }


}
