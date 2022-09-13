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
		System.out.print("Previs�o do Tempo: ");
		if (pressaoAtual > ultimaPressao) {
			System.out.println("O clima est� melhorando!");
		} else if (pressaoAtual == ultimaPressao) {
			System.out.println("Sem altera��o no clima");
		} else if (pressaoAtual < ultimaPressao) {
			System.out.println("Fique atento ao clima mais frio e chuvoso!");
		}
	}

}
