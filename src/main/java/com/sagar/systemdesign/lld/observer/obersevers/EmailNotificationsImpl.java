package com.sagar.systemdesign.lld.observer.obersevers;

public class EmailNotificationsImpl implements NotificationAlert{
    /**
     *
     */
    @Override
    public void update() {
        System.out.println("CustomerNotified via Email!");
    }
}
