package br.edu.ufca.aps.exemplo2;

public abstract class PizzaDecorator implements Pizza {

	Pizza pizzaDecorada;
	
	public PizzaDecorator(Pizza pizza) {
		pizzaDecorada = pizza;
	}	

}
