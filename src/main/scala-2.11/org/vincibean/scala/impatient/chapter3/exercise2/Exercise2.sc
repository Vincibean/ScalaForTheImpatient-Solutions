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
import org.vincibean.scala.impatient.chapter3.exercise2.swapArray

// Let's test the swapArray function
val initialArray = ArrayBuffer(1, 2, 3, 4, 5)
println(s"Starting with Array${initialArray.mkString("(", ", ", ")")}")
println("Swapping the Array!")
swapArray(initialArray)
println(s"Array now is: Array${initialArray.mkString("(", ", ", ")")}")
println("Swapping again!")
swapArray(initialArray)
println(s"Array now is: Array${initialArray.mkString("(", ", ", ")")}")
val anotherArray = ArrayBuffer(9, 8, 7, 6)
println(s"Using another array: Array${anotherArray.mkString("(", ", ", ")")}")
println("Swapping the Array!")
swapArray(anotherArray)
println(s"Array now is: Array${anotherArray.mkString("(", ", ", ")")}")
println("Swapping again!")
swapArray(anotherArray)
println(s"Array now is: Array${anotherArray.mkString("(", ", ", ")")}")