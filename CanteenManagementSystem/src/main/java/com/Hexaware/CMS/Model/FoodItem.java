package com.Hexaware.CMS.Model;

public class FoodItem {

	private long itemId;
	private String name;
	private double rate;
	
	public FoodItem(){
		
	}

	public FoodItem(long itemId, String name, double rate) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.rate = rate;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "itemId=" + itemId + ", name=" + name + ", rate=" + rate;
	}
	
	
}
