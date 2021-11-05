package com.jacksondat.designpatterns.creational.abstractfactory;

import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.ChairVictorianStyle;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.CoffeeTableVictorianStyle;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.SofaVictorianStyle;

public class FurnitureVictorianStyle extends Furniture {
	public FurnitureVictorianStyle(){
		chair = new ChairVictorianStyle();
		sofa = new SofaVictorianStyle();
		coffeeTable = new CoffeeTableVictorianStyle();
	}
}
