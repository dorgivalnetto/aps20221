package br.edu.ufca.aps.revisao;

import java.math.BigDecimal;

public class CalculadoraImpostoDeRenda {

	public double calculaImposto(Funcionario funcionario) {
		
		ImpostoDeRenda isento = new AliquotaIsento();
		ImpostoDeRenda faixa1 = new AliquotaSeteEMeio();
		ImpostoDeRenda faixa2 = new AliquotaQuinze();
		ImpostoDeRenda faixa3 = new AliquotaVinteEDoisEMeio();
		ImpostoDeRenda faixa4 = new AliquotaVinteSeteEMeio();
		
		faixa4.proximaFaixa(faixa3);
		faixa3.proximaFaixa(faixa2);
		faixa2.proximaFaixa(faixa1);
		faixa1.proximaFaixa(isento);
		
		return faixa4.calculaImposto(funcionario);
	}
}
