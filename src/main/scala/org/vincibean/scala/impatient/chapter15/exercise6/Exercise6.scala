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

package org.vincibean.scala.impatient.chapter15.exercise6

/**
  * Write a Scala object with a volatile Boolean field. Have one thread sleep for
  * some time, then set the field to true, print a message, and exit. Another thread
  * will keep checking whether the field is true. If so, it prints a message and exits.
  * If not, it sleeps for a short time and tries again. What happens if the variable
  * is not volatile?
  */
object Exercise6 {

  /**
    * This field should be defined as @volatile, since it ensures that
    * a variable's value will be modified by different threads.
    * Yet, in this case, if the variable isn't set as @volatile, nothing
    * wrong happens (i.e. no error occurs)
    */
  @volatile
  var status: Boolean = false

  val t1 = new Thread {
    override def run() {
      Thread.sleep(100)
      status = true
      println("Printing some message. Oh! and the status was set to true!")
    }
  }

  val t2 = new Thread {
    override def run() {
      while (!status) {
        println("Sigh! The status field is still false!")
        Thread.sleep(10)
      }
      println("Yay! The status field is finally true!")
    }
  }

  def main(args: Array[String]): Unit = {
     t1.start()
     t2.start()
  }

}
