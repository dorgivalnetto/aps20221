package br.edu.ufca.aps.exemplo01;

public class Singleton {
	
	private static Singleton instanciaUnica = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}

}
