package com.dev.crossover.saleOrder;

import java.util.List;

public interface SaleOrderService {

	List<SaleOrders> getAll();

	SaleOrders get(int code);

	void save(SaleOrders saleOrder);

	void delete(int code);

}
