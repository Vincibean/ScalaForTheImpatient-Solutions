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

import org.vincibean.scala.impatient.chapter9.exercise2.{getResource, writeContentInResource}

// Make a regular expression searching for quoted strings "like this, maybe with
// \" or \\" in a Java or C++ program. Write a Scala program that prints out all
// such strings in a source file.

// Reusing most of the code of exercise 2
val source = getResource("chapter9/exercise6/HelloWorld.java")
val pattern = """"(?:[^"])*"""".r         // TODO Ends when a \" is found. Any ideas?
val found = pattern.findAllIn(source).mkString("\n")
// N.B.: The overridden file will be the one produced by SBT! You can find it in the target folder
// corresponding to this exercise.
writeContentInResource("chapter9/exercise6/out.txt", found)