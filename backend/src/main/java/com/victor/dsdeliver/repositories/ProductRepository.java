package com.victor.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findAllByOrderByNameDesc();
}
