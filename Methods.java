package com.class1;

//Methods : Blocks to code that perform specific tasks. Code reusable

//void keyword : Indicates a methods doesn't return any value.

// return keyword :
// Note :-> we use return; - exits void method
	//  :-> return value; - exits method and returns some value

//Method Parameters vs Arguments
// **Parameter**: Variable in method declaration
// **Argument**: Actual value passed when calling method
public class Methods {
	
	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	static int add(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	public static void main(String[] args) {
		add(25,30);
		int sum = add(10,20,50);
		System.out.println(sum);
	}
	
}
