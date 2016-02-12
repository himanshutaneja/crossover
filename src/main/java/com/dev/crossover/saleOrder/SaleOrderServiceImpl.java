package com.dev.crossover.saleOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleOrderServiceImpl implements SaleOrderService {

	@Autowired
	private SaleOrderRepository repository;
	
	@Override
	public List<SaleOrders> getAll() {
		return repository.findAll();
	}

	@Override
	public SaleOrders get(String code) {
		return repository.findOne(Integer.parseInt(code));
	}

	@Override
	public void save(SaleOrders saleOrder) {
		repository.saveAndFlush(saleOrder);
	}

	@Override
	public void delete(String code) {
		repository.delete(Integer.parseInt(code));
	}

}
