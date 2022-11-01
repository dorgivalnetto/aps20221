package br.edu.ufca.aps.exemplo00;

public class TouchscreenAdapter 
	implements MaquinaDeCafe {

	private MaquinaCafeAntiga antiga;

	public TouchscreenAdapter(MaquinaCafeAntiga
			antiga) {
		this.antiga = new MaquinaCafeAntiga();
	}
	
	@Override
	public void escolherPrimeiraSelecao() {
		// TODO Auto-generated method stub
		antiga.selecionarA();
	}

	@Override
	public void escolherSegundaSelecao() {
		// TODO Auto-generated method stub
		antiga.selecionarB();
	}
	
}
