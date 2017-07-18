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

package org.vincibean.scala.impatient.chapter11.exercise5

/**
  * Provide operators that construct an HTML table. For example,
  *
  * Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  *
  * should produce
  *
  * <table><tr><td>Java</td><td>Scala</td></tr><td>Gosling...
  *
  * Created by Vincibean on 11/09/16.
  */
object Table {

  def apply(): Table = new Table(List(List.empty[String]))

  def apply(struct: List[List[String]]): Table = new Table(struct)

}

class Table(struct: List[List[String]]) {

  def |(datum: String): Table = Table(struct.init :+ (struct.last :+ datum))

  def ||(row: String): Table = Table(struct :+ (Nil :+ row))

  override def toString: String = struct.map(_.mkString("<td>", "</td><td>", "</td>")).mkString("<table><tr>", "</tr><tr>", "</tr></table>")

}
