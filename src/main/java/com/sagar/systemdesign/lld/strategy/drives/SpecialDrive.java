package com.sagar.systemdesign.lld.strategy.drives;

import com.sagar.systemdesign.lld.strategy.drives.Drive;

public class SpecialDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("[SPECIAL DRIVE] This is a special drive!");
    }
}
