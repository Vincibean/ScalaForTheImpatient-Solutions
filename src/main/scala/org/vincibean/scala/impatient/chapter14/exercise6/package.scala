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
  * A better way of modeling such trees is with case classes. Let’s start with binary
  * trees.
  *
  *   sealed abstract class BinaryTree
  *   case class Leaf(value: Int) extends BinaryTree
  *   case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
  *
  * Write a function to compute the sum of all elements in the leaves.
  */
package object exercise6 {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

  def leafSum(tree: BinaryTree): Int = tree match {
    case Leaf(i) => i
    case Node(l, r) => leafSum(l) + leafSum(r)
  }

}
