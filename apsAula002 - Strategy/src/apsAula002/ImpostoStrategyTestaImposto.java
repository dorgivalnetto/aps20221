package apsAula002;

import java.math.BigDecimal;

public class ImpostoStrategyTestaImposto {

	public static void main(String[] args) {
		
		ImpostoCarrinhoPedido p = 
				new ImpostoCarrinhoPedido(new BigDecimal("100"));
		
		ImpostoStrategyCalculadoraImposto sCalc = 
				new ImpostoStrategyCalculadoraImposto();
		
		System.out.println("Valor do ICMS: R$ " 
		+ sCalc.calcular(p, new ImpostoStrategyICMS()));
		
		System.out.println("Valor do ISS: R$ "
		+ sCalc.calcular(p, new ImpostoStrategyISS()));
	}

}
