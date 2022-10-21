package br.edu.ufca.aps.desafio3;

public class TestaCasaTemplate {

	 public static void main(String[] args) {
			
		Casa houseType = new CasaDeMadeira();
			
		houseType.construirCasa();
			System.out.println("************");
			
		houseType = new CasaDeVidro();
			
		houseType.construirCasa();
		}
}

