package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Chair;

public class ChairIKEA implements Chair {

	@Override
	public String make() {
		return "making IKEA Chair";
	}

}
