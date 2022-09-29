package br.edu.ufca.aps.agenciaturismo;

public class ServicoBebidas extends PacoteDecorator {

	public ServicoBebidas(Pacote pacote) {
		super(pacote, "Bebidas", 300.0);
	}	
}
