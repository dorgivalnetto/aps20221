package br.edu.ufca.aps.exemplo02;

public class Main {

	public static void main(String[] args) {
		CaldeiraChocolate boiler = CaldeiraChocolate.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		CaldeiraChocolate boiler2 = CaldeiraChocolate.getInstance();
	}
}
