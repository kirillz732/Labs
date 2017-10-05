package com.gsu.java;


public class Tribe {
	private String names;
	private int quantity;
	private boolean knowledge;
	public Tribe(String names, int quantity, boolean knowledge) {
		this.names = names;
		this.quantity = quantity;
		this.knowledge = knowledge;
}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isKnowledge() {
		return knowledge;
	}
	public void setKnowledge(boolean knowledge) {
		this.knowledge = knowledge;
	} 
	@Override
	public String toString() {
		return "Tribe{" + "names=" + names +", quantity = " +quantity+ ", knowlege = " + knowledge +'}';
	}
}