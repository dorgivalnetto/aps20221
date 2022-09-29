package br.edu.ufca.aps.agenciaturismo;

public class TestaPacotesViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("== PACOTE PRAIA (João Pessoa-R$1200): INCLUI BEBIDA (R$300) + MASSAGEM (R$350)");
		Pacote pacotePraia =  
				new ServicoMassagem( 
						new ServicoBebidas( 
						new PacotePraia("João Pessoa", 1200.0) ) );

		System.out.println("DESCRIÇÃO " + pacotePraia.getDesc());
		System.out.println("TOTAL R$ " + pacotePraia.getPreco());
	}

}
