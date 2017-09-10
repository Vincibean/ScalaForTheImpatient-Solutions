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
  * Extend the tree in the preceding exercise so that each nonleaf node stores an
  * operator in addition to the child nodes. Then write a function eval that
  * computes the value. For example, the tree
  *
  *     +
  *    / | \
  *   *  2  -
  *  / \    |
  *  3 8    5
  *
  * has value (3 × 8) + 2 + (–5) = 21.
  * Pay attention to the unary minus.
  */
package object exercise8 {

  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(op: Operation, left: Tree, others: Tree*) extends Tree

  sealed trait Operation
  object Addition extends Operation
  object Subtraction extends Operation
  object Multiplication extends Operation

  def eval(tree: Tree): Int = tree match {
    case Leaf(i) => i
    case Node(Addition, l, r @ _*) => (l +: r).map(eval).sum
    case Node(Subtraction, l, r @ _*) => (l +: r).foldRight(0)((el, acc) => acc - eval(el))
    case Node(Multiplication, l, r @ _*) => (l +: r).foldRight(1)((el, acc) => acc * eval(el))
  }

}
