/*
 * Copyright (C) 2016  Vincibean <Andre Bessi>
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
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter3

import scala.io.StdIn
import scala.util.Random

/**
  * Write a code snippet that sets 'a' to an array of n random integers between 0
  * (inclusive) and n (exclusive).
  *
  * Created by Vincibean on 12/01/16.
  */
package object exercise1 extends App {

  print("Choose any integer value > 0: ")
  val chosenNumber = StdIn.readInt()
  // TODO Check that the chosen number is a positive integer.
  val a = nRandomIntegers(chosenNumber)
  println(s"And today's random numbers are: ${a.mkString(", ")}")

  def nRandomIntegers(n: Int): Array[Int] =
    (0 until n)
      .map(_ => Random.nextInt(n))
      .toArray


}
