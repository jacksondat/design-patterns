package com.jariast.designpatterns.creational.abstractfactory.factories;

import com.jariast.designpatterns.creational.abstractfactory.Furniture;
import com.jariast.designpatterns.creational.abstractfactory.FurnitureArtDeco;
import com.jariast.designpatterns.creational.abstractfactory.FurnitureIKEA;
import com.jariast.designpatterns.creational.abstractfactory.FurnitureVictorianStyle;

public class FurnitureFactory {
	
	public Furniture getFurniture(String furnitureStyle){
		Furniture furniture = null;
		
		switch(furnitureStyle){
		case "IKEA":
			furniture = new FurnitureIKEA();
			break;
		case "ArtDeco":
			furniture = new FurnitureArtDeco();
			break;
		case "VictorianStyle":
			furniture = new FurnitureVictorianStyle();
			break;
		}
		
		return furniture;
	}
	
}
