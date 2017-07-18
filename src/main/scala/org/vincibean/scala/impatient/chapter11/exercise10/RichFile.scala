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

package org.vincibean.scala.impatient.chapter11.exercise10

/**
  * Define an unapplySeq operation for the RichFile class that extracts all path
  * segments. For example, for the file /home/cay/readme.txt, you should produce a
  * sequence of three segments: home, cay, and readme.txt
  *
  * Created by Vincibean on 13/09/16.
  */
object RichFile {

  def unapplySeq(input: String): Option[Seq[String]] = {
    input.split("/").filter(_.nonEmpty) match {
      case a if a.isEmpty => None
      case s => Some(s)
    }
  }

}
