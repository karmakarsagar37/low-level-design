package com.sagar.systemdesign.lld.observer.observable;

import com.sagar.systemdesign.lld.observer.obersevers.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocks implements StockObservable {
    /**
     *
     */
    int stockCount = 0;
    List<NotificationAlert> observers = new ArrayList<>();
    @Override
    public void add(NotificationAlert observer) {
        observers.add(observer);
    }

    /**
     *
     */
    @Override
    public void remove(NotificationAlert observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifySuscribers() {
        observers.forEach((observer)-> {
            observer.update();
        });
    }

    /**
     * @return
     */
    @Override
    public int getStockCount() {
        return stockCount;
    }

    /**
     *
     */
    @Override
    public void setStockCount(int count) {
        if(stockCount==0) {
            notifySuscribers();
        }
        stockCount+=count;
    }
}
