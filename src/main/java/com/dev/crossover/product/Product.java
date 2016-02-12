package com.dev.crossover.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {

	@Id
	@Column(name = "P_CODE")
	private String code;
	@Column(name = "P_DESCRIPTION")
	private String description;
	@Column(name = "P_PRICE")
	private String price;
	@Column(name = "P_QUANTITY")
	private String quantity;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
