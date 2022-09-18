package com.polymorphism;

//class public, abstract and final
class Overiding {

	//constructor is public, protected and private
	private Overiding(){
		System.out.println("parent default constructor.");
	}
	protected void m2() {
		
		System.out.println("Parent Class Method");
	}
	
	public static Overiding getInstance() {
		return new Overiding();
		
	}

}

