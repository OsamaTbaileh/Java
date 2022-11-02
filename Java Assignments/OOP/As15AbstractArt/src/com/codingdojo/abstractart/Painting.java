package com.codingdojo.abstractart;

public class Painting extends Art {
	String paintType;

	@Override
	public void viewArt() {
		System.out.println("This is a painting.");
	}

}
