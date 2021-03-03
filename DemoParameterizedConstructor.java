package com.capsules.project;

public class DemoParameterizedConstructor {
	
	int age;
	String name;
	//Java compiler does not provide any default constructor to this class, as the programmer has already defined two constructors, one without parameters and one with parameters.
	DemoParameterizedConstructor(){ //constructor with no parameters, initializes class level variables name and age with fixed values
		this.age = 46;
		this.name = "Lilly";
	}
	 DemoParameterizedConstructor(int age, String name){ //parameterized constructor which initializes class level variables name and age with dynamic values
		 this.age = age;
		 this.name = name;
	 }
	 
	 void display() {
		 System.out.println(name+" "+"is"+" "+age+" "+"years"+" "+"old");
	 }
	 public static void main(String[] args) {
		 DemoParameterizedConstructor obj1 = new DemoParameterizedConstructor();// this instantiation calls the constructor without any parameters and assigns the name Lilly and age 46 to the new object
		 DemoParameterizedConstructor obj2 = new DemoParameterizedConstructor(23, "Katty");// this instantiation calls the parameterized constructor and assigns the values that are passed as parameters during instantiation to the object. Here the values are name:Katty and age:23.
		 obj1.display();
		 obj2.display();
	 }

}
