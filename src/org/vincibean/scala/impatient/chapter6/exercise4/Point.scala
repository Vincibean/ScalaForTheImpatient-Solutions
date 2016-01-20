/*
 * Copyright (C) 2016  Vincibean <Andre Bessi>
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

package org.vincibean.scala.impatient.chapter6.exercise4

/**
  * Define a Point class with a companion object so that you can construct Point
  * instances as Point(3, 4), without using new.
  *
  * Created by Vincibean on 20/01/16.
  */
object Point {

  def apply(x: Int, y: Int): Point = new Point(x, y)

}
// A better solution would be using a case class, but apparently this exercise doesn't require this.
class Point private(val x: Int, val y: Int) {

  // Just for test sake.
  override def toString: String = s"Point [$x, $y]"

}
