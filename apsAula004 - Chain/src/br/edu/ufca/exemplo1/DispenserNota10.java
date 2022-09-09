package br.edu.ufca.exemplo1;

public class DispenserNota10 implements DispenserCaixaeletronico {

    private DispenserCaixaeletronico proximoDispenser;
    
       
    @Override
    public void sacar(SaqueDinheiro saque) {
        if (saque.getValor() >= 10) {
            int notas = saque.getValor() / 10;
            System.out.println("Liberando " + notas + " de 10 reais");
            
            int restante = saque.getValor() % 10;
            System.out.println("Estou no dispenser de R$10. Ainda resta sacar: " + restante);
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
