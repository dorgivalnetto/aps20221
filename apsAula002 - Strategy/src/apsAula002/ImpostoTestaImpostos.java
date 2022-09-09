package apsAula002;

import java.math.BigDecimal;

public class ImpostoTestaImpostos {

	public static void main (String[] args) {
		ImpostoCarrinhoPedido p1 = new ImpostoCarrinhoPedido(new BigDecimal("100"));
		
		ImpostoCalculadoraImpostos calc = new ImpostoCalculadoraImpostos();
		
		System.out.println("Valor do ICMS: R$" +
				calc.calcular(p1, ImpostoTipoImposto.ICMS));
		
		System.out.println("Valor do ISS: R$" +
				calc.calcular(p1, ImpostoTipoImposto.ISS));
	}
}
