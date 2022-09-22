package br.edu.ufca.aps.exemplo4;

public class DecoradorMoldura extends JanelaDecorator {

	public DecoradorMoldura(Janela janelaDecorada) {
		super(janelaDecorada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		moldurarJanela();
		janelaDecorada.desenhar();
	}
	
	public void moldurarJanela() {
		System.out.println("Moldurando a Janela");
	}

}
