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

import org.vincibean.scala.impatient.chapter14.exercise4._

val starWarsPack = Bundle("Star Wars Pack", 2.0,
  Multiple(10,
    Bundle("Star Wars Movie Pack", 2.0,
      Article("Episode I", 10.00),
      Article("Episode II", 10.00),
      Article("Episode II", 10.00),
      Article("Episode IV", 15.00),
      Article("Episode V", 15.00),
      Article("Episode VI", 15.00)
    )
  ),
  Multiple(5,
    Bundle("Star Wars Action Figure Pack", 2.0,
      Article("Luke Skywalker", 5.00),
      Article("Darth Vader", 10.00),
      Article("Han Solo", 7.00),
      Article("Princess Leia", 15.00),
      Article("Jar Jar", 1.00)
    )
  )
)

println(price(starWarsPack))