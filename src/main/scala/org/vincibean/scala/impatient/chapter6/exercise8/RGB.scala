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

package org.vincibean.scala.impatient.chapter6.exercise8

/**
  * Write an enumeration describing the eight corners of the RGB color cube. As
  * IDs, use the color values (for example, 0xff0000 for Red ).
  *
  * Created by Vincibean on 20/01/16.
  */
object RGB extends Enumeration {

  type RGB = Value

  val Red = Value(0xff0000, "Red")
  val Green = Value(0x00ff00, "Green")
  val Blue = Value(0x0000ff, "Blue")
  val RedGreen = Value(0xffff00, "Red - Green")
  val RedBlue = Value(0xff00ff, "Red - Blue")
  val GreenBlue = Value(0x00ffff, "Green - Blue")
  val Black = Value(0x000000, "Black")
  val White = Value(0xffffff, "White")

}
