package com.jariast.designpatterns.creational.abstractfactory.model.impl;

import com.jariast.designpatterns.creational.abstractfactory.model.Chair;

public class ChairIKEA implements Chair {

	@Override
	public String make() {
		return "making IKEA Chair";
	}

}
