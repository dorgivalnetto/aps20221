package br.edu.ufca.aps.desconto;

public class DescontoPercentual implements Desconto{

	private double percentagemDesconto;

	public DescontoPercentual(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

	@Override
	public double calculaDesconto(double valor) {
		return valor * (100 - this.percentagemDesconto) / 100;
	}

}
