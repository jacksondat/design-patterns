package com.jacksondat.designpatterns.creational.abstractfactory;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Chair;
import com.jacksondat.designpatterns.creational.abstractfactory.model.CoffeeTable;
import com.jacksondat.designpatterns.creational.abstractfactory.model.Sofa;

public abstract class Furniture {
	
	protected Chair chair;
	protected Sofa sofa;
	protected CoffeeTable coffeeTable;

	public String makeChair() {
		return chair.make();
	}

	public String makeSofa() {
		return sofa.make();
	}

	public String makeCoffeTable() {
		return coffeeTable.make();
	}

}
