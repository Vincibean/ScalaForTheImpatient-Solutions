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

package org.vincibean.scala.impatient.chapter10.exercise2

import java.awt.Point

/**
  * Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point.
  * Use lexicographic ordering, i.e. (x, y) < (x', y') if x < x' or x = x' and y < y'.
  *
  * Created by Vincibean on 04/02/16.
  */
class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {

  // Inspired by Basile Du Plessis' solution.
  override def compare(that: Point): Int = {
    (this.getX.compare(that.getX), this.getY.compare(that.getY)) match {
      case (0, 0) => 0
      case (i, j) if (i < 0 && j < 0) || (i == 0 && j < 0) => -1
      case _ => 1
    }
  }

}
