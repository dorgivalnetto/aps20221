package apsAula002;

import java.math.BigDecimal;

public class ImpostoStrategyISS implements ImpostoStrategyTipoImposto{

	public BigDecimal calcular(ImpostoCarrinhoPedido p) {
		return p.getValor().multiply(new BigDecimal("0.05"));
	}
}
