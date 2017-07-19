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
  * Implement a function that works just like mkString, using reduceLeft.
  */
package object exercise5 {

  def myMkString(as: Iterable[String], start: String = "", sep: String = "", end: String = ""): String = {
    val res = if (as.isEmpty) {
      ""
    } else {
      as.reduceLeft((acc, el) => acc + sep + el)
    }
    start + res + end
  }

}
