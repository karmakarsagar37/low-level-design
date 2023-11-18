package com.sagar.systemdesign.lld.strategy.vehicles;

import com.sagar.systemdesign.lld.strategy.drives.Drive;

public class Vehicle {
    Drive drive;
    public Vehicle(Drive drive) {
        this.drive = drive;
    }

    public void driveVehicle() {
        drive.drive();
    }
}
