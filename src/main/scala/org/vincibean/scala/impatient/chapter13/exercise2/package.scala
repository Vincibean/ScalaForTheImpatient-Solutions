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

import scala.collection.immutable.SortedSet

/**
  * Repeat the preceding exercise, using an immutable map of characters to lists.
  */
package object exercise2 {

  def indexes(s: String): Map[Char, SortedSet[Int]] =
    s.zipWithIndex.foldRight(Map.empty[Char, SortedSet[Int]]) { case ((el, index), acc) =>
      acc + (el -> (acc.getOrElse(el, SortedSet.empty[Int]) + index))
    }

}
