package com.jariast.designpatterns.creational.abstractfactory.model.impl;

import com.jariast.designpatterns.creational.abstractfactory.model.CoffeeTable;

public class CoffeeTableIKEA implements CoffeeTable {

	@Override
	public String make() {
		return "making IKEA Coffee Table";
	}

}
