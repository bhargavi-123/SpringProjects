package com.cg;

public class ExchangeServiceImpl implements ExchangeService {
	private double exchangeRate;

	public ExchangeServiceImpl(double exchangeRate) {
		//super();
		System.out.println("Exchangeserviceimpl()");
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		// TODO Auto-generated method stub
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
