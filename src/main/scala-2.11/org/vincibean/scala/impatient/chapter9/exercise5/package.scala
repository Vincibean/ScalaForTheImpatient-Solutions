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

import java.io.PrintWriter

/**
  * Write a Scala program that writes the powers of 2 and their reciprocals to a
  * file, with the exponent ranging from 0 to 20. Line up the columns:
  *
  *   1       1
  *   2       0.5
  *   4       0.25
  *   ...     ...
  *
  * Created by Vincibean on 27/01/16.
  */
package object exercise5 {

  def writeResource(): Unit = {
    // Will override output file.
    // N.B.: The overridden file will be the one produced by SBT! You can find it in the target folder
    // corresponding to this exercise.
    val out = new PrintWriter(getClass.getClassLoader.getResource("chapter9/exercise5/output.txt").getPath)
    out.println((0 until 20).map(i => s"\t ${Math.pow(2, i)} \t\t ${1.0 / Math.pow(2, i)} \n").mkString)
    out.flush()
    out.close()
  }

}
