package com.codingdojo.zookeeper1;

public class Gorilla extends Mammal{
	
	//methods:
	public void throwSomething() {
		System.out.println("Gorilla threw something!!!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is satesfied, it loves the banana!");
		energyLevel +=10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		energyLevel -=10;
	}
	

}
