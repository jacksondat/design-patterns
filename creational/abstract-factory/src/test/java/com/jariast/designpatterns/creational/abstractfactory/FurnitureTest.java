package com.jariast.designpatterns.creational.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jariast.designpatterns.creational.abstractfactory.factories.FurnitureFactory;

public class FurnitureTest {

	@Test
	public void FurnitureIKEATest() {
		
		FurnitureFactory furnitureFactory = new FurnitureFactory();
		
		Furniture furnitureIKEA = furnitureFactory.getFurniture("IKEA");
		
		assertEquals(furnitureIKEA.makeChair(),"making IKEA Chair");
		assertEquals(furnitureIKEA.makeSofa(),"making IKEA Sofa");
		assertEquals(furnitureIKEA.makeCoffeTable(),"making IKEA Coffee Table");
	}
	
	@Test
	public void FurnitureArtDecoTest() {
		
		FurnitureFactory furnitureFactory = new FurnitureFactory();
		
		Furniture furnitureArtDeco = furnitureFactory.getFurniture("ArtDeco");
		
		assertEquals(furnitureArtDeco.makeChair(),"making ArtDeco Chair");
		assertEquals(furnitureArtDeco.makeSofa(),"making ArtDeco Sofa");
		assertEquals(furnitureArtDeco.makeCoffeTable(),"making ArtDeco Coffee Table");
	}
	
	@Test
	public void FurnitureVictorianStyleTest() {
		
		FurnitureFactory furnitureFactory = new FurnitureFactory();
		
		Furniture furnitureArtDeco = furnitureFactory.getFurniture("VictorianStyle");
		
		assertEquals(furnitureArtDeco.makeChair(),"making Victorian Style Chair");
		assertEquals(furnitureArtDeco.makeSofa(),"making Victorian Style Sofa");
		assertEquals(furnitureArtDeco.makeCoffeTable(),"making Victorian Style Coffee Table");
	}

}
