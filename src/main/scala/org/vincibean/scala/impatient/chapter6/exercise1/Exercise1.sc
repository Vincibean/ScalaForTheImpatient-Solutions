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

import org.vincibean.scala.impatient.chapter6.exercise1.Conversions

// Testing the Conversion functions
println("--- Interesting Facts ---")
println(s"2 inches correspond to ${Conversions.inchesToCentimeters(2)} centimeters.")
println(s"1 gallon corresponds to ${Conversions.gallonsToLiters(1)} liters.")
println(s"3 miles correspond to ${Conversions.milesToKilometers(3)} kilometers.")