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

package org.vincibean.scala.impatient.chapter14

import java.io.File
import java.nio.file._

/**
  * Your Java Development Kit distribution has the source code for much of the
  * JDK in the src.zip file. Unzip and search for case labels (regular expression
  * case [^:]+:). Then look for comments starting with // and containing [Ff]alls?
  * thr to catch comments such as // Falls through or // just fall thru. Assuming
  * the JDK programmers follow the Java code convention, which requires such
  * a comment, what percentage of cases falls through?
  **/
package object exercise1 extends App {

  // Prepare the Regular Expressions
  val rf = """case [^:]+:[^:]+?/[/*] [Ff]alls? thr""".r
  val rc = """case [^:]+:""".r

  // Search through files recursively
  def recursivelyListFiles(f: File): Array[File] = {
    val these = f.listFiles
    these ++ these.filter(_.isDirectory).flatMap(recursivelyListFiles)
  }

  // Search through a subset of the Java Development Kit
  val path: Path = FileSystems.getDefault.getPath("src/main/resources/chapter14/exercise1/src")

  val codeBase = recursivelyListFiles(path.toFile)
    .filter(!_.isDirectory) // Exclude directories
    .filter(!_.isHidden)    // Exclude hidden files
    .flatMap(f => scala.io.Source.fromFile(f).getLines())

  println(codeBase.flatMap(x => rf.findAllIn(x)).length / codeBase.flatMap(x => rc.findAllIn(x)).length)

}
