package br.edu.ufca.aps;

import br.edu.ufca.apsnull.InjecaoEletronicaImpl;

public class InjecaoEletronica implements InjecaoEletronicaImpl{
	
	private Fabricante fabricante;

    public void setFabricante( Fabricante fabricante ){

        this.fabricante = fabricante;
    }

    public Fabricante getFabricante(){

        return fabricante;
    }
}
