package com.jacksondat.designpatterns.creational.abstractfactory.factories;

import com.jacksondat.designpatterns.creational.abstractfactory.Furniture;
import com.jacksondat.designpatterns.creational.abstractfactory.FurnitureArtDeco;
import com.jacksondat.designpatterns.creational.abstractfactory.FurnitureIKEA;
import com.jacksondat.designpatterns.creational.abstractfactory.FurnitureVictorianStyle;

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
