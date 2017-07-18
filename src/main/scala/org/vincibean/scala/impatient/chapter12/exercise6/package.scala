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

import scala.collection.immutable.Seq

/**
  * Modify the previous function to return the input at which the output is largest.
  * For example, largestAt(x => 10 * x - x * x, 1 to 10) should return 5. Don't use
  * a loop or recursion.
  */
package object exercise6 {

  def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = if (inputs.isEmpty) {
    -1
  } else {
    inputs.map(x => x -> fun(x)).maxBy(_._2)._1
  }

}
