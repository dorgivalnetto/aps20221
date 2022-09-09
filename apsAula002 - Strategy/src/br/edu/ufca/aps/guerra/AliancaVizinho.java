package br.edu.ufca.aps.guerra;

public class AliancaVizinho implements Estrategia {

	@Override
	public void atacar() {
		vizinhoPeloNorte();
		atacarPeloSul();
	}

	
	@Override
	public void concluir() {
		dividirBeneficios();
		dividirReconstrucao();
	}

	
	private void atacarPeloSul() {
		// TODO Auto-generated method stub	
	}

	private void vizinhoPeloNorte() {
		// TODO Auto-generated method stub
	}

	private void dividirReconstrucao() {
		// TODO Auto-generated method stub	
	}

	private void dividirBeneficios() {
		// TODO Auto-generated method stub
		
	}

}
