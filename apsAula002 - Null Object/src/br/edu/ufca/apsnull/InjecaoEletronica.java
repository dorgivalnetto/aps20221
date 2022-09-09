package br.edu.ufca.apsnull;

import br.edu.ufca.aps.Fabricante;

public class InjecaoEletronica implements InjecaoEletronicaImpl{

	 private Fabricante fabricante;
	    
	 public InjecaoEletronica(){
		 /*
		  * Como a classe ObjNuloFabricante trabalha
		  * com herança, em InjecaoEletronica apenas
		  *  precisamos adicionar o construtor para 
		  *  inicializar a variável de instância.
		  */
       fabricante = new ObjNullFabricante( null );
    }
	 
	@Override
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public Fabricante getFabricante() {
		//deve ser independente de entradas externas de dados
		return new ObjNullFabricante( null );
	}

}
