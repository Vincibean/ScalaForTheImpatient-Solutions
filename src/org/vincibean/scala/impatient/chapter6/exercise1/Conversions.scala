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

package org.vincibean.scala.impatient.chapter6.exercise1

/**
  * Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and
  * milesToKilometers.
  *
  * Created by Vincibean on 20/01/16.
  */
object Conversions {

  def inchesToCentimeters(inches: Double) = 2.54 * inches

  def gallonsToLiters(gallons: Double) = 3.78541 * gallons

  def milesToKilometers(miles: Double) = 1.60934 * miles

}
