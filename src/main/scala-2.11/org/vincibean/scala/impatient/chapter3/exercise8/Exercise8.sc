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

import scala.collection.mutable.ArrayBuffer
import org.vincibean.scala.impatient.chapter3.exercise8.newDropping

// Let's test the function
val initialArray = ArrayBuffer(1, 2, -12, 1, -2, -12, -12, 1, -2)
println(s"Initial Array: ${initialArray.mkString(", ")}")
newDropping(initialArray)
println(s"After dropping the 1st negative number (if any!): ${initialArray.mkString(", ")}")

// Now with an Array that doesn't contain negative numbers
val anotherArray = ArrayBuffer(1, 2, 1, 1, 2)
println(s"Initial Array: ${anotherArray.mkString(", ")}")
newDropping(anotherArray)
println(s"After dropping the 1st negative number (if any!): ${anotherArray.mkString(", ")}")