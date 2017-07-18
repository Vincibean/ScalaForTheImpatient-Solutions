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

import java.util.TimeZone._

// Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
// Strip off the "America/" prefix and sort the result.
println(getAvailableIDs.filter(_.contains("America/")).map(_.substring(8)).sorted.mkString(", "))
println("Using another approach: regular expressions.")
val americanIds = for {
  id <- getAvailableIDs
  j = """(?<=America/)([A-Za-z/_-]+)""".r findFirstIn id if j.isDefined
} yield j.get
println(americanIds.sorted.mkString(", "))