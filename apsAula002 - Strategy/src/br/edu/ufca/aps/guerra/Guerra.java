package br.edu.ufca.aps.guerra;

public class Guerra {

	private Estrategia acao;
	private Inimigo inimigo;
	
	public void definirEstrategia() {
		if (inimigo.exercito() > 10000) {
			acao = new AliancaVizinho();
		} else if (inimigo.isNuclear()) {
			acao = new Diplomacia();
		} else if (inimigo.hasNoChance()) {
			acao = new AtacarSozinho();
		}
	}
	
	public void declararGuerra() {
		acao.atacar();
	}
	
	public void encerrarGuerra() {
		acao.concluir();
	}
	
}
