package br.edu.ufca.aps.revisao;

public class TeoriaClasse {

	/*
	 * A Classe éo tipo do Objeto Os programadores criam classes, as classes
	 * instanciam objeto
	 * 
	 * Valores têm tipos primitivos: 123 é um valor inteiro; True é um valor
	 * booleano Objetos pertencem a classes: João, Pedro e Paulo são da classe
	 * Pessoa
	 * 
	 * A classe descreve as características e comportamento de um conjunto de
	 * objetos Em Java, cada objeto pertence a uma única classe O objeto possuirá os
	 * atributos e métodos definidos na classe O objeto é chamado de instância de
	 * sua classe 
	 * A classe é o bloco básico para a construção de programas OO
	 */
	/*
	 * public class Carro{ int velocidade;
	 * 
	 * public void acelerar() { System.out.println("Acelerando" + this.velocidade +=
	 * velocidade); } }
	 */
	/*
	 * Criação de Objetos A classe é responsável pela criação de seus objetos via
	 * método construtor
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
	 * 	Utilizado para representar um objeto não inicializado
	 * 	Quando um método retorna um objeto, ele pode retornar null
	 * 	para indicar, por exemplo, que o objeto não foi encontrado
	 */
}
