package com.cg;

public class CurrencyConverterImpl implements CurrencyConverter {
	private ExchangeService exchangeService;

	public CurrencyConverterImpl() {
		//super();
		System.out.println("CurrencyConverterImpl()");
	}

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public double dollorsToRupees(double dollors) {
		// TODO Auto-generated method stub
		System.out.println("dollorsToRupees()");
		return dollors*exchangeService.getExchangeRate();
	}

}
