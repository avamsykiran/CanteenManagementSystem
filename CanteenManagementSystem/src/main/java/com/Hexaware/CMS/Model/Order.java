package com.Hexaware.CMS.Model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Order {

	private long orderId;
	private long custoemrId;
	private long vendorId;
	private double orderValue;
	private LocalDateTime orderDT;
	private Duration estiamtedTimeOfArriaval;
	private OrderStatus status;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(long orderId, long custoemrId, long vendorId, double orderValue, LocalDateTime orderDT,
			Duration estiamtedTimeOfArriaval,OrderStatus status) {
		super();
		this.orderId = orderId;
		this.custoemrId = custoemrId;
		this.vendorId = vendorId;
		this.orderValue = orderValue;
		this.orderDT = orderDT;
		this.estiamtedTimeOfArriaval = estiamtedTimeOfArriaval;
		this.status=status;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getCustoemrId() {
		return custoemrId;
	}

	public void setCustoemrId(long custoemrId) {
		this.custoemrId = custoemrId;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public LocalDateTime getOrderDT() {
		return orderDT;
	}

	public void setOrderDT(LocalDateTime orderDT) {
		this.orderDT = orderDT;
	}

	public Duration getEstiamtedTimeOfArriaval() {
		return estiamtedTimeOfArriaval;
	}

	public void setEstiamtedTimeOfArriaval(Duration estiamtedTimeOfArriaval) {
		this.estiamtedTimeOfArriaval = estiamtedTimeOfArriaval;
	}

	
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "orderId=" + orderId + ", custoemrId=" + custoemrId + ", vendorId=" + vendorId + ", orderValue="
				+ orderValue + ", orderDT=" + orderDT + ", estiamtedTimeOfArriaval=" + estiamtedTimeOfArriaval+"\tStatus="+status;
	}
	
	
}
