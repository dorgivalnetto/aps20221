package br.edu.ufca.aps.exemplo1;

public class Mocha extends DecoradorCondimentos {

	/*Uma variável de instância para 
	conter a bebida que estamos englobando*/
	Bebida bebida;
	
	public Mocha(Bebida bebida) {
		this.bebida = bebida;
	}
		
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return bebida.getDescricao() + ", Mocha";
	}
	
	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return 0.50 + bebida.custo();
	}

}
