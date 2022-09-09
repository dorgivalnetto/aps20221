package br.edu.ufca.exemplo1;

public interface DispenserCaixaeletronico {

    public void sacar(SaqueDinheiro saque);
    
    public void setProximoElo(DispenserCaixaeletronico proximoElo);
}
