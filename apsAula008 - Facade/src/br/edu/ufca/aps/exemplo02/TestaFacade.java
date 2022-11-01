package br.edu.ufca.aps.exemplo02;

import java.sql.Connection;

public class TestaFacade {

	public static void main(String[] args) {
		
		String nomeTabela = "Funcionario";
				
		//gerando relatórios MySQL e Oracle sem utilizar fachada
		Connection con1 = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.gerarRelatorioMySqlHTML(nomeTabela, con1);
		
		Connection con2 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.gerarRelatorioOrcalePDF(nomeTabela, con2);
		
		//gerando relatórios MySQL e Oracle utilizando fachada
		HelperFacade.gerarRelatorio(HelperFacade.TiposBD.MYSQL, HelperFacade.TiposRelatorio.HTML, nomeTabela);
		HelperFacade.gerarRelatorio(HelperFacade.TiposBD.ORACLE, HelperFacade.TiposRelatorio.PDF, nomeTabela);
		
	}
}
