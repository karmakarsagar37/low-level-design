package com.sagar.systemdesign.lld.strategy.drives;

import com.sagar.systemdesign.lld.strategy.drives.Drive;

public class NormalDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("[NORMAL] This is a normal drive!");
    }
}
