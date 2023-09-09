package com.sagar.systemdesign.lld.strategy.drives;

import com.sagar.systemdesign.lld.strategy.drives.Drive;

public class TunnelDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("[TUNNEL DRIVE] This is a tunnel drive!.");
    }
}
