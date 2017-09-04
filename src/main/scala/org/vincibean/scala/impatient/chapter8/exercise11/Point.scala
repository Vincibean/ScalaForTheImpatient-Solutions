/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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

package org.vincibean.scala.impatient.chapter8.exercise11

/**
  * Define a value class Point that packs integer x and y coordinates into a Long
  * (which you should make private).
  */
object Point {

  // Following the formula defined in: https://stackoverflow.com/a/12772968
  def apply(x: Int, y: Int): Point = new Point((x.toLong << 32) | (y & 0xffffffffL))

}

// The private constructor prevents third party code to create a new Point: only the companion object can.
class Point private (private val xy: Long) extends AnyVal {

  def x: Int = (xy >> 32).toInt

  def y: Int = xy.toInt

}
