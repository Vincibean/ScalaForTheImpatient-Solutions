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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

/**
  * What is <fred/>(0)? <fred/>(0)(0)? Why?
  */
val x = <fred/>(0)
println(s"The class of <fred/>(0) is ${x.getClass}")
val y = <fred/>(0)(0)
println(s"The class of <fred/>(0)(0) is ${y.getClass}")

// The reason is that the Node class extends NodeSeq. A single node is a sequence of length 1.
// So, when we call <fred/>(0), we're actually calling the apply method, which selects an element by its index
// in the sequence. We end up with a Node again, so we can call the apply method again and end up
// with the same result. In fact:

val xml = <fred/>
assert(xml(0) == xml)
assert(xml(0)(0) == xml)
assert(xml(0)(0)(0) == xml)
assert(xml(0)(0)(0)(0) == xml)
