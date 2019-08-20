package com.designPatterns.decorator;

public abstract class PizzaDecorator implements Pizza {
	
	@Override
	public String getDesc() {
		return "Toppings";
	}

}
