package br.edu.ufca.exemplo2;

public class TestaRequisicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gestor sucessor = null;
		
		Presidente pres = new Presidente(5000, "Presidente", sucessor);
		Diretor dir1 = new Diretor(2000, "Diretor", pres);
		Gerente ger1 = new Gerente(500, "Gerente", dir1);
				
		RequisicaoCompra req1 = new RequisicaoCompra(3000, "Notebook");
		RequisicaoCompra req2 = new RequisicaoCompra(150, "Mouse e Teclado");
		RequisicaoCompra req3 = new RequisicaoCompra(1800, "Mesa digitalizadora");
		RequisicaoCompra req4 = new RequisicaoCompra(6000, "iMac");
		
		Verba v1 = new Verba(450);
		Verba v2 = new Verba(3965);
		Verba v3 = new Verba(1850);
			
		ger1.setSuc(dir1);
		dir1.setSuc(pres);
		
		ger1.aprovarVerba(v1);
		ger1.aprovarVerba(v2);
		ger1.aprovarVerba(v3);
		
		ger1.processarCompra(req1);
		ger1.processarCompra(req2);
		ger1.processarCompra(req3);
		ger1.processarCompra(req4);
		
	}

}
