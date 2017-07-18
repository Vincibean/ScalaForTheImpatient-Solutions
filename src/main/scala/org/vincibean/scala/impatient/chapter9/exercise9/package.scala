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

import java.io.File

/**
  * Write a Scala program that counts how many files with .class extension are
  * in a given directory and its subdirectories.
  *
  * Created by Vincibean on 27/01/16.
  */
package object exercise9 {

  // A slightly modified version of BasileDuPlessis' solution.

  def countClass(dir: File): Int = {
    val dirList = dir.listFiles
    dirList.count(_.toString.endsWith(".class")) + dirList.filter(_.isDirectory).map(countClass).sum
  }

}
