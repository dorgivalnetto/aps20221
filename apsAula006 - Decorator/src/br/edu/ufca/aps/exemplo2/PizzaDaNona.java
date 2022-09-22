package br.edu.ufca.aps.exemplo2;

import java.util.HashMap;

public class PizzaDaNona implements Pizza{

	private HashMap<String, Integer> ingredientes;
	
	public PizzaDaNona(HashMap<String, Integer> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public int preco() {
		int valor = 0;
		for(Integer i: ingredientes.values())
				valor += i;
		return valor;
	}
}
