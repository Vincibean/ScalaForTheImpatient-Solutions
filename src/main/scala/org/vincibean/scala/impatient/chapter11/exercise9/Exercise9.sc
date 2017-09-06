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

import org.vincibean.scala.impatient.chapter11.exercise9.PathComponents

// Testing the unapply operator
"some random text" match {
  case PathComponents(_) => println("This should not work: wrong input")
  case _ => println("1st test: OK")
}

"" match {
  case PathComponents(_) => println("This should not work: empty input")
  case _ => println("2nd test: OK")
}

"/home/cay/readme.txt" match {
  case PathComponents(t) => println(
    s"""This should work and print the following data:
       | file path: ${t._1}
       | file name: ${t._2}
     """.stripMargin)
}