package org.vincibean.scala.impatient.chapter2

import java.time.LocalDate

/**
  * Define a string interpolator date so that you can define a java.time.LocalDate as
  * date"$year-$month-$day". You need to define an “implicit” class with a date method,
  * like this:
  *
  * implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
  *   def date(args: Any*): LocalDate = . . .
  * }
  *
  * args(i) is the value of the ith expression. Convert each to a string and then to
  * an integer, and pass them to the LocalDate.of method. If you already know
  * some Scala, add error handling. Throw an exception if there aren’t three
  * arguments, or if they aren’t integers, or if they aren’t separated by dashes.
  * (You get the strings in between the expressions as sc.parts.)
  */
package object exercise11 {

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {

    def date(args: Any*): LocalDate = {
      val first = sc.parts.head
      val last = sc.parts.last
      val mid = sc.parts.tail.init
      if (first != "") throw new IllegalArgumentException(s"Illegal first separator: $first")
      if (last != "") throw new IllegalArgumentException(s"Illegal last separator: $last")
      for (part <- mid if part != "-") throw new IllegalArgumentException(s"Illegal separator '$part' : year, month and day should be separated by a dash")
      if (args.size != 3) throw new IllegalArgumentException("Exactly 3 arguments should be provided")
      val year = args(0).toString.toInt
      val month = args(1).toString.toInt
      val day = args(2).toString.toInt
      LocalDate.of(year, month, day)
    }

  }

  def localDateOf(year: Int, month: Int, day: Int) = date"$year-$month-$day"

}
