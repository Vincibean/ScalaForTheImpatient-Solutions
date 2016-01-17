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

import java.util.Calendar._

import scala.collection.mutable

/**
  * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and
  * similarly for the other weekdays. Demonstrate that the elements are visited
  * in insertion order.
  *
  * Created by Vincibean on 17/01/16.
  */
object Exercise6 extends App {
  val weekDays = mutable.LinkedHashMap(
    "Sunday" -> SUNDAY,
    "Monday" -> MONDAY,
    "Tuesday" -> TUESDAY,
    "Wednesday" -> WEDNESDAY,
    "Thursday" -> THURSDAY,
    "Friday" -> FRIDAY,
    "Saturday" -> SATURDAY)
  // Results will be printed in insertion order.
  println(weekDays.mkString(", "))
}