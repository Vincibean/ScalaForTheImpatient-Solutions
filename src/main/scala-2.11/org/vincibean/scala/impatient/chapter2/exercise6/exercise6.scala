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

package org.vincibean.scala.impatient.chapter2

/**
  * Write a for loop for computing the product of the Unicode codes of all letters in a string.
  * For example, the product of the characters in "Hello" is 825152896.
  *
  * Created by Vincibean on 11/01/16.
  */
package object exercise6 extends App {

  def stringMultiplication(string2multiply: String) = {
    var result = 1
    for(char: Char <- string2multiply){
      result *= char
    }
    result
  }

}
