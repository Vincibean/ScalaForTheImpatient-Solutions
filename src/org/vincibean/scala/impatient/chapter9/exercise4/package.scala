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

package org.vincibean.scala.impatient.chapter9

import scala.io.Source

/**
  * Write a Scala program that reads a text file containing only floating-point
  * numbers. Print the sum, average, maximum, and minimum of the numbers
  * in the file.
  *
  * Created by Vincibean on 25/01/16.
  */
package object exercise4 extends App {

  val source = Source.fromFile("resources/chapter9/exercise4/floatNumbers.txt")
  val floatNumbers = source.mkString.split("\n").map(_.toDouble)
  val sum = floatNumbers.sum
  println(s"The sum is: $sum")
  println(s"The average is: ${sum / floatNumbers.length}")
  println(s"The maximum is: ${floatNumbers.max}")
  println(s"The minimum is: ${floatNumbers.min}")
  source.close()

}
