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

import org.vincibean.scala.impatient.chapter13.exercise5.myMkString

// Test the function
println(myMkString(List("Hello", "World")))
println(myMkString(List("Hello", "World"), sep = " "))
println(myMkString(as = List("Hello", "World"), sep = " ", start = "<< "))
println(myMkString(as = List("Hello", "World"), sep = " ", start = "<< ", end = " >>"))
println(myMkString(as = List.empty[String], sep = " ", start = "<< ", end = " >>"))