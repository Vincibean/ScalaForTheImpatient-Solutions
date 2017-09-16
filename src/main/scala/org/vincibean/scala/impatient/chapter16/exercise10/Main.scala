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

package org.vincibean.scala.impatient.chapter16.exercise10

import org.vincibean.scala.impatient.chapter16.exercise10.XmlHandler._

/**
  * Write a function that reads an XHTML document, carries out the transforma-
  * tion of the preceding exercise, and saves the result. Be sure to preserve the
  * DTD and any CDATA sections.
  */
object Main {

  def main(args: Array[String]): Unit = transformAndSave(xhtmlFile)

}
