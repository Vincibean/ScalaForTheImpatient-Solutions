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

// Write a Scala program that reads a file with tabs, replaces each tab with spaces
// so that tab stops are at n-column boundaries, and writes the result to the
// same file.
val n = 2
val source = getResource("chapter9/exercise2/tsv.tsv")
val tabPattern = """\t""".r
val outputContent = tabPattern.replaceAllIn(source, " " * n)

// Will override output file (yes, we are cheating a bit!)
// N.B.: The overridden file will be the one produced by SBT! You can find it in the target folder
// corresponding to this exercise.
writeContentInResource("chapter9/exercise2/tsv_out.txt", outputContent)