package br.edu.ufca.aps.revisao;

public class AliquotaIsento implements ImpostoDeRenda{

private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {
		System.out.println(funcionario.getNome() + ", você está ISENTO de Imposto de Renda!");
		return 0;
	}

	@Override
	public void proximaFaixa(ImpostoDeRenda proximaFaixa) {		
	}
}
