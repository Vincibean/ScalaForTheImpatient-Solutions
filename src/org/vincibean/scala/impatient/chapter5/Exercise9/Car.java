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

package org.vincibean.scala.impatient.chapter5.Exercise9;

/**
 * Reimplement the class of the preceding exercise in Java, C#, or C++ (your
 * choice). How much shorter is the Scala class?
 *
 * Created by Vincibean on 19/01/16.
 */
public class Car {

    private final String manufacturer;
    private final String modelName;
    private final int modelYear;
    private String licensePlate;

    public Car(final String manufacturer, final String modelName, final int modelYear, final String licensePlate) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public Car(final String manufacturer, final String modelName) {
        this(manufacturer, modelName, -1, "");
    }

    public Car(final String manufacturer, final String modelName, final int modelYear) {
        this(manufacturer, modelName, modelYear, "");
    }

    public Car(final String manufacturer, final String modelName, final String licensePlate) {
        this(manufacturer, modelName, -1, licensePlate);
    }

    // It is apparent how much shorter the Scala class is.

    // Getters and Setters aren't required, but help in understanding which constructor parameters
    // are read-only and which are read-write; moreover, in the previous solution Scala's compiler built
    // its own, so this helps in understanding how Scala can be concise.

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(final String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
