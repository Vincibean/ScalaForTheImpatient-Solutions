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

import org.vincibean.scala.impatient.chapter17.exercise2.doInOrder

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val f: Int => Future[Int] = (x: Int) => Future {
  Thread.sleep(x)
  x * 2
}
val g: Int => Future[Int] = (x: Int) => Future {
  Thread.sleep(x)
  x + 2
}

doInOrder(f, g)(500).foreach(i => println(s"The final result is $i"))