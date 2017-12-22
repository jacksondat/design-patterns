package com.jariast.designpatterns.creational.factorymethod.business.impl;

import java.util.ArrayList;

import com.jariast.designpatterns.creational.factorymethod.business.Logistic;
import com.jariast.designpatterns.creational.factorymethod.model.impl.Ship;

public class SeaLogistic extends Logistic {

	public SeaLogistic() {
		super();
		transports = new ArrayList();
	}
	
	@Override
	public void createTransport() {
		transports.add(new Ship());
	}

}
