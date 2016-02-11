package com.dev.crossover.saleOrder;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface SaleOrderRepository extends JpaRepository<SaleOrders, Integer> {

}
