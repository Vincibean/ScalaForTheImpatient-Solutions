/*
 * Copyright (C) 2016  Vincibean <Andre Bessi>
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

package org.vincibean.scala.impatient.chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on
  * page 34 using the drop method for dropping the index of the first match. Look
  * the method up in Scaladoc.
  *
  * The example is:
  * Given a sequence of integers, we want to remove all but the first negative number.
  * First, let’s use a for / yield loop to find all matching index values.
  *   val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
  * Then we visit the indexes in reverse, except for indexes(0).
  *   for (j <- (1 until indexes.length).reverse) a.remove(indexes(j))
  *
  * Created by Vincibean on 12/01/16.
  */
package object exercise8 {

  def newDropping(a: ArrayBuffer[Int]): Unit = {
    // First, let’s use a for / yield loop to find all matching index values.
    val indices = (for (i <- a.indices if a(i) < 0) yield i).drop(1)
    // Then we visit the indices in reverse.
    for (j <- indices.indices.reverse) a.remove(indices(j))
  }

}
