package com.springdevsuperior.springprofessional1.services;

import org.springframework.stereotype.Service;

import com.springdevsuperior.springprofessional1.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		Double shipmentPrice=0.0;
		if((order.getBasic()>0) && (order.getBasic()<100)) {
			shipmentPrice=20.00;
		}
		else if(order.getBasic()<200) {
			shipmentPrice=12.00;
		}
		return shipmentPrice;
		
	}
	

}
