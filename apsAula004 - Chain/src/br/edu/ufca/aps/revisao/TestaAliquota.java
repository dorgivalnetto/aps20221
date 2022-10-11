package br.edu.ufca.aps.revisao;

public class TestaAliquota {

	/*
	 * Tabela do Imposto de Renda 2022 
	 * Base de cálculo (mensal) - Alíquota - Valor a deduzir do IR
	 * até R$ 1.903,98 - Isento
	 * R$ 0 de R$ 1.903,99 a R$ 2.826,65 	- 7,5% 	- R$ 142,80
	 * de R$ 2.826,66 a R$ 3.751,05 		- 15% 	- R$ 354,80
	 * de R$ 3.751,06 a R$ 4.664,68 		- 22,5% - R$ 636,13
	 * acima de R$ 4.664,68 				- 27,5% - R$ 869,36
	 */
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Paulo",1000);
		
		CalculadoraImpostoDeRenda calc1 = new CalculadoraImpostoDeRenda();
		calc1.calculaImposto(f1);
		
		Funcionario f2 = new Funcionario("Marcela", 2345.98);
		calc1.calculaImposto(f2);
		
		Funcionario f3 = new Funcionario("Inácio", 3751);
		calc1.calculaImposto(f3);
		
		Funcionario f4 = new Funcionario("Fabricia", 4000);
		calc1.calculaImposto(f4);
		
		Funcionario f5 = new Funcionario("Teresa", 6789.23);
		calc1.calculaImposto(f5);
	}
	
}
