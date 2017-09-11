/*
 * Copyright (C) 2017  Vincibean <Andrea Bessi>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter15.exercise1

import java.util.NoSuchElementException

import org.junit.Test
import org.junit.Assert._

/**
  * Write four JUnit test cases that use the @Test annotation with and without each
  * of its arguments. Run the tests with JUnit.
  */
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
