import org.vincibean.scala.impatient.chapter11.exercise12.XMLElement

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

// Create a new XMLElement
val rootElement =
  new XMLElement("root", Map.empty[String, String], Set(
    new XMLElement("html", Map.empty[String, String], Set(
      new XMLElement("body", Map.empty[String, String], Set(
        new XMLElement("ul", Map.empty[String, String], Set(
          new XMLElement("li", Map("name" -> "listItem"), Set.empty[XMLElement]),
          new XMLElement("li", Map("name" -> "listItem2", "id" -> "42"), Set.empty[XMLElement]),
          new XMLElement("li", Map("name" -> "listItem3"), Set.empty[XMLElement])
        ))
      ))
    ))
  ))

// Test that the method call works as expected
println(rootElement.html.body.ul(id = "42").li)