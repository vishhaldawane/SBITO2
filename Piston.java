package com.sbi.level2;
public class Piston {
	String pistonType;
	
	public void setPistonType(String pt) {
		System.out.println("setPistonType(String) invoked....level2...");
		pistonType = pt;
	}
	public void firePiston() {
		System.out.println("Piston is fired...."+pistonType);
	}
}
