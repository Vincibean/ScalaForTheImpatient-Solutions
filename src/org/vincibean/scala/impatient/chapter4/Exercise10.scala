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
  * What happens when you zip together two strings, such as "Hello".zip("World") ?
  * Come up with a plausible use case.
  *
  * Created by Vincibean on 17/01/16.
  */
object Exercise10 extends App {
  // Let's come up with a use case similar to the one proposed in the first exercise of the chapter.
  val gizmos = List("CPU", "Hard Drive", "Keyboard", "Joystick")
  val prices = List(327, 123, 30, 45)
  println((gizmos zip prices).mkString(", "))
}