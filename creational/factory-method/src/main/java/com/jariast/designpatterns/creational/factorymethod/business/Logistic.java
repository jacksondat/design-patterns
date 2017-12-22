package com.jariast.designpatterns.creational.factorymethod.business;

import java.util.List;

import com.jariast.designpatterns.creational.factorymethod.model.Transport;

public abstract class Logistic {

	protected List<Transport> transports;
	
	public void initDelivery() {
		for (Transport transport : transports) {
			transport.deliver();
		}
	}
	
	public abstract void createTransport();
}
