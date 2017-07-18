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

package org.vincibean.scala.impatient.chapter8.exercise7

import java.awt.Rectangle

/**
  * Provide a class Square that extends java.awt.Rectangle and has three constructors:
  * one that constructs a square with a given corner point and width, one that
  * constructs a square with corner (0, 0) and a given width, and one that constructs
  * a square with corner (0, 0) and width 0.
  *
  * Created by Vincibean on 24/01/16.
  */
class Square(cornerX: Int, cornerY: Int, size: Int) extends Rectangle(cornerX, cornerY, size, size) {
  // A possible solution would have been to provide default values in the primary constructor (i.e.
  // Square(val cornerX: Int = 0, val cornerY: Int = 0, val width: Int = 0)) but this would have allowed other
  // constructor options that aren't allowed from the exercise (e.g. new Square(cornerX = 10, width = 3))

  def this(width: Int) = this(0, 0, width)

  def this() = this(0)

}
