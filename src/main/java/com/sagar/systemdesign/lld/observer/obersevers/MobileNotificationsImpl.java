package com.sagar.systemdesign.lld.observer.obersevers;

public class MobileNotificationsImpl implements NotificationAlert {
    /**
     *
     */
    @Override
    public void update() {
        System.out.println("CustomerNotified via Mobile Push Notifications!");
    }
}
