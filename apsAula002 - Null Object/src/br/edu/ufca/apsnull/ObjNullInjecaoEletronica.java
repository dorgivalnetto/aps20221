package br.edu.ufca.apsnull;

import br.edu.ufca.aps.Fabricante;

public class ObjNullInjecaoEletronica implements InjecaoEletronicaImpl {

    private Fabricante fabricante;
    
    public ObjNullInjecaoEletronica(){

        fabricante = new ObjNullFabricante( null );
    }

    public void setFabricante( Fabricante fabricante ){

        this.fabricante = fabricante;
    }

    public Fabricante getFabricante(){

        return fabricante;
    }
}