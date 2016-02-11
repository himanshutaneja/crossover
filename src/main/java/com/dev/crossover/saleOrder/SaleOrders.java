package com.dev.crossover.saleOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dev.crossover.customer.Customer;

@Entity
@Table(name = "SALE_ORDERS")
public class SaleOrders {

	@Id
	@Column(name = "LI_ORDER_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderNo;
	@Column(name = "CUST_CODE")
	private int custCode;
	@OneToMany
	private LineItems lineItems;
	@OneToOne
	private Customer customer;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getCustCode() {
		return custCode;
	}
	public void setCustCode(int custCode) {
		this.custCode = custCode;
	}
	public LineItems getLineItems() {
		return lineItems;
	}
	public void setLineItems(LineItems lineItems) {
		this.lineItems = lineItems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "SaleOrders [orderNo=" + orderNo + ", custCode=" + custCode + ", lineItems=" + lineItems + ", customer="
				+ customer + "]";
	}
}
