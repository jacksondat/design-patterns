package com.jacksondat.designpatterns.creational.factorymethod.demo;

import java.util.Random;

import com.jacksondat.designpatterns.creational.factorymethod.business.Logistic;
import com.jacksondat.designpatterns.creational.factorymethod.business.LogisticFactory;

public class Demo {

	public static void main(String[] args) {
		LogisticFactory logisticFactory = new LogisticFactory();
		
		String deliveryType = "road";
		int numDeliveries = new Random().nextInt(5);
		
		Logistic logistic = logisticFactory.getLogistic(deliveryType);
		
		System.out.println("Delivery number by "+deliveryType+": "+numDeliveries);
		for (int i = 0; i < numDeliveries; i++) {
			logistic.createTransport();
		}
		
		logistic.initDelivery();
	}

}
