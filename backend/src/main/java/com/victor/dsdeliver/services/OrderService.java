package com.victor.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.victor.dsdeliver.dto.OrderDto;
import com.victor.dsdeliver.dto.ProductDto;
import com.victor.dsdeliver.entities.Order;
import com.victor.dsdeliver.entities.OrderStatus;
import com.victor.dsdeliver.entities.Product;
import com.victor.dsdeliver.repositories.OrderRepository;
import com.victor.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDto> findAll(){
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
	}
	
	@Transactional	
	public OrderDto insert(OrderDto dto){
		Order order = new Order(8 , dto.getAddress(), dto.getLatitude(), dto.getLongitude(), 
				Instant.now(), OrderStatus.PENDING);
		for (ProductDto p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		
		order = repository.save(order);
		return new OrderDto(order);
	}
	
}
