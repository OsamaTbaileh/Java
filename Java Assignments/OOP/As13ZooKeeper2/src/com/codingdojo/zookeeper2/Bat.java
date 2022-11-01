package com.codingdojo.zookeeper2;

public class Bat extends Mammal  {
	
//	methods:
	public void fly() {
		energyLevel -= 50;
		System.out.println("The bat is taking off wooooosh!!");
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("The bat is eating humans UwU");
	}
	
	public void attackTowns() {
		energyLevel -= 100;
		System.out.println("The town in on fire!!");
	}

}
