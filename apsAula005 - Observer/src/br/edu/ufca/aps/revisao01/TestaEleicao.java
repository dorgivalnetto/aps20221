package br.edu.ufca.aps.revisao01;

public class TestaEleicao {

	public static void main(String[] args) {
		Eleicao eleicao = new Eleicao();
		eleicao.adicionar(new ComputaVotos(eleicao));
		eleicao.adicionar(new PublicarResultado(eleicao));
		
		eleicao.atualizarEstado(new Candidato("Pedro Maia", 789));
		eleicao.atualizarEstado(new Candidato("Viserys Targaryen", 1675435));
	}
}
