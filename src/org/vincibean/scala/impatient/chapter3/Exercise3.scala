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
  * Repeat the preceding assignment, but produce a new array with the swapped values.
  * Use for / yield.
  *
  * Created by Vincibean on 12/01/16.
  */
object Exercise3 extends App {

  val initialArray = Array(1, 2, 3, 4, 5)
  println(s"Starting with Array${initialArray.mkString("(", ", ", ")")}")
  println("Swapping the Array!")
  val array2ndPhase = swappedArrayOf(initialArray)
  println(s"Array now is: Array${array2ndPhase.mkString("(", ", ", ")")}")
  println("Swapping again!")
  val array3rdPhase = swapBySlicingArrayOf(array2ndPhase)
  println(s"Array now is: Array${array3rdPhase.mkString("(", ", ", ")")}")

  val anotherArray = Array(9, 8, 7, 6)
  println(s"Starting with Array${anotherArray.mkString("(", ", ", ")")}")
  println("Swapping the Array!")
  val anotherArray2ndPhase = swappedArrayOf(anotherArray)
  println(s"Array now is: Array${anotherArray2ndPhase.mkString("(", ", ", ")")}")
  println("Swapping again!")
  val anotherArray3rdPhase = swapBySlicingArrayOf(anotherArray2ndPhase)
  println(s"Array now is: Array${anotherArray3rdPhase.mkString("(", ", ", ")")}")


  def swappedArrayOf(inputArray: Array[Int]): Array[Int] = {
    val swappedVector = for {
      i <- 1.until(inputArray.length, 2)
      j <- i.to(i - 1 , -1)
    } yield inputArray(j)

    if(inputArray.length % 2 != 0){
      (swappedVector.toBuffer += inputArray.last).toArray
    } else {
      swappedVector.toArray
    }
  }

  // Another, more elegant solution that was suggested
  def swapBySlicingArrayOf(inputArray: Array[Int]): Array[Int] = {
    val res = for{
      i <- inputArray.grouped(2)
    } yield {
      i.reverse
    }
    res.flatten.toArray
  }

  // Yet another, more elegant approach; since here there's no loop, this can't be considered a solution to
  // the exercise; yet, it might be useful in order to understand how concise Scala can be.
  def functionalSwappedArray(inputArray: Array[Int]): Array[Int] = {
    inputArray.grouped(2).map(_.reverse).flatten.toArray
  }

}
