package com.sample.common;

 

class Bulb {
	// Enums
	enum BulbSize {
		SMALL, MEDIUM, LARGE
	}

	BulbSize size;
	// Other bulb class fields and methods.
}

public class Enums {
	public static void main(String[] args) {
		Bulb b = new Bulb();
		b.size = Bulb.BulbSize.MEDIUM;
		System.out.println("Bulb Size :" + b.size);
	}
}