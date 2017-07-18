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

import org.vincibean.scala.impatient.chapter11.exercise10.RichFile

// Testing the unapplySeq operator
"some random text" match {
  case RichFile(w) => println("1st test: OK")
  case RichFile(w1, w2) =>  println("This should not work: wrong input")
  case RichFile(w1, w2, w3) => println("This should not work: wrong input")
  case _ => println("This should not work: wrong input")
}

"" match {
  case RichFile(e) => println("This should not work: wrong input")
  case RichFile(e1, e2) =>  println("This should not work: wrong input")
  case RichFile(e1, e2, e3) => println("This should not work: wrong input")
  case _ => println("2nd test: OK")
}

"/home/cay/readme.txt" match {
  case RichFile(c1, c2, c3) => println(
    s"""This should work and print the following data:
        | 1st chunk: $c1
        | 2nd chunk: $c2
        | 3rd chunk: $c3
     """.stripMargin)
}