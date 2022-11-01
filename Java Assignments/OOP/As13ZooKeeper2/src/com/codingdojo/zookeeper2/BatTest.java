package com.codingdojo.zookeeper2;

public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat();
		
		bat.attackTowns();
		bat.attackTowns();
		bat.attackTowns();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.fly();
		
		System.out.println(bat.displayEnergy());

	}

}
