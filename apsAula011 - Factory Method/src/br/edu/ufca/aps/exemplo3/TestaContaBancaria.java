package br.edu.ufca.aps.exemplo3;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria contaBancaria = null;
		ContaBancariaFactory contaBancariaFactory 
		= new ContaBancariaFactory();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor digite\n" +
	            " P para conta poupança\n" +
	            " J para conta jurídica\n" +
	            " C para conta corrente\n" +
	            "----------------------------");
		
		String tipoConta = in.nextLine();
		contaBancaria = contaBancariaFactory.
				criarConta(tipoConta);
		contaBancaria.registrarConta();
	}

}
