package br.edu.ufca.aps.agenciaturismo;

public class PasseioTuristico extends PacoteDecorator {

	public PasseioTuristico(Pacote pacote) {
		super(pacote, "Passeio tur�stico", 50.0);
	}	
}
