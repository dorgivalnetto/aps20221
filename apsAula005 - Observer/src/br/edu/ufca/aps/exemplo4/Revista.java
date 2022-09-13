package br.edu.ufca.aps.exemplo4;

import java.util.ArrayList;

public abstract class Revista {
	
	private ArrayList<FaObserver> fas;
	private String noticia;
	
	public Revista() {
		fas = new ArrayList<FaObserver>();
	}
	
	public void attach(FaObserver f){
		fas.add(f);
	}
	
	public void notificar(){
		for(FaObserver f : fas){
			f.update(this);
		}
	}
	
	public abstract String getState();

}
