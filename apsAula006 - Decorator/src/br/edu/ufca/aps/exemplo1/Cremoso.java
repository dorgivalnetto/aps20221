package br.edu.ufca.aps.exemplo1;

public class Cremoso extends DecoradorCondimentos {

	Bebida bebida;
	
	public Cremoso(Bebida bebida) {
		this.bebida = bebida;
	}
		
	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return 1.50 + bebida.custo();
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bebida.getDescricao() + ", Café Cremoso";
	}

}
