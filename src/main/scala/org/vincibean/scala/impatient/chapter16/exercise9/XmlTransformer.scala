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

package org.vincibean.scala.impatient.chapter16.exercise9

import scala.language.postfixOps
import scala.xml._
import scala.xml.transform.{RewriteRule, RuleTransformer}

/**
  * Transform an XHTML document by adding an alt="TODO" attribute to all img
  * elements without an alt attribute, preserving everything else.
  */
object XmlTransformer {

  val rule: RewriteRule = new RewriteRule {
    override def transform(n: Node): Node = n match {
      case img @ <img/> if img \ "@alt" isEmpty =>
        img.asInstanceOf[Elem] % Attribute(null, "alt", "TODO", Null)
      case _ => n
    }
  }

  val xhtmlFile: Elem = XML.loadFile(getClass.getClassLoader.getResource("chapter16/exercise9/example.xhtml").getPath)

  def transform(el: Elem): Seq[Node] = new RuleTransformer(rule).transform(el)

}
