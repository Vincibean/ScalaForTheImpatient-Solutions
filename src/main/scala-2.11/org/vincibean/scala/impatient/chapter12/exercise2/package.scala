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

package org.vincibean.scala.impatient.chapter12

/**
  * How do you get the largest element of an array with reduceLeft?
  */
package object exercise2 {

  def getMax(is: Array[Int]): Int = if (is.isEmpty) {
    // reduceLeft will throw an Exception if the input Array is empty; let's provide a default
    Int.MinValue
  } else {
    is.reduceLeft((acc, i) => if (i > acc) i else acc)
  }

}
