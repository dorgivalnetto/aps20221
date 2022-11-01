package br.edu.ufca.aps.exemplo02;

import java.sql.Connection;

public class HelperFacade {
	
	public static void gerarRelatorio(TiposBD tipoBD, TiposRelatorio tipoRelatorio, String nomeTabela) {
		Connection con = null;
		
		switch(tipoBD) {
		case MYSQL:
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			
			switch(tipoRelatorio) {
			case HTML:
				mySqlHelper.gerarRelatorioMySqlHTML(nomeTabela, con);
				break;
			case PDF:
				mySqlHelper.gerarRelatorioMySqlPDF(nomeTabela, con);
				break;
			}
			break;
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(tipoRelatorio) {
			case HTML:
				oracleHelper.gerarRelatorioOracleHTML(nomeTabela, con);
				break;
			case PDF:
				oracleHelper.gerarRelatorioOrcalePDF(nomeTabela, con);
				break;
			}
			break;
		}
	}
	
	public static enum TiposBD{
		MYSQL,
		ORACLE;
	}
	
	public static enum TiposRelatorio{
		HTML,
		PDF;
	}

}
