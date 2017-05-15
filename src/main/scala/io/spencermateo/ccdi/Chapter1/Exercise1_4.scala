package io.spencermateo.ccdi.Chapter1

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_4 {


  def isPermutationOfPalindrome(str: String): Boolean = {

    val letterCount = str.foldLeft(new Array[Int](128)) { (acc, c)  =>
      if(c != ' ' )
        acc(c) = acc(c) + 1
      acc
    }

    if(letterCount.sum % 2 == 0)
      letterCount.count(_ % 2 == 0) == 0
    else
      letterCount.count(_ % 2 != 0) <= 1
  }
}
