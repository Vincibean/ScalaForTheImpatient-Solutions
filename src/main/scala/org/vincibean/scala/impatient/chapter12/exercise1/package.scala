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
  * Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a
  * collection of function inputs and outputs in a given range. For example,
  * values(x => x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16),
  * (-3, 9), ..., (5, 25).
  *
  * Created by Vincibean on 18/07/16.
  */
package object exercise1 {

  def values(fun: (Int) => Int, low: Int, high: Int): Seq[(Int, Int)] = (low to high).map(x => x -> fun(x))

}
