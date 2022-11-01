package br.edu.ufca.aps.exemplo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaLoja {

	    private static int opcao;

	    public static void main(String args[]) {
	        do {
	            System.out.print("========= Mobile Shop ============ \n");
	            System.out.print("1. IPHONE.              \n");
	            System.out.print("2. SAMSUNG.              \n");
	            System.out.print("3. XIAOMI.                 \n");
	            System.out.print("4. Exit.                   \n");
	            System.out.print("Enter your choice: ");

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            try {
					opcao = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            LojistaFacade lojista = new LojistaFacade();

	            switch (opcao) {
	                case 1:
	                    {
	                        lojista.appleVenda();
	                    }
	                    break;
	                case 2:
	                    {
	                        lojista.samsungVenda();
	                    }
	                    break;
	                case 3:
	                    {
	                        lojista.xiaomiVenda();
	                    }
	                    break;
	                default:
	                    {
	                        System.out.println("Você não comprou um celular!");
	                    }
	                    return;
	            }
	        } while (opcao != 4);
	    }
	}

