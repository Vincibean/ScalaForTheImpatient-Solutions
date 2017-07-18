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

package org.vincibean.scala.impatient.chapter9

import scala.io.Source

/**
  * Write a Scala code snippet that reads a file and prints all words with more
  * than 12 characters to the console. Extra credit if you can do this in a single line.
  *
  * Created by Vincibean on 25/01/16.
  */
package object exercise3 {

  def getFilteredResource(relativePath: String): Array[String] = Source
    .fromInputStream(getClass.getClassLoader.getResourceAsStream(relativePath))
    .getLines()
    .toList
    .mkString(" ")
    .split("\\s+")
    .filter(_.length > 12)

}
