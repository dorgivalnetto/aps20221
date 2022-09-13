package br.edu.ufca.aps.exemplo2;

public class TestaEstacaoMeteorologica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DadosMeteorologicos dados1 = new DadosMeteorologicos();
		
		CondicoesAtuais c1 = new CondicoesAtuais(dados1);
		Estatisticas e1 = new Estatisticas(dados1);
		Previsao p1 = new Previsao(dados1);
		
		dados1.configurarMedicoes(23, 59, 1013);
		dados1.configurarMedicoes(34, 26, 1011);
		dados1.configurarMedicoes(28, 40, 1015);
	}

}
