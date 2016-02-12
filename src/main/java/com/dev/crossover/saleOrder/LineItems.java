package com.dev.crossover.saleOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dev.crossover.product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LINE_ITEMS")
public class LineItems {

	@Id
	@Column(name = "LI_CODE")
	private String listItemCode;
	@Column(name = "LI_QUANTITY")
	private String listItemQty;
	@Column(name = "LI_ORDER_NO")
	private String listOrderNo;
	@Column(name = "LI_PRODUCT_ID")
	private String listProductId;
	@ManyToOne
	@JoinColumn(name="LI_PRODUCT_ID", insertable = false, updatable = false)
	private Product product;
	@ManyToOne
	@JoinColumn(name="LI_ORDER_NO", insertable = false, updatable = false)
	private SaleOrders saleOrder;


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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@JsonIgnore
	public SaleOrders getSaleOrder() {
		return saleOrder;
	}

	public void setSaleOrder(SaleOrders saleOrder) {
		this.saleOrder = saleOrder;
	}

	public String getListItemCode() {
		return listItemCode;
	}

	public void setListItemCode(String listItemCode) {
		this.listItemCode = listItemCode;
	}

	public String getListItemQty() {
		return listItemQty;
	}

	public void setListItemQty(String listItemQty) {
		this.listItemQty = listItemQty;
	}

	@Override
	public String toString() {
		return "LineItems [listItemCode=" + listItemCode + ", listItemQty="
				+ listItemQty + ", listOrderNo=" + listOrderNo
				+ ", listProductId=" + listProductId + ", product=" + product
				+ ", saleOrder=" + saleOrder + "]";
	}

}
