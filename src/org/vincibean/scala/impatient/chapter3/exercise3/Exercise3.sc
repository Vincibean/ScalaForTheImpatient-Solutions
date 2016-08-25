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

import org.vincibean.scala.impatient.chapter3.exercise3.{swapBySlicingArrayOf, swappedArrayOf}

// Let's test the first approach
val initialArray = Array(1, 2, 3, 4, 5)
println(s"Starting with Array${initialArray.mkString("(", ", ", ")")}")
println("Swapping the Array!")
val array2ndPhase = swappedArrayOf(initialArray)
println(s"Array now is: Array${array2ndPhase.mkString("(", ", ", ")")}")
println("Swapping again!")
val array3rdPhase = swapBySlicingArrayOf(array2ndPhase)
println(s"Array now is: Array${array3rdPhase.mkString("(", ", ", ")")}")

// Let's test the second approach
val anotherArray = Array(9, 8, 7, 6)
println(s"Starting with Array${anotherArray.mkString("(", ", ", ")")}")
println("Swapping the Array!")
val anotherArray2ndPhase = swappedArrayOf(anotherArray)
println(s"Array now is: Array${anotherArray2ndPhase.mkString("(", ", ", ")")}")
println("Swapping again!")
val anotherArray3rdPhase = swapBySlicingArrayOf(anotherArray2ndPhase)
println(s"Array now is: Array${anotherArray3rdPhase.mkString("(", ", ", ")")}")

// Let's test the third approach; since this function doesn't contain a loop, it can't be considered a valid solution
val yetAnotherArray = Array(4, 5, 6, 7)
println(s"Starting with Array${yetAnotherArray.mkString("(", ", ", ")")}")
println("Swapping the Array!")
val yetAnotherArray2ndPhase = swappedArrayOf(yetAnotherArray)
println(s"Array now is: Array${yetAnotherArray2ndPhase.mkString("(", ", ", ")")}")
println("Swapping again!")
val yetAnotherArray3rdPhase = swapBySlicingArrayOf(yetAnotherArray2ndPhase)
println(s"Array now is: Array${yetAnotherArray3rdPhase.mkString("(", ", ", ")")}")