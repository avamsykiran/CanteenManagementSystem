package com.Hexaware.CMS.Model;

public class OrderDetails {

	private long orderId;
	private long foodItemId;
	private int quantity;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(long orderId, long foodItemId, int quantity) {
		super();
		this.orderId = orderId;
		this.foodItemId = foodItemId;
		this.quantity = quantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getFoodItemId() {
		return foodItemId;
	}

	public void setFoodItemId(long foodItemId) {
		this.foodItemId = foodItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "orderId=" + orderId + ", foodItemId=" + foodItemId + ", quantity=" + quantity;
	}
	
	
}
