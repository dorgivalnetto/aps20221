package br.edu.ufca.exemplo1;

public class DispenserNota50 implements DispenserCaixaeletronico {

    private DispenserCaixaeletronico proximoDispenser;
    
    @Override
    public void setProximoElo(DispenserCaixaeletronico proximoElo) {
        this.proximoDispenser = proximoElo;
    }
    
    @Override
    public void sacar(SaqueDinheiro saque) {
        if (saque.getValor() >= 50) {
            int notas = saque.getValor() / 50;
            System.out.println("Liberando " + notas + " de 50 reais");
            
            int restante = saque.getValor() % 50;
            System.out.println("Estou no dispenser de R$50. Ainda resta sacar: " + restante);
            if (restante != 0)
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
        } else {
            this.proximoDispenser.sacar(saque);
        }
    }
}