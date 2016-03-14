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

package org.vincibean.scala.impatient.chapter10.exercise1

import java.awt.geom.RectangularShape

/**
  * The java.awt.Rectangle class has useful methods translate and grow that are
  * unfortunately absent from classes such as java.awt.geom.Ellipse2D. In Scala, you
  * can fix this problem. Define a trait RectangleLike with concrete methods translate
  * and grow. Provide any abstract methods that you need for the implementation,
  * so that you can mix in the trait like this:
  *
  *   val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  *   egg.translate(10, -10)
  *   egg.grow(10, 20)
  *
  * Created by Vincibean on 04/02/16.
  */
trait RectangleLike {
  this: RectangularShape =>

  /**
    * Translates this Rectangle the indicated distance, to the right along the X coordinate axis, and downward along the Y coordinate axis.
    *
    * Literal translation from Java code. Not sure it was a good idea!
    *
    * @param dx the distance to move this Rectangle along the X axis
    * @param dy the distance to move this Rectangle along the Y axis
    */
  def translate(dx: Int, dy: Int): Unit = {
    var oldv = getX
    var newv = oldv + dx
    if (dx < 0) {
      // moving leftward
      if (newv > oldv) {
        // negative overflow
        // Only adjust width if it was valid (>= 0).
        if (getWidth >= 0) {
          // The right edge is now conceptually at
          // newv+width, but we may move newv to prevent
          // overflow.  But we want the right edge to
          // remain at its new location in spite of the
          // clipping.  Think of the following adjustment
          // conceptually the same as:
          // width += newv; newv = MIN_VALUE; width -= newv;
          setFrame(getX, getY, getWidth + newv - Integer.MIN_VALUE, getHeight)
          // width may go negative if the right edge went past
          // MIN_VALUE, but it cannot overflow since it cannot
          // have moved more than MIN_VALUE and any non-negative
          // number + MIN_VALUE does not overflow.
        }
        newv = Integer.MIN_VALUE
      }
    } else {
      // moving rightward (or staying still)
      if (newv < oldv) {
        // positive overflow
        if (getWidth >= 0) {
          // Conceptually the same as:
          // width += newv; newv = MAX_VALUE; width -= newv;
          setFrame(getX, getY, getWidth + newv - Integer.MAX_VALUE, getHeight)
          // With large widths and large displacements
          // we may overflow so we need to check it.
          if (getWidth < 0) {
            setFrame(getX, getY, Integer.MAX_VALUE, getHeight)
          }
        }
        newv = Integer.MAX_VALUE
      }
    }
    setFrame(newv, getY, getWidth, getHeight)
    oldv = getY
    newv = oldv + dy
    if (dy < 0) {
      // moving upward
      if (newv > oldv) {
        // negative overflow
        if (getHeight >= 0) {
          setFrame(getX, getY, getWidth, getHeight + newv - Integer.MIN_VALUE)
          // See above comment about no overflow in this case
        }
        newv = Integer.MIN_VALUE
      }
    } else {
      // moving downward (or staying still)
      if (newv < oldv) {
        // positive overflow
        if (getHeight >= 0) {
          setFrame(getX, getY, getWidth, getHeight + newv - Integer.MAX_VALUE)
          if (getHeight < 0) {
            setFrame(getX, getY, getWidth, Integer.MAX_VALUE)
          }
        }
        newv = Integer.MAX_VALUE
      }
    }
    setFrame(getX, newv, getWidth, getHeight)
  }

  /**
    * Resizes the Rectangle both horizontally and vertically.
    * This method modifies the Rectangle so that it is h units larger on both the left and right side, and v units larger at both the top and bottom.
    * The new Rectangle has (x - h, y - v) as its upper-left corner, width of (width + 2h), and a height of (height + 2v).
    * If negative values are supplied for h and v, the size of the Rectangle decreases accordingly. The grow method will check for integer overflow and underflow, but does not check whether the resulting values of width and height grow from negative to non-negative or shrink from non-negative to negative.
    *
    * Literal translation from Java code. Not sure it was a good idea!
    *
    * @param h the horizontal expansion
    * @param v the vertical expansion
    */
  def grow(h: Int, v: Int) {
    var x0 = getX
    var y0 = getY
    var x1 = getWidth
    var y1 = getHeight
    x1 += x0
    y1 += y0
    x0 -= h
    y0 -= v
    x1 += h
    y1 += v
    if (x1 < x0) {
      // Non-existant in X direction
      // Final width must remain negative so subtract x0 before
      // it is clipped so that we avoid the risk that the clipping
      // of x0 will reverse the ordering of x0 and x1.
      x1 -= x0
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE
    } else { // (x1 >= x0)
      // Clip x0 before we subtract it from x1 in case the clipping
      // affects the representable area of the rectangle.
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE
      x1 -= x0
      // The only way x1 can be negative now is if we clipped
      // x0 against MIN and x1 is less than MIN - in which case
      // we want to leave the width negative since the result
      // did not intersect the representable area.
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE
      else if (x1 > Integer.MAX_VALUE) x1 = Integer.MAX_VALUE
    }
    if (y1 < y0) {
      // Non-existant in Y direction
      y1 -= y0
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE
    } else { // (y1 >= y0)
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE
      y1 -= y0
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE
      else if (y1 > Integer.MAX_VALUE) y1 = Integer.MAX_VALUE
    }
    setFrame(x0, y0, x1, y1)
  }

}
