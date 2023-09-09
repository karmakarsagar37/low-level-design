package com.sagar.systemdesign.lld.strategy.vehicles;

import com.sagar.systemdesign.lld.strategy.drives.NormalDrive;

public class DailyCar extends Vehicle{
    public DailyCar() {
        super(new NormalDrive());
    }
}
