package com.jariast.designpatterns.creational.abstractfactory.model.impl;

import com.jariast.designpatterns.creational.abstractfactory.model.Chair;

public class ChairArtDeco implements Chair {

	@Override
	public String make() {
		return "making ArtDeco Chair";
	}

}
