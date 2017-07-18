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
  * Write an example program to demonstrate that
  *
  *   package com.horstmann.impatient
  *
  * is not the same as
  *
  *   package com
  *   package horstmann
  *   package impatient
  *
  * Created by Vincibean on 22/01/16.
  */
package object exercise1

// Nothing to do here, just offering a container for the packages the exercise requires.

package com {

  package  horstman {

    object SomeObject {

      val someValue: String = "This is a random value."

    }

    package impatient {

      object SomeOtherObject extends App {

        println(SomeObject.someValue)

      }

    }

  }

}

package com.horstman.impatient {

  object YetAnotherObject extends App {

    // println(SomeObject.someValue)    // Compile error!

  }

}
