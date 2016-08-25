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

package org.vincibean.scala.impatient.chapter9

import java.io.PrintWriter

import scala.io.Source

/**
  * Write a Scala program that reads a file with tabs, replaces each tab with spaces
  * so that tab stops are at n-column boundaries, and writes the result to the
  * same file.
  *
  * Created by Vincibean on 25/01/16.
  */
package object exercise2 extends App {

  val n = 2

  val source = Source.fromFile("resources/chapter9/exercise2/tsv.tsv")
  val inputTsv = source.mkString
  val tabPattern = """\t""".r
  val outputSsv = tabPattern.replaceAllIn(inputTsv, " " * n)
  source.close()

  // Will override input file!
  val out = new PrintWriter("resources/chapter9/exercise2/tsv.tsv")
  out.println(outputSsv)
  out.close()

}
