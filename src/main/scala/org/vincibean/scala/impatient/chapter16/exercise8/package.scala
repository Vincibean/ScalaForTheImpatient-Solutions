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

package org.vincibean.scala.impatient.chapter16

import scala.xml.{Elem, Text}

/**
  * Write a function that takes a dl element and turns it into a Map[String, String].
  * This function should be the inverse of the function in the preceding exercise,
  * provided all dt children are distinct.
  */
package object exercise8 {

  def toMap(dl: Elem): Map[String, String] = {
    val kids = dl.child
    val dts = kids.flatMap {
      case <dt>{Text(t)}</dt> => Option(t)
      case _ => None
    }
    val dds = kids.flatMap {
      case <dd>{Text(t)}</dd> => Option(t)
      case _ => None
    }
    dts.zip(dds).toMap
  }

}
