package com.id.services;

import org.springframework.stereotype.Service;

@Service
public class PayService {
	
//  dependência
	private TaxService taxService ;
//  dependência
	private DeliverService deliverService;
	
//  construtores:
	public PayService(TaxService taxService, DeliverService deliverService) {
		this.taxService = taxService;
		this.deliverService = deliverService;
	}
	
	public double finalPrice(double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}
