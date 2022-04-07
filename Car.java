package com.sbi.level2;

public class Car {
	
	Engine engine ; //hasA
	
	public void setEngine(Engine ref) {
		System.out.println("setEngine(Engine ) invoked....level2.");
		engine = ref;
	}
	
	public void startTheCar() {
		engine.startTheEngine();
		System.out.println("Car is started...level2...");
	}
	
	public void stopTheCar() {
		engine.stopTheEngine();
		System.out.println("Car is stopped...level2...");
	}
	
}
