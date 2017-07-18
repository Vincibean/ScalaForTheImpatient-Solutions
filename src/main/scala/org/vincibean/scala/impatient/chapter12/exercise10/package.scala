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

package org.vincibean.scala.impatient.chapter12

/**
  * Implement an `unless` control abstraction that works just like `if`, but with an
  * inverted condition. Does the first parameter need to be a call-by-name
  * parameter? Do you need currying?
  */
package object exercise10 {

  // We take for granted that the block should return Unit and no `else` block should be provided.
  // In other words, we take for granted that `unless` should be a statement and not an expression.
  def unless(condition: => Boolean)(block: => Unit): Unit = if (!condition) block

}
