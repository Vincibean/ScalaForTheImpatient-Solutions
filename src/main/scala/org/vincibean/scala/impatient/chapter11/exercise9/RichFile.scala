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

package org.vincibean.scala.impatient.chapter11.exercise9

/**
  * Define an unapply operation for the RichFile class that extracts the file path,
  * name and extension. For example, the file /home/cay/readme.txt has path /home/cay,
  * name readme, and extension txt.
  *
  * Created by Vincibean on 13/09/16.
  */
object RichFile {
  type FilePath = String
  type FileName = String
  type FileExtension = String

  def unapply(input: String): Option[(FilePath, FileName, FileExtension)] = {
    val regex = """(.+?)/([^/]+)\.([^\.]+)$""".r
    input match {
      case regex(path, name, ext) => Some((path, name, ext))
      case _ => None
    }
  }

}
