package com.sbi.level2;
public class Engine {
	Piston piston;
	
	public void setPiston(Piston pistRef) {
		System.out.println("setPiston(Piston) invoked.......level2...");
		piston = pistRef;
	}
	
	public void startTheEngine() {
		piston.firePiston();
		System.out.println("Starting the engine...");
	}
	public void stopTheEngine() {
		System.out.println("Stopping the engine...");
	}
}
