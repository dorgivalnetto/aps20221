package br.edu.ufca.exemplo1;

import java.util.Scanner;

public class CaixaEletronico {
    
    protected DispenserCaixaeletronico dispenser100;
  
    public CaixaEletronico() {
        this.dispenser100 = new  DispenserNota100();
              
        DispenserCaixaeletronico dispenser50 = new DispenserNota50();
        this.dispenser100.setProximoElo(dispenser50);
                
        DispenserCaixaeletronico dispenser20 = new DispenserNota20();
        dispenser50.setProximoElo(dispenser20);
              
        DispenserCaixaeletronico dispenser10 = new DispenserNota10();
        dispenser20.setProximoElo(dispenser10);
       
    }
    
    
}