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

// According to the precedence rules, how are 3 + 4 -> 5 and 3 -> 4 + 5 evaluated?

// + and -> have the same precedence, so left-associative rules are applied; here, + will be evaluated before ->
println(3 + 4 -> 5)
// + and -> have the same precedence, so left-associative rules are applied; here, -> will be evaluated before +
// Since -> will create a tuple, and tuples don't have the + operation defined, the following line won't compile
// println(3 -> 4 + 5)  // Won't compile!