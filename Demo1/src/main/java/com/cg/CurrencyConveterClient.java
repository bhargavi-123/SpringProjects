package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConveterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory =new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter converter = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = converter.dollorsToRupees(50.0);
		System.out.println("50 $ is " + rupees+" Rs.");

	}

}
