package io.dieselmat.ccdi.Chapter1

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_1 {


  // assuming its an ascii string
  def isUnique(str: String): Boolean = {
    val arryOfBoolean = new Array[Boolean](128)

    val (isNotUnique,_) = str.foldLeft((true, arryOfBoolean)) { (b, c) =>
      if (!b._1)
        b
      else if (b._2(c))
        (false,b._2)
      else {
        b._2(c) = true
        (b._1, b._2)
      }
    }

    isNotUnique
  }

}
