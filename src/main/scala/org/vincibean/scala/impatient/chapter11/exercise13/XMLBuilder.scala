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
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.vincibean.scala.impatient.chapter11.exercise13

import org.vincibean.scala.impatient.chapter11.exercise12.XMLElement

import scala.language.dynamics

/**
  * Provide an XMLBuilder class for dynamically building XML elements, as
  * builder.ul(id="42", style="list-style: lower-alpha;"), where the method name
  * becomes the element name and the named arguments become the attributes.
  * Come up with a convenient way of building nested elements.
  */
class XMLBuilder(private val elements: Seq[XMLElement] = Seq.empty[XMLElement], private val childElements: Seq[XMLElement] = Seq.empty[XMLElement]) extends Dynamic {

  def applyDynamicNamed(method: String)(args: (String, String)*): XMLBuilder = new XMLBuilder(
    elements = elements :+ new XMLElement(method, args.toMap, childElements),
    childElements = childElements
  )

  def build: Seq[XMLElement] = elements.map(el => new XMLElement(el.name, el.attributes, childElements))

}
