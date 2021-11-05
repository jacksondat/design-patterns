package com.jacksondat.designpatterns.creational.factorymethod.business.impl;

import java.util.ArrayList;

import com.jacksondat.designpatterns.creational.factorymethod.business.Logistic;
import com.jacksondat.designpatterns.creational.factorymethod.model.impl.Truck;

public class RoadLogistic extends Logistic {

	public RoadLogistic() {
		super();
		transports = new ArrayList();
	}
	
	@Override
	public void createTransport() {
		transports.add(new Truck());
	}

}
