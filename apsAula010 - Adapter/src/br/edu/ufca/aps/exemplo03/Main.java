package br.edu.ufca.aps.exemplo03;

public class Main {

	public static void main(String[] args) {		
		Pato pato = new PatoVerde();
		pato.voar();
		pato.grasnar();

		PeruPatoAdapter peru = new PeruPatoAdapter();
		peru.voar();
		peru.grasnar();
	}
}
