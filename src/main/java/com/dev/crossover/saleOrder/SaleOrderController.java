package com.dev.crossover.saleOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleOrderController {

	@Autowired
	private SaleOrderService saleOrderService;

	@RequestMapping(value = "/saleOrders", method = RequestMethod.GET)
	public List<SaleOrders> getAll() {
		return saleOrderService.getAll();
	}

	@RequestMapping(value = "/saleOrders/{code}", method = RequestMethod.GET)
	public SaleOrders get(@PathVariable int code) {
		return saleOrderService.get(code);
	}

	@RequestMapping(value = "/saleOrders", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void save(@RequestBody SaleOrders saleOrder) {
		saleOrderService.save(saleOrder);
	}

	@RequestMapping(value = "/saleOrders/{code}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int code) {
		saleOrderService.delete(code);
	}

}
