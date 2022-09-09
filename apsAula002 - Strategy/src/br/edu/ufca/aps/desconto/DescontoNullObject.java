package br.edu.ufca.aps.desconto;

public class DescontoNullObject implements Desconto {

	@Override
	public double calculaDesconto(double valor) {
		return valor;
	}

}
