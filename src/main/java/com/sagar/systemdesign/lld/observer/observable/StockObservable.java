package com.sagar.systemdesign.lld.observer.observable;

import com.sagar.systemdesign.lld.observer.obersevers.NotificationAlert;

public interface StockObservable {
    public void add(NotificationAlert observer);
    public void remove(NotificationAlert observer);
    public void notifySuscribers();
    public int getStockCount();
    public void setStockCount(int count);
}
