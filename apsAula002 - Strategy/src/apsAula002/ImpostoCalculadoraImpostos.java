package apsAula002;

import java.math.BigDecimal;

public class ImpostoCalculadoraImpostos {

		public BigDecimal calcular(ImpostoCarrinhoPedido p, ImpostoTipoImposto tipoImposto) {
		switch (tipoImposto) {
		case ICMS: {
			return p.getValor().multiply(new BigDecimal("0.18"));
		}
		case ISS: {
			return p.getValor().multiply(new BigDecimal("0.05"));
		}
		
		default:
			return BigDecimal.ZERO;
		}
		
				
	}
}
