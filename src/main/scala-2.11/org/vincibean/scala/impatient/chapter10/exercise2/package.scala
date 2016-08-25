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

package org.vincibean.scala.impatient.chapter10

/**
  * Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point.
  * Use lexicographic ordering, i.e. (x, y) < (x', y') if x < x' or x = x' and y < y'.
  *
  * Created by Vincibean on 04/02/16.
  */
package object exercise2 extends App {

  val point1 = new OrderedPoint(0, 0)
  val point2 = new OrderedPoint(0, 0)
  val point3 = new OrderedPoint(-1, -1)
  val point4 = new OrderedPoint(0, -1)
  val point5 = new OrderedPoint(43, 98)

  println(s"Equality check passed? ${point1.compare(point2) == 0}")
  println(s"'Greater than' check passed? ${point1.compare(point3) > 0}")
  println(s"'Greater than' check passed? ${point1.compare(point4) > 0}")
  println(s"'Less than' check passed? ${point1.compare(point5) < 0}")

}
