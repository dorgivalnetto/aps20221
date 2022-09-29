package br.edu.ufca.aps.agenciaturismo;

public class ServicoMassagem extends PacoteDecorator {

	public ServicoMassagem(Pacote pacote) {
		super(pacote, "Massagem", 350.0);
	}	
}
