package br.edu.ufca.aps.exemplo00;

public class CarroLuxo extends Carro {

	public CarroLuxo() {
		super(TipoCarro.LUXO);
		construir();
	}

	protected void construir() {
		System.out.println("Construindo um carro de luxo");
	}

}
