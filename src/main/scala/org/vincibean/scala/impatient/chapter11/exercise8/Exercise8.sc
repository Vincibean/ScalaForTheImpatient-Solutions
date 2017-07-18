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

import org.vincibean.scala.impatient.chapter11.exercise8.Matrix

// Testing the apply and update operators
val m1 = new Matrix(Seq(Seq(1, 1, 1), Seq(3, 0, 2)))
val m2 = new Matrix(Seq(Seq(0, 7, 2), Seq(0, 5, 1)))
val m3 = new Matrix(Seq(Seq(1, 2), Seq(2, 3), Seq(3, 4)))
println(m1 + m2)
println(m1 * 2)
println(m1 * m3)
println(m1 * 2 * m3)
// println(m1 * m2)   // will throw UnsupportedOperationException