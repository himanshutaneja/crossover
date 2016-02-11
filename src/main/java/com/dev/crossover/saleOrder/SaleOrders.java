package com.dev.crossover.saleOrder;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@OneToMany(mappedBy="saleOrder")
	private Set<LineItems> lineItems;
	@OneToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="CUST_CODE", insertable = false, updatable = false)
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
