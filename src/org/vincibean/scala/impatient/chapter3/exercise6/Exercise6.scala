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

import scala.collection.mutable

/**
  * How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
  * How do you do the same with an ArrayBuffer[Int]?
  *
  * Created by Vincibean on 12/01/16.
  */
package object exercise6 extends App {

  val initialArray = Array(1.0, 2.0, -12.0)
  println(s"Initial Array: ${initialArray.mkString(", ")}")
  println(s"Reverse Sorted Order: ${initialArray.sortWith( _ > _).mkString(", ")}")
  println()
  val initialArrayBuffer = mutable.Buffer(1, -10, 3, 4, 8, 2, 5)
  println(s"Initial Array: ${initialArrayBuffer.mkString(", ")}")
  println(s"Reverse Sorted Order: ${initialArrayBuffer.sortWith( _ > _)}")



}
