package com.sagar.systemdesign.lld.strategy.vehicles;

import com.sagar.systemdesign.lld.strategy.drives.TunnelDrive;

public class Drozer extends Vehicle{
    public Drozer() {
        super(new TunnelDrive());
    }
}
