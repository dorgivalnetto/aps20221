package br.edu.ufca.aps.revisao;

public class TeoriaEncapsulamento {

	/*
	 * Encapsulamento 
	 * O objeto deve esconder seus dados e os detalhes de sua implementa��o 
	 * Os m�todos formam uma �cerca� em torno dos atributos
	 * Os atributos n�o devem ser manipulados diretamente
	 * Os atributos somente devem ser alterados ou consultados atrav�s dos m�todos do objeto
	 */

	/*
	 * Heran�a 
	 * Para viabilizar a hierarquia entre objetos, as classes s�o organizadas em estruturas hier�rquicas
	 * A classe que forneceu os elementos herdados � chamada de superclasse
	 * A classe herdeira � chamada de subclasse
	 * A subclasse pode herdar os m�todos e atributos de suas superclasses
	 * A subclasse pode definir novos atributos e m�todos espec�ficos
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
			// c�digo m�gico para estacionar sozinho
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
