package br.edu.ufca.aps.revisao;

public class TeoriaClasse {

	/*
	 * A Classe �o tipo do Objeto Os programadores criam classes, as classes
	 * instanciam objeto
	 * 
	 * Valores t�m tipos primitivos: 123 � um valor inteiro; True � um valor
	 * booleano Objetos pertencem a classes: Jo�o, Pedro e Paulo s�o da classe
	 * Pessoa
	 * 
	 * A classe descreve as caracter�sticas e comportamento de um conjunto de
	 * objetos Em Java, cada objeto pertence a uma �nica classe O objeto possuir� os
	 * atributos e m�todos definidos na classe O objeto � chamado de inst�ncia de
	 * sua classe 
	 * A classe � o bloco b�sico para a constru��o de programas OO
	 */
	/*
	 * public class Carro{ int velocidade;
	 * 
	 * public void acelerar() { System.out.println("Acelerando" + this.velocidade +=
	 * velocidade); } }
	 */
	/*
	 * Cria��o de Objetos A classe � respons�vel pela cria��o de seus objetos via
	 * m�todo construtor
	 */
	public class Carro {
		int velocidade;

		public Carro(int velocidadeInicial) {
			velocidade = velocidadeInicial;
		}

		public void acelerar() {
			System.out.println("Acelerando");
			velocidade++;
		}

		public void frear() {
			System.out.println("Freando");
			velocidade--;
		}
	}

	/*
	 * Objetos devem ser instanciados antes de utilizados O comando new instancia um
	 * objeto, chamando o seu construtor
	 */

	public static void main(String[] args) {
		Carro fusca = new Carro(10);
		Carro bmw = new Carro(15);
		fusca.frear();
		bmw.acelerar();
		// o que acontece a seguir?
		fusca = bmw;
	}

	/*
	 * Valor null:
	 * 	Utilizado para representar um objeto n�o inicializado
	 * 	Quando um m�todo retorna um objeto, ele pode retornar null
	 * 	para indicar, por exemplo, que o objeto n�o foi encontrado
	 */
}
