package br.edu.ufca.aps.revisao;

public class TeoriaVariavel {

	/*
	 * Pacotes Java são utilizados para organizar as classes
	 * da sua aplicação, por exemplo, br.edu.ufca.aps.revisao
	 * Para fazer referência ao tipo TeoriaMetodo que está
	 * dentro do pacote br.edu.ufca.aps.revisao, nós podemos
	 * usar a instrução import.
	 * Para importar todas as classes de um pacote também 
	 * utilizamos o comando import, mas agora fazemos o uso do *.
	 * Para importar todas as classes do pacote br.edu.ufca.aps.*
	 * Não podemos ter Classes com o mesmo nome dentro do
	 * mesmo pacote
	 */

	/*
	 * Modificadores de acesso 
	 * public = permite que qualquer outra parte da sua
	 * aplicação tenha acesso ao componente marcado como public. 
	 * protected = serão acessíveis por classes e interfaces dentro do mesmo pacote e por classes
	 * derivadas mesmo que estejam em pacotes diferentes. 
	 * private = só é acessível para a própria classe
	 */

	// package garagem;
	// import garagemdovizinho.Motor;

	public class Carro {
		private String marca;
		protected String cor;
		public Motor motor;

		private void ligar() {
			this.motor.darPartida(); 
			// O método darPartida() do tipo Motor não é visível.
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
			// O campo Carro.cor não é visível.
			this.marca = "VW";
			// O campo Carro.marca não é visível.
			this.ligar(); // O método ligar() do tipo Carro não é visível.
			this.motor.darPartida(); // O método darPartida() do tipo Motor não é visível.
			this.motor.potencia = 100;
			this.toString();
		}
	}

	// package garagemdovizinho;
	// import garagem.Carro;
	public class BrasiliaAmarela extends Carro {

		public BrasiliaAmarela() {
			this.cor = "Branco"; // O campo Carro.cor não é visível.
			this.marca = "VW"; // O campo Carro.marca não é visível.
			this.ligar(); // O método ligar() do tipo Carro não é visível.
			this.motor.darPartida(); // O método darPartida() do tipo Motor não é visível.
			this.motor.potencia = 100;
			this.toString();
		}
	}

	/*
	 * Passagem por valor Java copiará o valor de cada argumento para a respectiva
	 * variável Variáveis que contêm tipos primitivos (byte, short, int, long,
	 * float, double, char, boolean) sempre ocupam diretamente uma posição na
	 * memória Os nomes das variáveis podem ser diferentes z = calcula(a, b); public
	 * static double calcula(int x, int y)
	 */

	/*
	 * Passagem por referência = Reuso da posição de memória Variáveis que contêm
	 * objetos na verdade guardam a posição de memória dos objetos
	 */

	/*
	 * Variáveis compostas (vetor, array) são, na verdade, ponteiros. 
	 * Seus endereços são passados por valor
	 * Se criar uma nova variável, o efeito não é notado fora
	 * do método
	 * Se trocar o valor de uma posição da variável, o efeito é notado
	 * fora do método
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
