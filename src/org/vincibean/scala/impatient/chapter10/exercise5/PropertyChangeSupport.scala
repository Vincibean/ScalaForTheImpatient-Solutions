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

package org.vincibean.scala.impatient.chapter10.exercise5

import java.beans.{PropertyChangeSupport => JavaPropertyChangeSupport, PropertyChangeListener}

/**
  * The JavaBeans specification has the notion of a property change listener, a
  * standardized way for beans to communicate changes in their properties. The
  * PropertyChangeSupport class is provided as a convenient superclass for any bean
  * that wishes to support property change listeners. Unfortunately, a class that
  * already has another superclass - such as JComponent - must reimplement the
  * methods. Reimplement PropertyChangeSupport as a trait, and mix it into
  * the Java.awt.Point class.
  *
  * Created by Vincibean on 07/02/16.
  */
trait PropertyChangeSupport {

  val propertyChangeSupport: JavaPropertyChangeSupport = new JavaPropertyChangeSupport()

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = {
    propertyChangeSupport.addPropertyChangeListener(listener)
  }

  def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = {
    propertyChangeSupport.addPropertyChangeListener(propertyName, listener)
  }

  def removePropertyChangeListener(listener: PropertyChangeListener): Unit = {
    propertyChangeSupport.removePropertyChangeListener(listener)
  }

  def getPropertyChangeListeners = {
    propertyChangeSupport.getPropertyChangeListeners
  }

  def hasListeners(listenerName: String) = {
    propertyChangeSupport.hasListeners(listenerName)
  }

}
