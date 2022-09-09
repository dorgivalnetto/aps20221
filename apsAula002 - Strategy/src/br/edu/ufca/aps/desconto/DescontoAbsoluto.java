package br.edu.ufca.aps.desconto;

public class DescontoAbsoluto implements Desconto{

	private double descontoAbsoluto;
	
	public DescontoAbsoluto(double descontoAbsoluto) {
		this.descontoAbsoluto = descontoAbsoluto;
	}

	public double calculaDesconto(double valor) {
		return valor - this.descontoAbsoluto;
	}
}