package br.edu.ufca.aps.revisao;

public class TeoriaVariavel {

	/*
	 * Pacotes Java s�o utilizados para organizar as classes
	 * da sua aplica��o, por exemplo, br.edu.ufca.aps.revisao
	 * Para fazer refer�ncia ao tipo TeoriaMetodo que est�
	 * dentro do pacote br.edu.ufca.aps.revisao, n�s podemos
	 * usar a instru��o import.
	 * Para importar todas as classes de um pacote tamb�m 
	 * utilizamos o comando import, mas agora fazemos o uso do *.
	 * Para importar todas as classes do pacote br.edu.ufca.aps.*
	 * N�o podemos ter Classes com o mesmo nome dentro do
	 * mesmo pacote
	 */

	/*
	 * Modificadores de acesso 
	 * public = permite que qualquer outra parte da sua
	 * aplica��o tenha acesso ao componente marcado como public. 
	 * protected = ser�o acess�veis por classes e interfaces dentro do mesmo pacote e por classes
	 * derivadas mesmo que estejam em pacotes diferentes. 
	 * private = s� � acess�vel para a pr�pria classe
	 */

	// package garagem;
	// import garagemdovizinho.Motor;

	public class Carro {
		private String marca;
		protected String cor;
		public Motor motor;

		private void ligar() {
			this.motor.darPartida(); 
			// O m�todo darPartida() do tipo Motor n�o � vis�vel.
		}

		public String toString() {
			return marca + " " + cor + " " + motor.potencia;
		}
	}

	// package garagemdovizinho;

	public class Motor {
		public int potencia;

		private void darPartida() {
		}
	}

	// package garagem;

	public class Fusca extends Carro {

		public Fusca() {
			this.cor = "Branco";
			// O campo Carro.cor n�o � vis�vel.
			this.marca = "VW";
			// O campo Carro.marca n�o � vis�vel.
			this.ligar(); // O m�todo ligar() do tipo Carro n�o � vis�vel.
			this.motor.darPartida(); // O m�todo darPartida() do tipo Motor n�o � vis�vel.
			this.motor.potencia = 100;
			this.toString();
		}
	}

	// package garagemdovizinho;
	// import garagem.Carro;
	public class BrasiliaAmarela extends Carro {

		public BrasiliaAmarela() {
			this.cor = "Branco"; // O campo Carro.cor n�o � vis�vel.
			this.marca = "VW"; // O campo Carro.marca n�o � vis�vel.
			this.ligar(); // O m�todo ligar() do tipo Carro n�o � vis�vel.
			this.motor.darPartida(); // O m�todo darPartida() do tipo Motor n�o � vis�vel.
			this.motor.potencia = 100;
			this.toString();
		}
	}

	/*
	 * Passagem por valor Java copiar� o valor de cada argumento para a respectiva
	 * vari�vel Vari�veis que cont�m tipos primitivos (byte, short, int, long,
	 * float, double, char, boolean) sempre ocupam diretamente uma posi��o na
	 * mem�ria Os nomes das vari�veis podem ser diferentes z = calcula(a, b); public
	 * static double calcula(int x, int y)
	 */

	/*
	 * Passagem por refer�ncia = Reuso da posi��o de mem�ria Vari�veis que cont�m
	 * objetos na verdade guardam a posi��o de mem�ria dos objetos
	 */

	/*
	 * Vari�veis compostas (vetor, array) s�o, na verdade, ponteiros. 
	 * Seus endere�os s�o passados por valor
	 * Se criar uma nova vari�vel, o efeito n�o � notado fora
	 * do m�todo
	 * Se trocar o valor de uma posi��o da vari�vel, o efeito � notado
	 * fora do m�todo
	 */

	public static void mostra(int[] array) {
		System.out.println(array[0] + ", " + array[1]);
	}

	public static void troca(int[] array) {
		array = new int[2];
		array[0] = 20;
		array[1] = 10;
	}

	public static void main(String[] args) {
		int[] array = { 10, 20 };
		mostra(array);
		troca(array);
		mostra(array);
	}

	// Exemplo 2

	/*
	 * public static void mostra(int[] array) { System.out.println(array[0] + ", " +
	 * array[1]); }
	 * 
	 * public static void troca(int[] array) { int tmp = array[0]; array[0] =
	 * array[1]; array[1] = tmp; }
	 * 
	 * public static void main(String[] args) { int[] array = { 10, 20 };
	 * mostra(array); troca(array); mostra(array); }
	 * 
	 */
}
