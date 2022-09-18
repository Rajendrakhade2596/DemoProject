package com.polymorphism;

public class Testing {
	protected void m1() {
		
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {

		Overiding obj = Overiding.getInstance();
		obj.m2();
		Testing obj1 = new Testing();
		obj1.m1();

	}

}
