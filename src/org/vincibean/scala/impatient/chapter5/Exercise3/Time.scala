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

package org.vincibean.scala.impatient.chapter5.Exercise3

/**
  * Write a class Time with read-only properties hours and minutes and a method
  * before(other: Time): Boolean that checks whether this time comes before the
  * other. A Time object should be constructed as new Time(hrs, min) , where hrs is in
  * military time format (between 0 and 23).
  *
  * Created by Vincibean on 18/01/16.
  */
class Time(val hours: Int, val minutes: Int) {
  require(hours > 0 && hours < 24)
  require(minutes > 0 && minutes < 60)

  private val asMinutes = hours * 60 + minutes

  def before(other: Time): Boolean = other.asMinutes > this.asMinutes

}
