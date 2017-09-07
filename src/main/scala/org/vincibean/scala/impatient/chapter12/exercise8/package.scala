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
  * In Section 12.8, "Currying", on page 164, you saw the `corresponds` method used
  * with two arrays of strings. Make a call to `corresponds` that checks whether the
  * elements in an array of strings have the lengths given in an array of integers.
  */
package object exercise8 {

  def hasLengths(ss: Array[String], is: Array[Int]): Boolean = is.corresponds(ss)((i, s) => i == s.length)

}
