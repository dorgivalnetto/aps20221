package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class AliquotaSeteEMeio implements ImpostoDeRenda{

private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {
		if(funcionario.getSalario() > isento && funcionario.getSalario() <= faixa1) {
			double impostoAPagar = funcionario.getSalario() * 0.075 - deducao1; 
			System.out.println(funcionario.getNome() + ", a sua alíquota de Imposto de Renda é de 7.5% e a sua dedução é de " + deducao1);
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
