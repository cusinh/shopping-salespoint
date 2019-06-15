package vn.com.itzenk.shopping.ultils;

import java.util.ArrayList;

public class OrderObject {
	ArrayList<String> orderProductName = null;
	ArrayList<String> orderQuantity = null;
	ArrayList<String> orderPrice = null;

	public OrderObject() {
		super();
		orderProductName = new ArrayList<String>();
		orderQuantity = new ArrayList<String>();
		orderPrice = new ArrayList<String>();
	}

	public void addOrderProductName(String content) {
		orderProductName.add(content);
	}

	public void addOrderQuantity(String content) {
		orderQuantity.add(content);
	}

	public void addOrderPrice(String content) {
		orderPrice.add(content);
	}

	public OrderObject(ArrayList<String> orderProductName, ArrayList<String> orderQuantity,
			ArrayList<String> orderPrice) {
		super();
		this.orderProductName = orderProductName;
		this.orderQuantity = orderQuantity;
		this.orderPrice = orderPrice;
	}

	public ArrayList<String> getOrderProductName() {
		return orderProductName;
	}

	public void setOrderProductName(ArrayList<String> orderProductName) {
		this.orderProductName = orderProductName;
	}

	public ArrayList<String> getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(ArrayList<String> orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public ArrayList<String> getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(ArrayList<String> orderPrice) {
		this.orderPrice = orderPrice;
	}

}
