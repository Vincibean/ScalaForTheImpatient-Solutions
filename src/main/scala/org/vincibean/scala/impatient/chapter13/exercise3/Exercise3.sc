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

import java.util

import org.vincibean.scala.impatient.chapter13.exercise3.removeZeroes

import scala.collection.JavaConverters._

// Test the function
println(removeZeroes(new util.LinkedList[Int](List(0, 1, 0, 2, 0, 3, 0).asJava)))
println(removeZeroes(new util.LinkedList[Int](List.empty[Int].asJava)))
println(removeZeroes(new util.LinkedList[Int](List(1, 2, 3).asJava)))
println(removeZeroes(new util.LinkedList[Int](List(0, 0, 0).asJava)))