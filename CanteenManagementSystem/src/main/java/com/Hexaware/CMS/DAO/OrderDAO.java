package com.Hexaware.CMS.DAO;

import java.util.List;

import com.Hexaware.CMS.Model.Order;
import com.Hexaware.CMS.Model.OrderDetails;
import com.Hexaware.CMS.Model.OrderStatus;

public interface OrderDAO {

	List<Order> getAll();
	Order getById(long orderId);
	List<OrderDetails> getOrderDetailsById(long orderId);
	Order add(Order order,List<OrderDetails> detials);
	void updateStatus(long orderId,OrderStatus status);
}
