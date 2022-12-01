package br.edu.ufca.aps.exemplo00;

public class CarroSedan extends Carro{

	public CarroSedan() {
		super(TipoCarro.SEDAN);
		construir();
	}

	
	protected void construir() {
		System.out.println("Construindo um carro sedan");
	}

}
