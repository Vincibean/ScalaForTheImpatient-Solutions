/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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
  * Improve the solution of the preceding exercise by collecting the positions
  * that should be moved and their target positions. Make those moves and
  * truncate the buffer. Don’t copy any elements before the first unwanted
  * element.
  */
package object exercise9 {

  def newDropping(a: ArrayBuffer[Int]): Unit = {
    val positionsToMoveNeg = for (i <- a.indices if a(i) < 0) yield i
    val positionsToMove = a.indices.diff(positionsToMoveNeg.drop(1))
    for (j <- positionsToMove.indices) a(j) = a(positionsToMove(j))
    a.trimEnd(a.length - positionsToMove.length)
  }

}
