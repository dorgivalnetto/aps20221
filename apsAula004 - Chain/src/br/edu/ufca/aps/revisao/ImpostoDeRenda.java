package br.edu.ufca.aps.revisao;

public interface ImpostoDeRenda {
	
	public double isento = 1903.98;
	public double faixa1 = 2826.65;
	public double faixa2 = 3751.05;
	public double faixa3 = 4664.68;
	
	public double deducao1 = 142.80;
	public double deducao2 = 354.80;
	public double deducao3 = 636.13;
	public double deducao4 = 869.36;
	
	public double calculaImposto(Funcionario funcionario);
	
	public void proximaFaixa(ImpostoDeRenda proximaFaixa);

}
