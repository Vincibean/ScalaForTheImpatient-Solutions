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

import org.vincibean.scala.impatient.chapter13.exercise4.findCorrespondence

// Test the function
println(findCorrespondence(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)))
println(findCorrespondence(Set("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)))
println(findCorrespondence(Array("I", "Should", "Not", "Exist"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)))
println(findCorrespondence(Array.empty[String], Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)))
println(findCorrespondence(Array("I", "Should", "Not", "Exist"), Map.empty[String, Int]))
println(findCorrespondence(Array.empty[String], Map.empty[String, Int]))
