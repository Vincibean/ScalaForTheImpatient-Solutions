/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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

package org.vincibean.scala.impatient.chapter11.exercise9

/**
  * Define an object PathComponents with an unapply operation class that extracts
  * the directory path and file name from an java.nio.file.Path. For example, the
  * file /home/cay/readme.txt has directory path /home/cay and file name readme.txt.
  */
object PathComponents {
  type FilePath = String
  type FileName = String

  def unapply(input: String): Option[(FilePath, FileName)] = {
    val regex = """(.+?)/([^/]+)$""".r
    input match {
      case regex(path, name) => Some((path, name))
      case _ => None
    }
  }

}
