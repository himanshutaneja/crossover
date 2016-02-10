package com.dev.crossover.customer;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
