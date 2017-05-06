package com.bwardweb.factory.cake;

public abstract class Cake {
	protected String type;
	
	public void prepare(){
		System.out.println("Preparing " + type);
	}
	
	public void bake(){
		System.out.println("Baking " + type);
	}
	
	public void pack(){
		System.out.println("Packaging " + type);
	}
}
