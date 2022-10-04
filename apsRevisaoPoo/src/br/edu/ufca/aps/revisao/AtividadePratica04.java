package br.edu.ufca.aps.revisao;

import java.util.ArrayList;

public class AtividadePratica04 {

	//Ve�culo, �nibus e caminh�o
	
	public class Veiculo{
		protected String placa;
		protected int ano;
		
		public Veiculo(String placa, int ano) {
			this.placa = placa;
			this.ano = ano;
		}
		
		public Veiculo() {
			
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public void exibirDados() {
			System.out.println("A placa do ve�culo �: " + this.placa + " e o ano de fabrica��o �: " + this.ano);
		}
	}
	
	
	public class Onibus extends Veiculo{
		private int assentos;
		
		public Onibus(String placa, int ano, int assentos) {
			super(placa, ano);
			this.assentos = assentos;
		}
		
		
		
		public int getAssentos() {
			return assentos;
		}



		public void setAssentos(int assentos) {
			this.assentos = assentos;
		}



		public void exibirDados() {
			System.out.println("A placa do ve�culo �: " + this.placa + " e o ano de fabrica��o �: " + this.ano +
					" a quantidade de assentos �: " + this.assentos);
		}
		
	}
	
	public class Caminhao extends Veiculo{
		private int eixos;
		
		public Caminhao(String placa, int ano, int eixos) {
			super(placa, ano);
			this.eixos = eixos;
		}
		
		public int getEixos() {
			return eixos;
		}


		public void setEixos(int eixos) {
			this.eixos = eixos;
		}


		public void exibirDados() {
			System.out.println("A placa do ve�culo �: " + this.placa + " e o ano de fabrica��o �: " + this.ano +
					" a quantidade de eixos �: " + this.eixos);
		}
		
	}
	
	public class TestaVeiculo{
		public void main(String[] args) {
			ArrayList<Veiculo> veiculos = new ArrayList<AtividadePratica04.Veiculo>();
			veiculos.add(new Veiculo("XPO-0897", 2015));
			veiculos.add(new Veiculo("ABC-1234", 2022));
			veiculos.add(new Veiculo("POT-8534", 2021));
			
			veiculos.add(new Onibus("POT-8534", 2021, 34));
			
			ArrayList<Caminhao> caminhoes = new ArrayList<AtividadePratica04.Caminhao>();
			veiculos.add(new Caminhao("NBG-3456", 2018, 6));
			
			for(Veiculo veiculo: veiculos) {
				veiculo.exibirDados();
			}
			
			for(Caminhao caminhao: caminhoes) {
				caminhao.exibirDados();
			}
			
			
		}
	}
	
	/*
	 * A instru��o �acelerar� � a mesma para os diferentes tipos de ve�culos 
	 * M�todos sobrecarregados s�o escritos com o mesmo nome, mas com uma lista de
	 * argumentos diferente. Assim como com os tipos de retorno, m�todos
	 * sobrecarregados podem ter modificadores de acesso diferentes. Uma classe pode
	 * fazer a sobrecarga nos m�todos que foram declarados dentro dela e tamb�m nos
	 * m�todos herdados. M�todos sobrecarregados devem possuir o mesmo nome. M�todos
	 * sobrecarregados devem possuir listas de par�metros diferentes. M�todos
	 * sobrecarregados podem ter modificadores de acesso e tipos de retorno
	 * diferentes, mas ele n�o podem ser usados para diferenciar um m�todo do outro.
	 * 
	 * 
	 */

	public void acelerar(Onibus onibus) {

	}

	public void acelerar(Caminhao caminhao) {

	}
}
