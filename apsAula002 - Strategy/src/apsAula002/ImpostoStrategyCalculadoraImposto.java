package apsAula002;

import java.math.BigDecimal;

public class ImpostoStrategyCalculadoraImposto {

	public BigDecimal calcular (ImpostoCarrinhoPedido p, ImpostoStrategyTipoImposto i) {
		return i.calcular(p);
	}
}
