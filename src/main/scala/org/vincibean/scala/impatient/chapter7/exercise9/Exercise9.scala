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

package org.vincibean.scala.impatient.chapter7.exercise9

import scala.io.StdIn

/**
  * Write a program that imports the java.lang.System class, reads the user name
  * from the user.name system property, reads a password from the StdIn object,
  * and prints a message to the standard error stream if the password is not
  * "secret". Otherwise, print a greeting to the standard output stream. Do not
  * use any other imports, and do not use any qualified names (with dots).
  */
object Exercise9 extends App {

  // No need to import java.lang.System, since every Scala program implicitly starts with "import java.lang._"
  val username: String = System.getProperty("user.name")
  println("Insert your very secret password: ")
  if (StdIn.readLine().equals("secret")) {
    System.out.println(s"Greetings $username!")
  } else {
    System.err.println("Wrong Password!")
  }

}
