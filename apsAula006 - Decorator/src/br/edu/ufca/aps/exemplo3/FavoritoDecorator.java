package br.edu.ufca.aps.exemplo3;

public class FavoritoDecorator extends SorveteDecorator {

	public FavoritoDecorator(Sorvete sorveteEspecial) {
		super(sorveteEspecial);
		// TODO Auto-generated constructor stub
	}
	
	public String fazerSorvete() {
		return sorveteEspecial.fazerSorvete() + adicionarNozes();
	}
	
	public String adicionarNozes() {
		return " adicionando nozes";
	}

}
