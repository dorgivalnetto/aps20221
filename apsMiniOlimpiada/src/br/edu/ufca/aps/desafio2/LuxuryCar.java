package br.edu.ufca.aps.desafio2;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Adicionando recursos de Carro de Luxo");
	}

}
