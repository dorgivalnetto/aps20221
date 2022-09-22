package br.edu.ufca.aps.exemplo1;

public class BaseExpresso extends Bebida{

	public BaseExpresso() {
		descricao = "Expresso";
	}
	
	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return 2.00;
	}

	
}
