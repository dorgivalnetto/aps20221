package br.edu.ufca.aps.desafio2;

public class TestDecorator {

	public static void main(String[] args) {
		Car sportCar = new SportsCar(new BasicCar());
		sportCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
