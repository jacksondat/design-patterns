package com.jacksondat.designpatterns.creational.factorymethod.business;

import com.jacksondat.designpatterns.creational.factorymethod.business.impl.RoadLogistic;
import com.jacksondat.designpatterns.creational.factorymethod.business.impl.SeaLogistic;

public class LogisticFactory {
	
	public Logistic getLogistic(String logisticType) {
		Logistic logistic = null;
		
		switch(logisticType) {
		case "road":
			logistic = new RoadLogistic();
			break;
		case "sea":
			logistic = new SeaLogistic();
			break;
		}
		
		return logistic;
	}
}
