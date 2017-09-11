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

package org.vincibean.scala.impatient.chapter15.exercise5

import java.io.{File, FileNotFoundException}

import scala.io.Source

/**
  * Write a Scala method that returns a string containing all lines of a file. Call it
  * from Java.
  */
object IO {

  @throws(classOf[FileNotFoundException])
  def readAllLinesFrom(f: String): String = Source
    .fromFile(new File(f))
    .getLines()
    .mkString("\n")

}
