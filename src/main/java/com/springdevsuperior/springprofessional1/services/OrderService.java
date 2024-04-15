package com.springdevsuperior.springprofessional1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdevsuperior.springprofessional1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService service;
	
	public Double total(Order order) {
		Double discount=order.getBasic()*(order.getDiscount()/100);
		Double shipment=service.shipment(order);
		Double total=order.getBasic()-discount+shipment;
		return total;
		
	}
	

}
