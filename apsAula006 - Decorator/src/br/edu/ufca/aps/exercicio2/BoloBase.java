package br.edu.ufca.aps.exercicio2;

public abstract class BoloBase {

	private String sabor;
	private int preco;
	
	public BoloBase(String sabor){
		this.sabor = sabor;
	}
	
	public abstract double calcularPreco();
}
