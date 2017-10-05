package com.gsu.java;

public class massiv {

	public static void main(String[] args) {
		Tribe[] tribes={
			new Tribe("moon", 120, true),
			new Tribe("fire", 50, true),
			new Tribe("wolf", 30, false),
			new Tribe("berd", 25, false),
			new Tribe("bixbi", 68, true),
			new Tribe("rock", 54, false),
			new Tribe("blood", 38, true),
			new Tribe("glob", 19, true),
			new Tribe("flani", 42, true),			
};

	int allQuantity = 0;
	int allTribes = 0;
	int allQuantityknowlege =0;
	for (int i=0; i<tribes.length; i++) {
		System.out.println(tribes[i].toString());
		allQuantity += tribes[i].getQuantity();
		if (tribes[i].isKnowledge()) {
			allTribes ++;
			allQuantityknowlege += tribes[i].getQuantity();
		}
	}
	System.out.println("All Quantity = " + allQuantity);
	System.out.println("All Quantity knowlege = " + allQuantityknowlege);
	System.out.println("All Tribes = " + allTribes);
	}
}


