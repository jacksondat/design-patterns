package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.CoffeeTable;

public class CoffeeTableArtDeco implements CoffeeTable {

	@Override
	public String make() {
		return "making ArtDeco Coffee Table";
	}

}
