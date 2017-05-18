package io.dieselmat.ccdi.Chapter1

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_3 {


  def urlify(str: String, len: Int): String =  {
    val charArray = (for(i  <- 0 until len) yield str.charAt(i)).toArray
    val totalLength = len + countSpaces(str) * 2

    val retArray = new Array[Char](totalLength)
    val retVal = charArray.foldRight((retArray, totalLength - 1)) { (c, t) =>
      if (c == ' ') {
        t._1(t._2) = '0'
        t._1(t._2 - 1) = '2'
        t._1(t._2 - 2) = '%'
        (t._1, t._2 - 3)
      }
      else {
        t._1(t._2) = c
        (t._1, t._2 - 1)
      }
    }

    retVal._1.mkString
  }


  def countSpaces(str: String): Int =
    str.trim.foldLeft(0) { case(i, c) =>
      if(c == ' ') i + 1
      else i
  }


}
