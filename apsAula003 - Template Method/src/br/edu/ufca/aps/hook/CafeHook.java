package br.edu.ufca.aps.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CafeHook extends BebidaQuenteHook{

	@Override
	void prepararInfusao() {
		// TODO Auto-generated method stub
		System.out.println("Colocando caf� no filtro");
	}

	@Override
	void adicionarCondimentos() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando a��car e leite");
	}
	
	public boolean clienteQuerCondimento() {
		String resposta = getUserInput();
		if(resposta.toLowerCase().startsWith("s")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String resposta = null;
		System.out.println("Gostaria de leite e a��car no seu caf�?"
				+ " (s)im ou (n)�o?");
		
		BufferedReader in = new BufferedReader
				(new InputStreamReader(System.in));
		
		try {
			resposta = in.readLine();
		}catch (IOException ioe) {
			System.err.println("N�o consegui ler a sua resposta!");
		}
		
		if (resposta == null) {
			return "no";
		} 
		
		return resposta;
	}
}
