package br.edu.ufca.aps.exemplo3;

public class EspecialDecorator extends SorveteDecorator{

	public EspecialDecorator(Sorvete sorveteEspecial) {
		super(sorveteEspecial);
		// TODO Auto-generated constructor stub
	}
	
	public String fazerSorvete() {
		return sorveteEspecial.fazerSorvete() + adicionarCobertura();
	}
	
	public String adicionarCobertura() {
		return " adicionando cobrtura";
	}

}
