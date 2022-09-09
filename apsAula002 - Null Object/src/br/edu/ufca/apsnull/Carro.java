package br.edu.ufca.apsnull;

public class Carro {

	 private InjecaoEletronicaImpl injecaoEletronica;
	    
	 public Carro(){
		 	//inicializar a variável de instância
	        this.injecaoEletronica = new ObjNullInjecaoEletronica();
	    }

	    public void setInjecaoEletronica( InjecaoEletronicaImpl injecaoEletronica ){

	        this.injecaoEletronica = injecaoEletronica;
	    }

	    public InjecaoEletronicaImpl getInjecaoEletronica(){

	        return injecaoEletronica;
	    }
}
