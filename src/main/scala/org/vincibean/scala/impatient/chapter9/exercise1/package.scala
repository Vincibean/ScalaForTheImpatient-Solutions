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

import java.io.File

import scala.io.Source

/**
  * Write a Scala code snippet that reverses the lines in a file (making the last
  * line the first one, and so on).
  *
  * Created by Vincibean on 25/01/16.
  */
package object exercise1 {

  def reverseResource(relativePath: String): String = Source
    .fromFile(new File(getClass.getClassLoader.getResource(relativePath).toURI))
    .getLines()
    .toList
    .reverse
    .mkString("\n")

}
