package br.edu.ufca.exemplo1;

public class DispenserNota100 implements DispenserCaixaeletronico {

private DispenserCaixaeletronico proximoDispenser;
    
   
    @Override
    public void sacar(SaqueDinheiro saque) {
        if (saque.getValor() >= 100) {
            int notas = saque.getValor() / 100;
            System.out.println("Liberando " + notas + " de 100 reais");
            
            int restante = saque.getValor() % 100;
            System.out.println("Estou no dispenser de R$100."
            		+ " Ainda resta sacar: " + restante);
            if (restante != 0)
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
        } else {
            this.proximoDispenser.sacar(saque);
        }
    }
    
    @Override
    public void setProximoElo(DispenserCaixaeletronico proximoElo) {
        this.proximoDispenser = proximoElo;
    }
   

}
