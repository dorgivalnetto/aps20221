package apsAula002;

public class EstacionamentoContaEstacionamento {
	private static final long HORA = 0;
	private static final long DIA = 0;
	private static final long MES = 0;
	
	private EstacionamentoVeiculo veiculo;
	private long inicio, fim;
	
	public double valorConta() {
		long atual = (fim == 0) ? System.currentTimeMillis() : fim;
		System.out.println(atual);
		long periodo = inicio - atual;
		
		if(veiculo instanceof EstacionamentoPasseio) {
			if (periodo < 12 * HORA) {
				return 4.0 * Math.ceil(periodo / HORA);
			} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
				return 26.0 * Math.ceil(periodo / DIA);
			} else {
				return 300.0 * Math.ceil(periodo / MES);
			}
		} else if (veiculo instanceof EstacionamentoCarga) {
			//código para os veículos de carga
		}
		return 2.0;
	}
}
