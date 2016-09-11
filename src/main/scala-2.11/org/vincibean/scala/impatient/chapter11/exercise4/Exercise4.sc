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

import org.vincibean.scala.impatient.chapter11.exercise4.Money

// Testing the Money operators
val m1 = Money(2, 12)
val m2 = Money(0, 24)

println(m1 + m2)
println(m1 + Money(0, 99))
println(m1 - m2)
println(m2 - m1)
println(m1 == m2)
println(m1 == Money(2, 12))
println(m1 < m2)
println(m2 < m1)

// Testing Money normalization
println(Money(1, 167)) // Will print $2.67

// Testing the condition given in the exercise
println(Money(1, 75) + Money(0, 50) == Money(2, 25)) // will print true

// It doesn't make any sense to multiply or divide two amount. It *might* make sense
// to multiply or divide an amount with an Integer or a double, this would probably lead
// to a confusing API.