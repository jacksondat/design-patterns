package com.jariast.designpatterns.creational.abstractfactory;

import com.jariast.designpatterns.creational.abstractfactory.model.impl.ChairArtDeco;
import com.jariast.designpatterns.creational.abstractfactory.model.impl.CoffeeTableArtDeco;
import com.jariast.designpatterns.creational.abstractfactory.model.impl.SofaArtDeco;

public class FurnitureArtDeco extends Furniture {

	public FurnitureArtDeco(){
		chair = new ChairArtDeco();
		sofa = new SofaArtDeco();
		coffeeTable = new CoffeeTableArtDeco();
	}

}
