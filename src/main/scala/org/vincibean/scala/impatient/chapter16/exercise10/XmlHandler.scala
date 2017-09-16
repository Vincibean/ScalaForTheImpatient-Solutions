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

import java.io.{File, PrintWriter}

import org.vincibean.scala.impatient.chapter16.exercise9.XmlTransformer

import scala.io.BufferedSource
import scala.xml._
import scala.xml.parsing.XhtmlParser

/**
  * Write a function that reads an XHTML document, carries out the transforma-
  * tion of the preceding exercise, and saves the result. Be sure to preserve the
  * DTD and any CDATA sections.
  */
object XmlHandler {
  val root = "chapter16/exercise10/"
  val input = "example.xhtml"
  val output = "example_out.xhtml"
  val source: BufferedSource = scala.io.Source.fromFile(getClass.getClassLoader.getResource(root + input).getPath)
  val xhtmlFile: Document =
    new XhtmlParser(source)
      .initialize
      .document()

  def transformAndSave(xhtmlFile: Document): Unit = saveToFile(pretty(transform(xhtmlFile)))

  def transform(xhtmlFile: Document): Document = {
    val transformed = new Document()
    transformed.dtd = xhtmlFile.dtd
    val s = XmlTransformer.transform(xhtmlFile).head
    transformed.docElem = s
    transformed
  }

  // N.B.: The output file will be the one produced by SBT! You can find it in the target folder
  // corresponding to this exercise.
  def saveToFile(content: String): Unit = {
    val f = new File(getClass.getClassLoader.getResource(root).getPath.concat(output))
    f.createNewFile()
    val out = new PrintWriter(f)
    out.append(content)
    out.flush()
    out.close()
  }

  def pretty(xhtmlFile: Seq[Node]): String = new PrettyPrinter(width = 100, step = 4).formatNodes(xhtmlFile)

}
