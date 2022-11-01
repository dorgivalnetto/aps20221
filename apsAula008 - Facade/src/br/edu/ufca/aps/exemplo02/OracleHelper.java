package br.edu.ufca.aps.exemplo02;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getOracleDBConnection() {
		//Obtém a conexão Oracle usando os parâmetros de conexão
		return null;
	}
	
	public void gerarRelatorioOrcalePDF(String nomeTabela, Connection con){
		//Obtém os dados da tabela e gera o relatório em PDF
		System.out.println("Gerando o relatório PDF a partir da tabela " + nomeTabela);
	}
	
	public void gerarRelatorioOracleHTML(String nomeTabela, Connection con){
		//Obtém os dados da tabela e gera o relatório em HTML
		System.out.println("Gerando o relatório HTML a partir da tabela " + nomeTabela);
	}
}
