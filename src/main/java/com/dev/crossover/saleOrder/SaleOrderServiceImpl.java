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
//		String writeValueAsString = null;
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		try {
//
//			writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(repository.findAll());
//			System.out.println(writeValueAsString);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return writeValueAsString;
	}

	@Override
	public SaleOrders get(String code) {
		return repository.findOne(code);
	}

	@Override
	public void save(SaleOrders saleOrder) {
		repository.saveAndFlush(saleOrder);
	}

	@Override
	public void delete(String code) {
		repository.delete(code);
	}

}
