package br.edu.ufca.aps;

import java.util.ArrayList;

public class Fabricante {
	private ArrayList<Cambio> cambios;
    
    public Fabricante( ArrayList<Cambio> cambios ){

        this.cambios = cambios;
    }

    public void addCambios( Cambio cambio ){

        this.cambios.add( cambio );
    }

    public Cambio[] getCambios(){

        return (Cambio[]) cambios.toArray();
    }
}
