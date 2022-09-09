package apsAula002;

import java.math.BigDecimal;

public class ImpostoCarrinhoPedido {

	private BigDecimal valor;

	public ImpostoCarrinhoPedido(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
