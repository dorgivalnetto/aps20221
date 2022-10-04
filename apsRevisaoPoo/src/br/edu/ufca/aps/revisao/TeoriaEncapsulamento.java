package br.edu.ufca.aps.revisao;

public class TeoriaEncapsulamento {

	/*
	 * Encapsulamento 
	 * O objeto deve esconder seus dados e os detalhes de sua implementação 
	 * Os métodos formam uma “cerca” em torno dos atributos
	 * Os atributos não devem ser manipulados diretamente
	 * Os atributos somente devem ser alterados ou consultados através dos métodos do objeto
	 */

	/*
	 * Herança 
	 * Para viabilizar a hierarquia entre objetos, as classes são organizadas em estruturas hierárquicas
	 * A classe que forneceu os elementos herdados é chamada de superclasse
	 * A classe herdeira é chamada de subclasse
	 * A subclasse pode herdar os métodos e atributos de suas superclasses
	 * A subclasse pode definir novos atributos e métodos específicos
	 */
	
	public class Carro {
		private int velocidade;
		
		public Carro(int velocidadeInicial) {
			velocidade = velocidadeInicial;
		}
		
		public void acelera() {
			velocidade++;
		}
		
		public void frea() {
			velocidade--;
		}
	}
	
	public class CarroInteligente extends Carro {
		public CarroInteligente(int velocidadeInicial) {
			super(velocidadeInicial);
		}
		
		public void estaciona() {
			// código mágico para estacionar sozinho
		}
	}
	
	public static void main(String[] args) {
		CarroInteligente tiguan = new CarroInteligente(10);
		for (int i= 10; i> 0; i--) {
			tiguan.frea();
		}
		tiguan.estaciona();
	}
	
		
}
