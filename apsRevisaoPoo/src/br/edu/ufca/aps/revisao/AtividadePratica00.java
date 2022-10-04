package br.edu.ufca.aps.revisao;

import java.util.Scanner;

public class AtividadePratica00 {

	/*
	 * Escrever um programa que leia o nome de um vendedor, 
	 * o seu salário fixo e o  total de vendas efetuadas por
	 * ele no mês (em dinheiro). Sabendo que este
	 * vendedor ganha 15% de comissão sobre suas vendas 
	 * efetuadas, informar o seu
	 * nome, o salário fixo e salário no final do mês.
	 */

	public static void main(String args[]) {
		
		String nomeVendedor;
		double salarioFixo;  //Salario Fixo do vendedor
		double vendas; // vendas efetuadas pelo vendedor
		double comissao; // comissão de 15% sobre as vendas
		double salarioFinal; //salario final ( fixo + comissao )
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Digite o nome do vendedor:" );
		nomeVendedor = input.nextLine();
		
		System.out.print("Digite o salário fixo do vendedor:" );
		salarioFixo = input.nextDouble();
		
		System.out.print("Digite o total de vendas efetuadas pelo vendedor:" );
		vendas = input.nextDouble();
				
		comissao = ( vendas * 15 ) / 100; 
		
		salarioFinal = comissao + salarioFixo;
		
				
		System.out.println("Nome do Vendedor:" + nomeVendedor);
		System.out.println("Salario Fixo:" +salarioFixo+ "reais");
		System.out.println("Salario Final:" +salarioFinal+ "reais"); 
	}
}
