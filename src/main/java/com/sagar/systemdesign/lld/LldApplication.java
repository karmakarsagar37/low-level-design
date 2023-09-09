package com.sagar.systemdesign.lld;

import com.sagar.systemdesign.lld.observer.obersevers.EmailNotificationsImpl;
import com.sagar.systemdesign.lld.observer.obersevers.MobileNotificationsImpl;
import com.sagar.systemdesign.lld.observer.observable.IphoneStocks;
import com.sagar.systemdesign.lld.strategy.vehicles.DailyCar;
import com.sagar.systemdesign.lld.strategy.vehicles.Drozer;
import com.sagar.systemdesign.lld.strategy.vehicles.SportsCar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LldApplication {

	public static void main(String[] args) {
		SpringApplication.run(LldApplication.class, args);
		DailyCar car = new DailyCar();
		car.driveVehicle();
		System.out.println("[----------------------------------]");
		SportsCar car1 = new SportsCar();
		car1.driveVehicle();
		System.out.println("[----------------------------------]");
		Drozer car2 = new Drozer();
		car2.driveVehicle();

		//OBSERVER PATTERN
		System.out.println("[OBSERVER PATTERN]");
		IphoneStocks ob = new IphoneStocks();
		ob.add(new EmailNotificationsImpl());
		ob.add(new MobileNotificationsImpl());
		ob.setStockCount(2);
	}

}

