package io.spencermateo.ccdi.Chapter1

import org.scalatest.{FlatSpec, FunSuite}

/**
  * Created by spencermateo on 13/5/17.
  */
class Exercise1_1_Test extends FlatSpec {

  val exercise1_1 = new Exercise1_1

  """The word "something"""" should "unique" in {
    assert(exercise1_1.isUnique("abcd"))
  }

  """The word "hello"""" should "not be unique" in {
    assert(!exercise1_1.isUnique("hello"))
  }

}
