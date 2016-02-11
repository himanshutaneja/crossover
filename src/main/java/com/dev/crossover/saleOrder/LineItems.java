package com.dev.crossover.saleOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LINE_ITEMS")
public class LineItems {

	@Id
	@Column(name = "LI_CODE")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int listItemCode;
	@Column(name = "LI_QUANTITY")
	private int listItemQty;
	@Column(name = "LI_ORDER_NO")
	private String listOrderNo;
	@Column(name = "LI_PRODUCT_ID")
	private String listProductId;
	
	public int getListItemCode() {
		return listItemCode;
	}
	public void setListItemCode(int listItemCode) {
		this.listItemCode = listItemCode;
	}
	public int getListItemQty() {
		return listItemQty;
	}
	public void setListItemQty(int listItemQty) {
		this.listItemQty = listItemQty;
	}
	public String getListOrderNo() {
		return listOrderNo;
	}
	public void setListOrderNo(String listOrderNo) {
		this.listOrderNo = listOrderNo;
	}
	public String getListProductId() {
		return listProductId;
	}
	public void setListProductId(String listProductId) {
		this.listProductId = listProductId;
	}
	
}
