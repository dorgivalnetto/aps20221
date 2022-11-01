package br.edu.ufca.aps.exemplo02;

import java.sql.Connection;

public class MySqlHelper {
	
		
	public static Connection getMySqlDBConnection() {
		//Obtém a conexão MySql usando os parâmetros de conexão
		return null;
	}
	
	public void gerarRelatorioMySqlPDF(String nomeTabela, Connection con){
		//Obtém os dados da tabela e gera o relatório em PDF
		System.out.println("Gerando o relatório PDF a partir da tabela " + nomeTabela);
	}
	
	public void gerarRelatorioMySqlHTML(String nomeTabela, Connection con){
		//Obtém os dados da tabela e gera o relatório em HTML
		System.out.println("Gerando o relatório HTML a partir da tabela " + nomeTabela);
	}

}
