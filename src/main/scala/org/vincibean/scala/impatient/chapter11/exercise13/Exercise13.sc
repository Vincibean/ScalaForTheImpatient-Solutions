/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import org.vincibean.scala.impatient.chapter11.exercise13.XMLBuilder

// Create a new builder
val builder = new XMLBuilder
val b = builder.ul(id="42", style="list-style: lower-alpha;")
println("Here's what we've built: " + b.build)

// Testing our way of building nested elements
val b2 = new XMLBuilder(childElements =
  new XMLBuilder()
    .li(id="li1", style="list-style: lower-alpha;")
    .li(id="li2", style="list-style: lower-alpha;")
    .li(id="li3", style="list-style: lower-alpha;")
    .build
).ul(id="42", style="list-style: lower-alpha;")
println("Here's what we've built with nested elements: " + b2.build)