package apsAula002;

public class EstacionamentoCalculoDiaria implements EstacionamentoCalculoValor{

	private static final long HORA = 0;
	
	private double valorDiaria;
	
	public EstacionamentoCalculoDiaria(double valorDiaria){
		this.valorDiaria = valorDiaria;
	}

	public double calcular(long periodo, EstacionamentoVeiculo v) {
		return valorDiaria * Math.ceil(periodo / HORA);
	}
}
