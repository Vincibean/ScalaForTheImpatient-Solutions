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

package org.vincibean.scala.impatient.chapter5.Exercise6

/**
  * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods”,
  * on page 51, provide a primary constructor that turns negative ages to 0.
  *
  * Created by Vincibean on 18/01/16.
  */
// No Person class in Section 5.1 (“Simple Classes and Parameterless Methods”), on page 51.
// Using the Person class in Section 5.2 (“Properties with Getters and Setters”), on page 53, instead.
class Person (var age: Int = 0) {
  if (age < 0) {
    age = 0
  }

}
