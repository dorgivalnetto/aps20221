package br.edu.ufca.aps.exemplo2;

public class TestaHabitacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdificioComposite predio = new EdificioComposite("Rua Principal");
		EdificioComposite piso1 = new EdificioComposite("Rua Principal - Primeiro Piso");
		
		int primeiroPiso = predio.adicionar(piso1);
		
		SalaLeaf banheiroM = new SalaLeaf("Banheiro Masculino do 1º piso");
		SalaLeaf banheiroF = new SalaLeaf("Banheiro Feminino do 1º piso");
		SalaLeaf salao = new SalaLeaf("Área comum do 1º Piso");
		
		int primeiroM = piso1.adicionar(banheiroM);
		int primeiroF = piso1.adicionar(banheiroF);
		int primeiroS = piso1.adicionar(salao);
		
		predio.enter();
		
		EdificioComposite pisoAtual = (EdificioComposite) predio.getEstrutura(primeiroPiso);
		pisoAtual.enter();
		
		SalaLeaf salaAtual = (SalaLeaf) pisoAtual.getEstrutura(primeiroM);
		salaAtual.enter();
		salaAtual.exit();
		salaAtual = (SalaLeaf) pisoAtual.getEstrutura(primeiroS);
		salaAtual.enter();
		salaAtual.exit();
		salaAtual = (SalaLeaf) pisoAtual.getEstrutura(primeiroF);
		salaAtual.enter();
		
		predio.exit();
		
	}

}
