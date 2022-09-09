package apsAula002;

import java.math.BigDecimal;

public class ImpostoStrategyICMS implements ImpostoStrategyTipoImposto {

	@Override
	public BigDecimal calcular(ImpostoCarrinhoPedido p) {
			return p.getValor().multiply(new BigDecimal("0.18"));
	}

	
}
