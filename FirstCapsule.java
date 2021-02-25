package com.capsules.project;

public class FirstCapsule { // Class Creation 
	
	int size; // Data members or Variables of the class
	String color;
	int capacity;
	
	void airplaneLanding() { // Behaviors or functions of the class
		System.out.println("Landed");
	}
	void airplaneFlying() {
		System.out.println("Flying");
	}
	
	public static void main(String[] args) { //main function
		FirstCapsule firstCapsule = new FirstCapsule(); // new object creation
		firstCapsule.airplaneFlying(); // accessing class functions with object
		
	}
}
