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

import scala.collection.mutable.ArrayBuffer

/**
  * Write a loop that swaps adjacent elements of an array of integers.
  * For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
  *
  * Created by Vincibean on 12/01/16.
  */
object Exercise2 extends App {

  val initialArray = ArrayBuffer(1, 2, 3, 4, 5)
  println(s"Starting with Array${initialArray.mkString("(", ", ", ")")}")
  println("Swapping the Array!")
  swapArray(initialArray)
  println(s"Array now is: Array${initialArray.mkString("(", ", ", ")")}")
  println("Swapping again!")
  swapArray(initialArray)
  println(s"Array now is: Array${initialArray.mkString("(", ", ", ")")}")
  val anotherArray = ArrayBuffer(9, 8, 7, 6)
  println(s"Using another array: Array${anotherArray.mkString("(", ", ", ")")}")
  println("Swapping the Array!")
  swapArray(anotherArray)
  println(s"Array now is: Array${anotherArray.mkString("(", ", ", ")")}")
  println("Swapping again!")
  swapArray(anotherArray)
  println(s"Array now is: Array${anotherArray.mkString("(", ", ", ")")}")

  // Using a mutable Array and creating a side effect!
  def swapArray(inputArray: ArrayBuffer[Int]): Unit ={
    for {i <- 0.until(inputArray.length, 2)
         j = i + 1 if j < inputArray.length} {
      val a = inputArray(i)
      val b = inputArray(j)
      inputArray(i) = b
      inputArray(j) = a
    }
  }


}
