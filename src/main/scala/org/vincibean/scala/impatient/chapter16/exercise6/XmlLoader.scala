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

package org.vincibean.scala.impatient.chapter16.exercise6

import scala.collection.immutable.Seq
import scala.xml.{Elem, PrettyPrinter, XML}

/**
  * Read an XHTML file and print a table of all hyperlinks in the file, together
  * with their URLs. That is, print the child text and the href attribute of each a
  * element.
  */
object XmlLoader {

  def loadXhtmlFile: Elem = XML.loadFile(getClass.getClassLoader.getResource("chapter16/exercise6/example.xhtml").getPath)

  def hyperlinksAndUrls: Seq[(String, String)] = (loadXhtmlFile \\ "a").map(n => n.text -> (n \ "@href").text)

  def createTable: Elem =
      <table>
        {hyperlinksAndUrls.map { case (link, url) => <tr><td>{link}</td><td>{url}</td></tr> } }
      </table>

  def prettyPrintedTable: String = new PrettyPrinter(width = 100, step = 4).formatNodes(XmlLoader.createTable)

}
