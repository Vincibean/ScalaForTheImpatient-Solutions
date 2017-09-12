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

package org.vincibean.scala.impatient.chapter15.exercise7

import scala.annotation.tailrec

/**
  * Give an example to show that the tail recursion optimization is not valid
  * when a method can be overridden.
  */
class Tailrec {

  @tailrec
  final def tailrecSum(xs: Seq[Int], partial: BigInt): BigInt =
    if (xs.isEmpty) partial else tailrecSum(xs.tail, xs.head + partial)

  def sum(xs: Seq[Int], partial: BigInt): BigInt =
    if (xs.isEmpty) partial else sum(xs.tail, xs.head + partial)

}
