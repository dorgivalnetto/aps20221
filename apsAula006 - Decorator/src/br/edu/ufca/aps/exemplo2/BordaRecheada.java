package br.edu.ufca.aps.exemplo2;

public class BordaRecheada extends PizzaDecorator{

	public BordaRecheada(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int preco() {
		// TODO Auto-generated method stub
		return pizzaDecorada.preco() + 10;
	}

}
