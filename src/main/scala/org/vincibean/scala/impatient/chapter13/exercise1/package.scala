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

import scala.collection.mutable

/**
  * Write a function that, given a string, produces a map of the indexes of all
  * characters. For example, indexes("Mississippi") should return a map associating
  * 'M' with the set {0}, 'i' with the set {1, 4, 7, 10}, and so on. Use a mutable map
  * of characters to mutable sets. How can you ensure that the set is sorted?
  */
package object exercise1 {

  def indexes(s: String): mutable.Map[Char, mutable.SortedSet[Int]] =
    s.zipWithIndex.foldRight(mutable.Map.empty[Char, mutable.SortedSet[Int]]) { case ((el, index), acc) =>
      acc += (el -> (acc.getOrElse(el, mutable.SortedSet.empty[Int]) += index))
    }

}
