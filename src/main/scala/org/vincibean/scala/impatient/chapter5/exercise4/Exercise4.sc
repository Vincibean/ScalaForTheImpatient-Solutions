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

import org.vincibean.scala.impatient.chapter5.exercise4.Time

// Testing the Time class
val t1: Time = new Time(12, 12)
val t2: Time = new Time(12, 13)
println(s"Is ${t1.hours}:${t1.minutes} before than ${t2.hours}:${t2.minutes}? ${t1.before(t2)}")
val t3: Time = new Time(25, 67)     // Throws IllegalArgumentException