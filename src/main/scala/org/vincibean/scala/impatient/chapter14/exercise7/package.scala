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
  * Extend the tree in the preceding exercise so that each node can have an
  * arbitrary number of children, and reimplement the leafSum function. The tree
  * in exercise 5 should be expressible as
  *
  * Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
  */
package object exercise7 {

  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(left: Tree, others: Tree*) extends Tree

  def leafSum(tree: Tree): Int = tree match {
    case Leaf(i) => i
    case Node(l, r @ _*) => leafSum(l) + r.map(leafSum).sum
  }

}
