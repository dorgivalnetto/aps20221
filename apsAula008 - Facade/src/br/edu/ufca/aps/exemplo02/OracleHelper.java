package br.edu.ufca.aps.exemplo02;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getOracleDBConnection() {
		//Obt�m a conex�o Oracle usando os par�metros de conex�o
		return null;
	}
	
	public void gerarRelatorioOrcalePDF(String nomeTabela, Connection con){
		//Obt�m os dados da tabela e gera o relat�rio em PDF
		System.out.println("Gerando o relat�rio PDF a partir da tabela " + nomeTabela);
	}
	
	public void gerarRelatorioOracleHTML(String nomeTabela, Connection con){
		//Obt�m os dados da tabela e gera o relat�rio em HTML
		System.out.println("Gerando o relat�rio HTML a partir da tabela " + nomeTabela);
	}
}
