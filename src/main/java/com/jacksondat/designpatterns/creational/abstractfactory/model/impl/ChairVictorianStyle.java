package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Chair;

public class ChairVictorianStyle implements Chair {

	@Override
	public String make() {
		return "making Victorian Style Chair";
	}

}
