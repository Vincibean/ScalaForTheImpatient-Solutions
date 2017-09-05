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

import scala.io.Source

// Write a Scala program that prints the src attributes of all img tags of a web
// page. Use regular expressions and groups.
val source = Source.fromURL("https://www.w3schools.com/")
// TODO Couldn't find a way to pick only the src attribute, only the whole string.
println("""<img[^>]+src=([A-Za-z0-9'"/.]+)""".r.findAllIn(source.mkString).mkString("; "))