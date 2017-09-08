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

/**
  * The method java.util.TimeZone.getAvailableIDs yields time zones such as Africa/
  * Cairo and Asia/Chungking. Which continent has the most time zones? Hint: groupBy.
  */

val maxContinent = java.util.TimeZone.getAvailableIDs
  .map(_.split("/"))
  .map(ss => ss.head -> ss.last)
  .groupBy(_._1)
  .mapValues(_.length)
  .maxBy(_._2)
  ._1

println(s"The continent with the most time zones is $maxContinent")