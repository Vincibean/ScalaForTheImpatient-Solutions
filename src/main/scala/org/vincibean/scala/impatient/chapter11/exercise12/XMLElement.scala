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

package org.vincibean.scala.impatient.chapter11.exercise12

import scala.language.dynamics

/**
  * Define a class XMLElement that models an XML element with a name, attributes,
  * and child elements. Using dynamic selection and method calls, make it pos-
  * sible to select paths such as rootElement.html.body.ul(id="42").li, which should
  * return all li elements inside ul with id attribute 42 inside body inside html.
  */
class XMLElement(val name: String, val attributes: Map[String, String], val childElements: Set[XMLElement]) extends Dynamic {

  def selectDynamic(name: String): XMLElement = childElements.find(_.name == name).get // allow exceptions to be thrown

  def applyDynamicNamed(method: String)(args: (String, String)*): XMLElement = new XMLElement(
    name = method,
    attributes = Map.empty[String, String], // since this is a fake XMLElement, no attributes are necessary
    childElements = for {
      xmlElem <- childElements.find(_.name == method).toSet[XMLElement]
      childXmlElem <- xmlElem.childElements
      (k, v) <- args
      if childXmlElem.attributes.exists(t => t._1 == k && t._2 == v)
    } yield childXmlElem)

  override def toString: String =
    s"<$name ${attributes.map(t => s" ${t._1} = ${t._2}").mkString(" ")}>${childElements.map(_.toString).mkString("\n")}</$name>"

}
