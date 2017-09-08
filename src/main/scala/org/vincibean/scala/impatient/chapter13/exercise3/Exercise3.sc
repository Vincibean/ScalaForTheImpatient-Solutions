/*
 * Copyright (C) 2017  Vincibean <Andrea Bessi>
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

import org.vincibean.scala.impatient.chapter13.exercise3._

import scala.collection.mutable.ListBuffer

val as = ListBuffer(1, 2, 3, 4, 5, 6)
println(s"Created new ListBuffer: $as")
// Test the remove2ndElementWithCopy() method
println(s"Printing the result of remove2ndElementWithCopy() : ${remove2ndElementWithCopy(as)}")
println(s"Printing the state of the ListBuffer: $as")
// Test the remove2ndElementWithRemove() method
println(s"Executing remove2ndElementWithRemove()")
remove2ndElementWithRemove(as)
println(s"Printing the state of the ListBuffer: $as")