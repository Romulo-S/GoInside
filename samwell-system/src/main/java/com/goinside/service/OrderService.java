package com.goinside.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goinside.repository.OrdersRepository;

import lombok.Data;

@Service
@Data
public class OrderService {

	@Autowired
	private OrdersRepository ordersRepository;

}
