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
  * Write a function largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest
  * value of a function within a given sequence of inputs. For example,
  * largest(x => 10 * x - x * x, 1 to 10) should return 25. Don't use a loop or
  * recursion
  */
package object exercise5 {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int =
    // Our getMax method from exercise2 already deals with the fact that the input Seq might be empty.
    exercise2.getMax(inputs.map(fun).toArray)

}
