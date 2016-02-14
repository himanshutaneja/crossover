package com.dev.crossover.saleOrder;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dev.crossover.customer.Customer;

@Entity
@Table(name = "SALE_ORDERS")
public class SaleOrders{

	@Id
	@Column(name = "LI_ORDER_NO")
	private String orderNo;
	@Column(name = "CUST_CODE")
	private String custCode;
	//@OneToMany(mappedBy="saleOrder")
	@OneToMany
	@JoinColumn(name="LI_ORDER_NO", insertable = false, updatable = false)
	private Set<LineItems> lineItems;
	@OneToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="CUST_CODE", insertable = false, updatable = false)
	private Customer customer;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public Set<LineItems> getLineItems() {
		return lineItems;
	}
	public void setLineItems(Set<LineItems> lineItems) {
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
