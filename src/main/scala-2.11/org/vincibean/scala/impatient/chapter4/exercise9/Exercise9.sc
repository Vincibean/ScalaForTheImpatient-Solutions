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

import org.vincibean.scala.impatient.chapter4.exercise9.lteqgt

// Let's test the lteqgt() function
val valuesArray = Array(1, 2, 3, 4, 5, 6, 7, 8, 11)
val v = 6
println(s"Testing with value $v and array: ${valuesArray.mkString(", ")}")
println(s"Result is: ${lteqgt(valuesArray, v)}")