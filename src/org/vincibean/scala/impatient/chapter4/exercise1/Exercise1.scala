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

package org.vincibean.scala.impatient.chapter4

/**
  * Set up a map of prices for a number of gizmos that you covet. Then produce
  * a second map with the same keys and the prices at a 10 percent discount.
  *
  * Created by Vincibean on 16/01/16.
  */
package object exercise1 extends App {

  println(Map("CPU" -> 327, "Hard Drive" -> 123, "Keyboard" -> 30, "Joystick" -> 45).mapValues(_ * 90 / 100).mkString(", "))

}
