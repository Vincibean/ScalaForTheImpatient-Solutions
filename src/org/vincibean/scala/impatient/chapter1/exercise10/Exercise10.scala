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

/**
  * What do the take, drop, takeRight, and dropRight string functions do?
  *
  * What advantage or disadvantage do they have over using substring ?
  *
  * Created by Vincibean on 11/01/16.
  */
package object exercise10 extends App {

  val inputString = "My Input String"
  println("Using String: " + inputString)
  println()

  println("Using 'take(2)': " + inputString.take(2))
  println("Takes the first 2 characters of the String.")
  println()

  println("Using 'drop(3)': " + inputString.drop(3))
  println("Drops the first 3 characters and returns the rest of the String.")
  println()

  println("Using 'takeRight(3)': " + inputString.takeRight(3))
  println("Starting from the right (i.e. the end of the String), takes the first 3 characters of the String. " +
    "In other words, this method takes the last 3 characters of the String.")
  println()

  println("Using 'dropRight(3)': " + inputString.dropRight(3))
  println("Starting from the right (i.e. the end of the String), drops the first 3 characters of the String. " +
    "In other words, this method drops the last 3 characters of the String.")

}
