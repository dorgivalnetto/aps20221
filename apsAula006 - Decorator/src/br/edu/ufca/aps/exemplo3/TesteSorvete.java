package br.edu.ufca.aps.exemplo3;

public class TesteSorvete {
	
	public static void main(String[] args) {
		/*
		 * Composição se refere a conter instâncias de outras classes que
		 * implementa a funcionalidade desejada.
		 */
		Sorvete sorvete = new EspecialDecorator(
							new FavoritoDecorator(
									new SorveteSimples()));
		System.out.println(sorvete.fazerSorvete());
	}
}
