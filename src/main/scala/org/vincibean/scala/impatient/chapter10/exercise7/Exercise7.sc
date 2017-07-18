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

import org.vincibean.scala.impatient.chapter10.exercise7.{HasSubmachineGun, Soldier, Tank, Tractor}

// Testing (and demonstrating) the silly trait hierarchy example
val jane: Soldier = new Soldier
val metalSlug: Tank = new Tank
val tom: Tractor = new Tractor

jane.shoot()
metalSlug.shoot()
// tom.shoot()  Compilation error here!

// jane.leaveTracks()  Compilation error here!
metalSlug.leaveTracks()
tom.leaveTracks()

val crazyTom = new Tank with HasSubmachineGun
crazyTom.leaveTracks()
crazyTom.shoot()      // crazyTom the tractor has a submachine gun (!), so it can shoot