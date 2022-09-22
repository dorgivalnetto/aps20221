package br.edu.ufca.aps.exemplo4;

public class TestaJanela {

	public static void main(String[] args) {
		
		Janela janelaCasa = new DecoradorMoldura(new JanelaCasa());
		janelaCasa.desenhar();
		
		Janela janelaApartamento = new DecoradorCor(new DecoradorMoldura(new JanelaApartamento()), "Branco");
		janelaApartamento.desenhar();
	}
}
