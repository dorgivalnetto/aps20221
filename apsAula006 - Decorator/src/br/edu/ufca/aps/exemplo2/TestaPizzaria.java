package br.edu.ufca.aps.exemplo2;

import java.util.HashMap;

public class TestaPizzaria {

	public static void main(String[] args) {
		HashMap<String, Integer> ingredientes = new HashMap<>();
		ingredientes.put("Mussarela", 15);
		ingredientes.put("Tomate", 3);
		ingredientes.put("Azeitona", 5);
		ingredientes.put("Pepperoni", 12);
		
		Pizza pepperoni = new PizzaDaNona(ingredientes);
		System.out.println("O preço da pizza é: R$" + pepperoni.preco());
		
		Pizza superPizza = new PizzaExtraGrande
				(new BordaRecheada(
						pepperoni));
		
		System.out.println("O preço da pizza é: R$" + superPizza.preco());
		
	}
}
