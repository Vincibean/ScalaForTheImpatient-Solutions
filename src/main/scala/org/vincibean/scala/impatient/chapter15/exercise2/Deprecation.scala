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

package org.vincibean.scala.impatient.chapter15.exercise2

/**
  * Make an example class that shows every possible position of an annotation.
  * Use @deprecated as your sample annotation.
  */
@deprecated
object Deprecation {

  @deprecated
  val isDeprecated = true

}

@deprecated
class Deprecation(@deprecated val version: Int, @deprecated name: String) {

  @deprecated
  def deprecate(): Unit = println("You're deprecate, dude!")

  @deprecated(message = "You should not use this anymore", since = "always")
  def deprecateAgain(@deprecated message: String): Unit = println(message)

}
