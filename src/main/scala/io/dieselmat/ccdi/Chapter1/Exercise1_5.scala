package io.dieselmat.ccdi.Chapter1

import scala.annotation.tailrec

/**
  * TODO needs work
  * Created by spencermateo on 14/5/17.
  */
class Exercise1_5 {


  def isOneway(str1: String, str2: String): Boolean = {
    val Array(long, short) = longShort(str1, str2)
    if(long.length - short.length >= 2) return false
    else {
      val countOfChange = check(long.toCharArray, 0, short.toCharArray, 0, 0)
      println(countOfChange)
      if(countOfChange < 2) true else false
    }
  }

  private def longShort(str: String, str2: String): Array[String] = {
    if(str.length > str2.length) Array(str, str2)
    else Array(str2, str)
  }

  @tailrec
  private def check(longer: Array[Char], indexOfLonger: Int, shorter: Array[Char], indexOfShorter: Int, acc: Int): Int = {
    if(indexOfLonger >= longer.length || indexOfShorter >= shorter.length)
      acc
    else if(longer(indexOfLonger) == shorter(indexOfShorter))
      check(longer, indexOfLonger+1, shorter, indexOfShorter+1, acc)
    else if(longer(indexOfLonger+1) == shorter(indexOfShorter))
      check(longer, indexOfLonger+1, shorter, indexOfShorter, acc+1)
    else if(longer(indexOfLonger) != shorter(indexOfShorter))
      check(longer, indexOfLonger+1, shorter, indexOfShorter+1, acc+1)
    else
      acc
  }


}
