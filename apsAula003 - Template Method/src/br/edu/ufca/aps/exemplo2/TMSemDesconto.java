package br.edu.ufca.aps.exemplo2;

public class TMSemDesconto extends TMDesconto{

	public TMSemDesconto() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean deveAplicarDesconto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	protected double efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

}