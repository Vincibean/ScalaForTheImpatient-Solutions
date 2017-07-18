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
  * It’s easy to get a sequence of pairs, for example
  *
  *   val pairs = (1 to 10) zip (11 to 20)
  *
  * Now suppose you want to do something with such a sequence — say, add up
  * the values. But you can’t do
  *
  *   pairs.map(_ + _)
  *
  * The function _ + _ takes two Int parameters, not an (Int, Int) pair. Write a
  * function adjustToPair that receives a function of type (Int, Int) => Int and
  * returns the equivalent function that operates on a pair. For example,
  * adjustToPair(_ * _)((6, 7)) is 42.
  * Then use this function in conjunction with map to compute the sums of the
  * elements in pairs.
  */
package object exercise7 {

  def adjustToPair(f: (Int, Int) => Int)(t: (Int, Int)): Int = f.tupled(t)

}
