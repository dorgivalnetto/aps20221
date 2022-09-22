package br.edu.ufca.aps.exemplo4;

public class DecoradorCor extends JanelaDecorator {

	private String janelaCor;
	
	public DecoradorCor(Janela janelaDecorada, String janelaCor) {
		super(janelaDecorada);
		this.janelaCor = janelaCor;
	}
	
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando a cor " + janelaCor);
		janelaDecorada.desenhar();
	}	

}
