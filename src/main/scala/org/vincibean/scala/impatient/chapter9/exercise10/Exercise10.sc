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

import org.vincibean.scala.impatient.chapter9.exercise10.{preparePeople, seralizeAndDeserialize}

// Testing
val people = preparePeople()

val savedPeople = seralizeAndDeserialize(people)

val s1 = savedPeople(0)
val s2 = savedPeople(1)
val s3 = savedPeople(2)
val s4 = savedPeople(3)
val s5 = savedPeople(4)
val s6 = savedPeople(5)

println(s1.isFriend(s2) && s2.isFriend(s3) && s3.isFriend(s1) && s4.isFriend(s5) && s5.isFriend(s4))