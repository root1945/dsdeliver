package com.victor.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.victor.dsdeliver.dto.ProductDto;
import com.victor.dsdeliver.entities.Product;
import com.victor.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDto> findAll(){
		List<Product> list = repository.findAllByOrderByNameDesc();
		return list.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
	}
}
