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

package org.vincibean.scala.impatient.chapter2

/**
  * Come up with one situation where the assignment x = y = 1 is valid in Scala.
  * (Hint: Pick a suitable type for x .)
  *
  * Created by Vincibean on 11/01/16.
  */
object Exercise3 extends App {
  var x = ()
  var y = 0
  x = y = 1
  println("Value of x: " + x)
  println("Value of y: " + y)
}
