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

/**
  * One can use lists to model trees that store values only in the leaves. For
  * example, the list ((3 8) 2 (5)) describes the tree
  *
  *       *
  *     / \  \
  *    *  2  *
  *   / \    |
  *   3 8    5
  *
  * However, some of the list elements are numbers and others are lists. In Scala,
  * you cannot have heterogeneous lists, so you have to use a List[Any]. Write a
  * leafSum function to compute the sum of all elements in the leaves, using pattern
  * matching to differentiate between numbers and lists.
  */
package object exercise5 {

  def leafSum(ll: List[Any]): Int = ll match {
    case Nil => 0
    case (h: Int) :: t => h + leafSum(t)
    case (h: List[Any]) :: t => leafSum(h) + leafSum(t)
    case _ => 0
  }

}
