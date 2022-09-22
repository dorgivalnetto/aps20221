package br.edu.ufca.aps.exemplo2;

public class PizzaExtraGrande extends PizzaDecorator {

	public PizzaExtraGrande(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int preco() {
		// TODO Auto-generated method stub
		return (int) (pizzaDecorada.preco() * 1.3);
	}

}
