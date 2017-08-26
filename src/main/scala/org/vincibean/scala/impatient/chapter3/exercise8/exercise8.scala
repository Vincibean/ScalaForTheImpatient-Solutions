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
  * Suppose you are given an array buffer of integers and want to remove all but
  * the first negative number. Here is a sequential solution that sets a flag
  * when the first negative number is called, then removes all elements beyond.
  *
  *   var first = true
  *   var n = a.length
  *   var i=0
  *   while (i < n){
  *     if (a(i) >= 0) i += 1
  *     else {
  *       if (first) { first = false; i += 1 }
  *       else { a.remove(i); n -= 1 }
  *     }
  *   }
  *
  * This is a complex and inefficient solution. Rewrite it in Scala by collecting
  * positions of the negative elements, dropping the first element, reversing the
  * sequence, and calling a.remove(i) for each index.
  */
package object exercise8 {

  def newDropping(a: ArrayBuffer[Int]): Unit = {
    // First, let’s use a for / yield loop to find all matching index values.
    val indices = (for (i <- a.indices if a(i) < 0) yield i).drop(1)
    // Then we visit the indices in reverse.
    for (j <- indices.indices.reverse) a.remove(indices(j))
  }

}
