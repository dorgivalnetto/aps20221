package br.edu.ufca.aps.exemplo3;

public class TesteSorvete {
	
	public static void main(String[] args) {
		/*
		 * Composi��o se refere a conter inst�ncias de outras classes que
		 * implementa a funcionalidade desejada.
		 */
		Sorvete sorvete = new EspecialDecorator(
							new FavoritoDecorator(
									new SorveteSimples()));
		System.out.println(sorvete.fazerSorvete());
	}
}
