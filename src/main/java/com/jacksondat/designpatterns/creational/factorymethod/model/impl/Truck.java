package com.jacksondat.designpatterns.creational.factorymethod.model.impl;

import com.jacksondat.designpatterns.creational.factorymethod.model.Transport;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Delivering in a truck");
	}

}
