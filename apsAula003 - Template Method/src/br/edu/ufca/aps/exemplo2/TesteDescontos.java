package br.edu.ufca.aps.exemplo2;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento o1 = new Orcamento(200, 6);
		CalculadoraDescontos calc = new CalculadoraDescontos();
		System.out.println(calc.calcularDesconto(o1));
				
		Orcamento o2 = new Orcamento(1000, 1);
		System.out.println(calc.calcularDesconto(o2));
		

	}

}
