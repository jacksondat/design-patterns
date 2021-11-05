package com.jacksondat.designpatterns.creational.abstractfactory;

import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.ChairIKEA;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.CoffeeTableIKEA;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.SofaIKEA;

public class FurnitureIKEA extends Furniture {

	public FurnitureIKEA(){
		chair = new ChairIKEA();
		sofa = new SofaIKEA();
		coffeeTable = new CoffeeTableIKEA();
	}

}
