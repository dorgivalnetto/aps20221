package apsAula002;

public class EstacionamentoContaEstacionamentoStrategy {

	private CalculoValor calculo;
	private Veiculo veiculo;
	private long inicio;
	private long fim;
	
	public double valorConta() {
		return calculo.calcular(fim-inicio, veiculo);
	}
	
	public void setCalculo(CalculoValor calculo){
		this.calculo = calculo;
	}
