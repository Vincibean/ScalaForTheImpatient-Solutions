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

package org.vincibean.scala.impatient.chapter1

import scala.math.BigInt._
import scala.util.Random

/**
  * How do you get the first character of a string in Scala? The last character?
  *
  * Created by Vincibean on 11/01/16.
  */
package object exercise9 extends App {

  // Taking the solution of the previous exercise in order to have a randomly generated String.
  val inputString = probablePrime(100, Random).toString(radix = 36)
  println("Taking as input the String " + inputString)
  println("Its first character is: " + inputString.head)
  println("Its last character is: " + inputString.last)

}
