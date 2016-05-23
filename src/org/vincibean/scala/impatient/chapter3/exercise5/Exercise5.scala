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

package org.vincibean.scala.impatient.chapter3

/**
  * How do you compute the average of an Array[Double]?
  *
  * Created by Vincibean on 12/01/16.
  */
package object exercise5 extends App {

  val initialArray = Array(1.0, 2.0, -12.0)
  println(s"Initial Array: ${initialArray.mkString(", ")}")
  println(s"Average: ${initialArray.sum / initialArray.length}")

}
