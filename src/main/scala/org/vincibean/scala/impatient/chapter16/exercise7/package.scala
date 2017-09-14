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

import scala.xml.Elem

/**
  * Write a function that has a parameter of type Map[String, String] and returns
  * a dl element with a dt for each key and dd for each value. For example,
  *
  *   Map("A" -> "1", "B" -> "2")
  *
  * should yield <dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>.
  */
package object exercise7 {

  def toDescriptionList(ss: Map[String, String]): Elem =
    <dl>{ ss.map { case (k, v) => <dt>{k}</dt><dd>{v}</dd> } }</dl>

}
