package br.edu.ufca.aps.exemplo2;

public class Previsao implements Observer {

	private float pressaoAtual;
	private float ultimaPressao;
	private DadosMeteorologicos dados;
	
	public Previsao(DadosMeteorologicos dados) {
		this.dados = dados;
		dados.adicionarObservador(this);
	}
	
	
	@Override
	public void atualizar(float temperatura, float umidade, float pressao) {
		// TODO Auto-generated method stub
		ultimaPressao = pressaoAtual;
		pressaoAtual = pressao;
		exibirAtualizacao();
	}

	@Override
	public void exibirAtualizacao() {
		// TODO Auto-generated method stub
		System.out.print("Previsão do Tempo: ");
		if (pressaoAtual > ultimaPressao) {
			System.out.println("O clima está melhorando!");
		} else if (pressaoAtual == ultimaPressao) {
			System.out.println("Sem alteração no clima");
		} else if (pressaoAtual < ultimaPressao) {
			System.out.println("Fique atento ao clima mais frio e chuvoso!");
		}
	}

}
