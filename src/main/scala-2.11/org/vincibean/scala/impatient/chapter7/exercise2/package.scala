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

package org.vincibean.scala.impatient.chapter7

/**
  * Write a puzzler that baffles your Scala friends, using a package com that isn’t
  * at the top level.
  *
  * Created by Vincibean on 22/01/16.
  */
package object exercise2 extends App {
  val theSameValue: Int = 17

  println(_root_.org.vincibean.scala.impatient.chapter7.exercise2.theSameValue ==org.vincibean.scala.impatient.chapter7.exercise2.theSameValue)
  println("Don't try this at home!")

}

// My packages start with org, not com. Sorry Cay! :-)

package org {

  package vincibean {

    package scala {

      package impatient {

        package chapter7 {

          package object exercise2 {

            val theSameValue: Int = 43

          }

        }

      }

    }

  }

}
