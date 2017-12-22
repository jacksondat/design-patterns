package com.jariast.designpatterns.creational.factorymethod.model.impl;

import com.jariast.designpatterns.creational.factorymethod.model.Transport;

public class Ship implements Transport {

	@Override
	public void deliver() {
		System.out.println("Delivering in a ship");
	}

}
