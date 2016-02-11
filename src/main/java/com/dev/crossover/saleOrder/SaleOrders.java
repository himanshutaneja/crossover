package com.dev.crossover.saleOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALE_ORDERS")
public class SaleOrders {

	@Id
	@Column(name = "LI_ORDER_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderNo;
	@Column(name = "CUST_CODE")
	private int custCode;
	
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
}
