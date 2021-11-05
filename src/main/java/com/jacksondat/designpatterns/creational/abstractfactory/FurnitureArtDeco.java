package com.jacksondat.designpatterns.creational.abstractfactory;

import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.ChairArtDeco;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.CoffeeTableArtDeco;
import com.jacksondat.designpatterns.creational.abstractfactory.model.impl.SofaArtDeco;

public class FurnitureArtDeco extends Furniture {

	public FurnitureArtDeco(){
		chair = new ChairArtDeco();
		sofa = new SofaArtDeco();
		coffeeTable = new CoffeeTableArtDeco();
	}

}
