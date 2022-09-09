package br.edu.ufca.exemplo1;

import java.util.Scanner;

public class TestaCaixaEletronico {

	public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();

        //while(true) {
            int valor = 0;
            System.out.println("Informe uma quantia para saque");
            Scanner input = new Scanner(System.in);
            valor = input.nextInt();
          
            if (valor % 10 != 0) {
                System.out.println("O valor deve ser em múltiplos de 10");
            }
            caixa.dispenser100.sacar(new SaqueDinheiro(valor));
       // }
    }
}
