package com.victor.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
