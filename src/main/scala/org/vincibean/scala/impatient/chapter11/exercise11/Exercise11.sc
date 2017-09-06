/*
 * Copyright (C) 2017  Vincibean <Andre Bessi>
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

import org.vincibean.scala.impatient.chapter11.exercise11.DynamicProps

// Create a new DynamicProps
val sysProps = new DynamicProps
// Fill it with data
sysProps.java.home = "Fred"
sysProps.scala.home = "Martin"
println("The Scala home is: " + sysProps.scala.home)
println("The Java home is: " + sysProps.java.home)
println("These are the defined props: " + sysProps.toProps)