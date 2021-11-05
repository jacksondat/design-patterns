package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.CoffeeTable;

public class CoffeeTableVictorianStyle implements CoffeeTable {

	@Override
	public String make() {
		return "making Victorian Style Coffee Table";
	}

}
