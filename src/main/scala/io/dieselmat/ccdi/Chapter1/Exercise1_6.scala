package io.dieselmat.ccdi.Chapter1

import scala.annotation.tailrec

/**
  * TODO needs work
  * Created by spencermateo on 14/5/17.
  */
class Exercise1_6 {


  def compress(str: String): String = {

    def recur(acc: StringBuilder, charArray:Array[Char], currentChar: Char, number: Int): String = {
      charArray match {
        case Array(x, _*) if x == currentChar => recur(acc, charArray.tail, currentChar, number +1)
        case Array(x, _*) if x != currentChar => {
            acc.append(s"$currentChar$number")
            recur(acc, charArray.tail, x, 1)
          }
        case Array(x) if x == currentChar => {
          acc.append(s"$currentChar${number + 1}")
          recur(acc, charArray.tail, currentChar, 1)
        }
        case Array(x) if x != currentChar => {
          acc.append(s"$currentChar$number")
          acc.append(s"$x" + "1")
          recur(acc, charArray.tail, x, 1)
        }
        case Array() => {
          acc.append(s"$currentChar$number")
          acc.toString()
        }
      }
    }

    recur(new StringBuilder, str.toCharArray.tail, str.head, 1)

  }
}
