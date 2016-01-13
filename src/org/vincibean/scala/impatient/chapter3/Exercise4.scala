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

/**
  * Given an array of integers, produce a new array that contains all positive
  * values of the original array, in their original order, followed by all values that
  * are zero or negative, in their original order.
  *
  * Created by Vincibean on 12/01/16.
  */
object Exercise4 extends App {

  val initialArray = Array(1, 2, 0, -4, 3, -98, 12, 0, -3)
  println(s"Initial Array: ${initialArray.mkString(", ")}")
  println(s"Rearranged Array: ${rearrangePositivesAndNegatives(initialArray).mkString(", ")}")

  def rearrangePositivesAndNegatives(inputArray: Array[Int]): Array[Int] = inputArray.filter(_ > 0) ++  inputArray.filter(_ <= 0)

}
