package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Sofa;

public class SofaVictorianStyle implements Sofa {

	@Override
	public String make() {
		return "making Victorian Style Sofa";
	}

}
