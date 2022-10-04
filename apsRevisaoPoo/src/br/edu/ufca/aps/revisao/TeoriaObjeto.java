package br.edu.ufca.aps.revisao;

public class TeoriaObjeto {

	/*
	 * Um objeto é a representação computacional de um elemento ou processo do mundo
	 * real
	 * Cada objeto possui suas característicase seu comportamento
	 * 	*Característica: Uma característica descreve uma propriedade de um objeto, ou seja,
	 *  algum elemento que descreva o objeto
	 *  *Comportamento: Um comportamento representa uma ação ou resposta de um objeto a uma
	 *  ação do mundo real
	 */
	
	/*
	 * Pedido: 12345
	 * Cliente: João da Silva
	 * Endereço: Rua dos Objetos, número 0
	 * Item Produto 	Preço Quantidade Subtotal
	 * 1 	Açúcar		R$2,00		5	 R$ 10,00
	 * 2	Macarrão	R$2,50		2	 R$ 5,00
	 * 3	Feijão		R$3,00		3	 R$ 9,00
	 * 									 TOTAL R$ 24,00
	 * 
	 * Como obter o total da compra?
	 * 	1.O objeto Caixa pediria ao objeto Pedido seu valor total
	 * 	2.O objeto Pedido, por sua vez, percorreria todos os seus objetos Item
	 * 	  perguntando o seu valor subtotal e somaria esses valores para responder
	 *    ao objeto Caixa
	 *  3.Cada objeto Item perguntaria ao objeto Produtoo seu preço e multiplicaria
	 *    esse preço pela quantidade que está sendo comprada, para responder ao objeto
	 *    Pedido
	 */
}
