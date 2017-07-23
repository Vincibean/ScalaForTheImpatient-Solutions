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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter14

import scala.reflect.ClassTag

/**
  * Using pattern matching, write a function swap that swaps the first two elements
  * of an array provided its length is at least two.
  */
package object exercise3 {

  // While the ClassTag thingy is a bit odd here, it guarantees that it all compiles.
  // In particular, it is used for dealing with Java's erasure.
  // Moreover, in the first two cases we deal with the possibility that the Array's length
  // is less than 2 (even though we weren't required to).
  def swap[T : ClassTag](xs: Array[T]): Array[T] = xs match {
    case ts if ts.isEmpty => ts
    case Array(x) => Array[T](x)
    case Array(a, b, tail @ _*) => Array.apply[T](b, a) ++ tail
  }

}
