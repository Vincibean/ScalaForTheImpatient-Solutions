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
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter13

/**
  * Write a function that receives a collection of strings and a map from strings
  * to integers. Return a collection of integers that are values of the map
  * corresponding to one of the strings in the collection. For example, given
  * Array("Tom", "Fred", "Harry") and Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5),
  * return Array(3, 5). Hint: Use flatMap to combine the Option values returned by get.
  */
package object exercise4 {

  def findCorrespondence(ss: Iterable[String], sis: Map[String, Int]): Iterable[Int] = ss.flatMap(sis.get)

}
