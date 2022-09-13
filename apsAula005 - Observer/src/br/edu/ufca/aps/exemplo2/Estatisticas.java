package br.edu.ufca.aps.exemplo2;

public class Estatisticas implements Observer {

	private float maxTemp = 100;
	private float minTemp = 0;
	private float tempSum= 0;
	private int numLeituras;
	private DadosMeteorologicos dados;

	public Estatisticas(DadosMeteorologicos dados) {
		this.dados = dados;
		dados.adicionarObservador(this);
	}

	@Override
	public void atualizar(float temp, float umidade, float pressao) {
		// TODO Auto-generated method stub
		tempSum += temp;
		numLeituras++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}
		exibirAtualizacao();
	}

	@Override
	public void exibirAtualizacao() {
		// TODO Auto-generated method stub
		System.out.println("Média/Max/Min temperature = " + (tempSum / numLeituras)
				+ "/" + maxTemp + "/" + minTemp);
	}
	
}
