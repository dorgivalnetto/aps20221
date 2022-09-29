package br.edu.ufca.aps.exercicio2;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorator {
	
	private List<Cobertura> coberturas;
	
	public Decorator() {
		this.coberturas = new ArrayList<Cobertura>();
	}

	public abstract void adicionarCobertura();
	
	public abstract void adicionarFruta();
	
	public abstract double calcularPreco();
	
}
