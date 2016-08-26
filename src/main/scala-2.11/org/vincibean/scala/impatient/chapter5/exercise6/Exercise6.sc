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

import org.vincibean.scala.impatient.chapter5.exercise6.Person

// Testing the Person class
val p1: Person = new Person(30)
println(s"First person's age should be 30; actual: ${p1.age}")
val p2: Person = new Person(0)
println(s"Second person's age should be 0; actual: ${p2.age}")
val p3: Person = new Person(-24)
println(s"Third person's age should be -24; actual: ${p3.age}")