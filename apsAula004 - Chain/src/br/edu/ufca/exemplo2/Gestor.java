package br.edu.ufca.exemplo2;

public abstract class Gestor {
	
	protected Gestor suc;
	private double limite;
	private String cargo;
	
	public Gestor(double limite, String cargo, Gestor sucessor){
        this.limite = limite;
        this.cargo = cargo;
        this.suc = sucessor;
    }
	
	public abstract void aprovarVerba(Verba v);
	
	public void processarCompra(RequisicaoCompra req) {
		if (req.getValor() <= limite)
        {
			System.out.println(cargo + " aprovou a compra no valor de " 
								+ req.getValor());
        }
        else if (suc != null) {
            suc.processarCompra(req);
        }
        else{
        	System.out.println("A compra no valor de " + req.getValor()
        		+ " ultrapassa o limite de " + limite 
        		+ " ou o Cargo não possui superior.");
        }
	}
	
	public Gestor getSuc() {
		return suc;
	}

	public void setSuc(Gestor suc) {
		this.suc = suc;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}


