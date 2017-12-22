package com.jariast.designpatterns.creational.factorymethod.business;

import com.jariast.designpatterns.creational.factorymethod.business.impl.RoadLogistic;
import com.jariast.designpatterns.creational.factorymethod.business.impl.SeaLogistic;

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
