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

// What happens when you zip together two strings, such as "Hello".zip("World") ?
// Come up with a plausible use case.

// Similarly to the case provided by Basile du Plessis here:
// https://github.com/BasileDuPlessis/scala-for-the-impatient/blob/master/src/main/scala/com/basile/scala/ch04/Ex10.scala
// Let's count the number of differences in two words
"Here's a word".zip("Here's a work")
  .map(pair => pair._1 != pair._2)
  .count(b => b == true) // this could be simplified; we're taking it in this way for readability