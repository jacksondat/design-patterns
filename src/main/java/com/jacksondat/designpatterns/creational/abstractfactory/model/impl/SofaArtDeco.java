package com.jacksondat.designpatterns.creational.abstractfactory.model.impl;

import com.jacksondat.designpatterns.creational.abstractfactory.model.Sofa;

public class SofaArtDeco implements Sofa {

	@Override
	public String make() {
		return "making ArtDeco Sofa";
	}

}
