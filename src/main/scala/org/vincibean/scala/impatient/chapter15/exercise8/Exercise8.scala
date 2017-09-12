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

package org.vincibean.scala.impatient.chapter15.exercise8

/**
  * Add the allDifferent method to an object, compile and look at the bytecode.
  * What methods did the @specialized annotation generate?
  */
object Exercise8 {

  /**
    * This is the bytecode inspected with the javap tool:
    *
    *   Compiled from "Exercise8.scala"
    *   public final class org.vincibean.scala.impatient.chapter15.exercise8.Exercise8$ {
    *     public static org.vincibean.scala.impatient.chapter15.exercise8.Exercise8$ MODULE$;
    *     public static {};
    *     public <T> boolean allDifferent(T, T, T);
    *     public boolean allDifferent$mZc$sp(boolean, boolean, boolean);
    *     public boolean allDifferent$mBc$sp(byte, byte, byte);
    *     public boolean allDifferent$mCc$sp(char, char, char);
    *     public boolean allDifferent$mDc$sp(double, double, double);
    *     public boolean allDifferent$mFc$sp(float, float, float);
    *     public boolean allDifferent$mIc$sp(int, int, int);
    *     public boolean allDifferent$mJc$sp(long, long, long);
    *     public boolean allDifferent$mSc$sp(short, short, short);
    *     public boolean allDifferent$mVc$sp(scala.runtime.BoxedUnit, scala.runtime.BoxedUnit, scala.runtime.BoxedUnit);
    *     private org.vincibean.scala.impatient.chapter15.exercise8.Exercise8$();
    *   }
    *
    * This means that the following methods are generated: one generic method, one for BoxedUnit and eight methods for
    * the primitive types.
    * In detail:
    *
    *     public <T> boolean allDifferent(T, T, T);
    *     public boolean allDifferent$mZc$sp(boolean, boolean, boolean);
    *     public boolean allDifferent$mBc$sp(byte, byte, byte);
    *     public boolean allDifferent$mCc$sp(char, char, char);
    *     public boolean allDifferent$mDc$sp(double, double, double);
    *     public boolean allDifferent$mFc$sp(float, float, float);
    *     public boolean allDifferent$mIc$sp(int, int, int);
    *     public boolean allDifferent$mJc$sp(long, long, long);
    *     public boolean allDifferent$mSc$sp(short, short, short);
    *     public boolean allDifferent$mVc$sp(scala.runtime.BoxedUnit, scala.runtime.BoxedUnit, scala.runtime.BoxedUnit);
    * 
    */
  def allDifferent[@specialized T](x: T, y: T, z: T): Boolean = x != y && x != z && y != z

}
