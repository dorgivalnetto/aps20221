package br.edu.ufca.aps.desafio2;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Adicionando recursos de Carro Esportivo");
	}

}
