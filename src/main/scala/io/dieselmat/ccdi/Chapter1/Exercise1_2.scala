package io.dieselmat.ccdi.Chapter1

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_2 {


  def isPermutation(str1: String, str2: String): Boolean = {
    if(str1.length != str2.length) false
    else {
      mapCharacters(str1) sameElements mapCharacters(str2)
    }
  }

  def mapCharacters(str: String): Array[Int] = {
    str.foldLeft(new Array[Int](128)) { (arr, c) =>
      val count = arr(c)
      arr(c) = count + 1
      arr
    }
  }

}
