package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class AliquotaVinteSeteEMeio implements ImpostoDeRenda{

	private ImpostoDeRenda proximo;
	
	@Override
	public double calculaImposto(Funcionario funcionario) {

		if(funcionario.getSalario() > faixa3) {
			double impostoAPagar = funcionario.getSalario() * 0.275 - deducao4; 
			System.out.println(funcionario.getNome() + 
					", a sua al�quota de Imposto de Renda � de 27.5%"
					+ " e a sua dedu��o � de " + deducao4);
			System.out.printf("O seu Imposto a Pagar �: %.2f%n", impostoAPagar);
			return impostoAPagar;
		}
		else {
			//a pr�xima faixa
			return proximo.calculaImposto(funcionario) ;
		}
	}

	@Override
	public void proximaFaixa(ImpostoDeRenda proximaFaixa) {
		this.proximo = proximaFaixa;
	}

}
