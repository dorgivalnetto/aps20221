package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class AliquotaVinteEDoisEMeio implements ImpostoDeRenda {

	private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {
		if (funcionario.getSalario() < faixa3 && funcionario.getSalario() >= faixa2) {
			double impostoAPagar = funcionario.getSalario() * 0.225 - deducao3;
			System.out.println(funcionario.getNome() + ", a sua alíquota de Imposto de Renda é de 22.5% e a sua dedução é de " + deducao3);
			System.out.printf("O seu Imposto a Pagar é: %.2f%n", impostoAPagar);
			return impostoAPagar;
		} else {
			return proximo.calculaImposto(funcionario);
		}
		
	}

	@Override
	public void proximaFaixa(ImpostoDeRenda proximaFaixa) {
		// TODO Auto-generated method stub
		this.proximo = proximaFaixa;
	}

}
