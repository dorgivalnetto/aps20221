package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class AliquotaVinteSeteEMeio implements ImpostoDeRenda{

	private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {

		if(funcionario.getSalario() > faixa3) {
			double impostoAPagar = funcionario.getSalario() * 0.275 - deducao4; 
			System.out.println(funcionario.getNome() + 
					", a sua alíquota de Imposto de Renda é de 27.5%"
					+ " e a sua dedução é de " + deducao4);
			System.out.printf("O seu Imposto a Pagar é: %.2f%n", impostoAPagar);
			return impostoAPagar;
		}
		else {
			//a próxima faixa
			return proximo.calculaImposto(funcionario) ;
		}
	}

	@Override
	public void proximaFaixa(ImpostoDeRenda proximaFaixa) {
		this.proximo = proximaFaixa;
	}

}
