package br.edu.ufca.aps.agenciaturismo;

public class PacoteDecorator extends Pacote {

	protected Pacote pacote;

	public PacoteDecorator(Pacote pacote, String descServ, 
			double precoServ) {
		super(pacote.getDesc() + " + " + descServ, pacote.getPreco()
				+ precoServ);
		this.pacote = pacote;
	}
}
