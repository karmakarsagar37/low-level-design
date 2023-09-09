package com.sagar.systemdesign.lld.strategy.vehicles;

import com.sagar.systemdesign.lld.strategy.drives.SpecialDrive;

public class SportsCar extends Vehicle{
    public SportsCar() {
        super(new SpecialDrive());
    }
}
