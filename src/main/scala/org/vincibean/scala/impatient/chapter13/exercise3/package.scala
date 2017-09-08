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

import scala.collection.mutable.ListBuffer

/**
  * Write a function that removes every second element from a ListBuffer. Try it
  * two ways. Call remove(i) for all even i starting at the end of the list. Copy every
  * second element to a new list. Compare the performance.
  */
package object exercise3 {

  def remove2ndElementWithRemove[A](as: ListBuffer[A]): Unit = {
    as.indices.filter(_ % 2 == 0).reverse.foreach(as.remove)
  }

  def remove2ndElementWithCopy[A](as: ListBuffer[A]): ListBuffer[A] = {
    as.zipWithIndex.filter(_._2 % 2 != 0).map(_._1) // equivalent to a copy
  }

}
