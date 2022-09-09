package br.edu.ufca.apsnull;

import java.util.ArrayList;

import br.edu.ufca.aps.Cambio;
import br.edu.ufca.aps.Fabricante;

public class ObjNullFabricante extends Fabricante {

	public ObjNullFabricante(ArrayList<Cambio> cambios) {
		super(null);
	}
	
	public void addCambios( Cambio cambio ){}

    public Cambio[] getCambios(){

        return new Cambio[ 0 ];
    }

}
