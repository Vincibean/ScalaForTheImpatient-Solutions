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
  * Write a function that turns an array of Double values into a two-
  * dimensional array. Pass the number of columns as a parameter. For example,
  * with Array(1, 2, 3, 4, 5, 6) and three columns, return Array(Array(1, 2, 3),
  * Array(4, 5, 6)). Use the grouped method.
  */
package object exercise8 {

  def nDimArray(is: Array[Int], cols: Int): Array[Array[Int]] = if (is.isEmpty && cols <= 0) {
    Array.empty[Array[Int]]
  } else {
    is.grouped(cols).toArray
  }

}
