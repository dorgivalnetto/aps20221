package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class AliquotaQuinze implements ImpostoDeRenda {

	private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {
		
		if(funcionario.getSalario() > faixa1 && funcionario.getSalario() <= faixa2) {
			double impostoAPagar = funcionario.getSalario() * 0.15 - deducao2;
			System.out.println(funcionario.getNome() + ", a sua alíquota de Imposto de Renda é de 15%, a sua dedução é de " + deducao2);
			System.out.printf("O seu Imposto a Pagar é: %.2f%n", impostoAPagar);
			return impostoAPagar;
		} else {
			return proximo.calculaImposto(funcionario);
		}
	}

	@Override
	public void proximaFaixa(ImpostoDeRenda proximaFaixa) {
		this.proximo = proximaFaixa;		
	}

}
