package com.class1;


// Object : An object is a instance of class. An instance of a class that occupies memory at runtime.
public class CarObjectClass {

	//variables
	String color;
	int maxSpeed;
	
	//methods
	
	void brake() {
		System.out.println("Applied brake!");
	}
	
	public static void main(String[] args) {
		// to create an object we use "new" keyword. Used to create new objects by allocating memory at runtime.
		
		// syntax : ClassName object_reference_variable_name = new ClassName();
		
		CarObjectClass car = new CarObjectClass();
		
		car.color = "grey";
		car.maxSpeed = 180;
		
		// we use System.out.print() -> to print the output in console 
		//if we use println() method console will point to next line after the output printed
		
		System.out.println("Car Color : "+car.color);
		System.out.println("Car Max Speed : "+car.maxSpeed);
		
		
		// calling or invoking the brake method
		car.brake();
	}
	
}
