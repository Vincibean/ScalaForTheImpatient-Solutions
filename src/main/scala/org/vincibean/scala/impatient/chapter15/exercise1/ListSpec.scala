package org.vincibean.scala.impatient.chapter15.exercise1

import java.util.NoSuchElementException

import org.junit.Test
import org.junit.Assert._

class ListSpec {

  val ints = List(1, 2, 3, 4)

  @Test()
  def verify(): Unit = assertEquals(10, ints.sum)

  @Test(expected = classOf[NoSuchElementException])
  def verify2(): Unit = List.empty[Int].head

  @Test(timeout = 42L)
  def verify3(): Unit = assertEquals(24, ints.product)

  @Test(expected = classOf[NullPointerException], timeout = 24L)
  def verify4(): Unit = {
    val x: String = null
    x.charAt(3)
  }

}
