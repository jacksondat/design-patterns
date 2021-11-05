package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Chair;

public class ChairArtDeco implements Chair {

	@Override
	public String make() {
		return "making ArtDeco Chair";
	}

}
